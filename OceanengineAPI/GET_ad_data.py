import json
from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse
import requests

ACCESS_TOKEN = "4ab9802b564dbef527e02b15e8b77a66f9c6d48d"
PATH = "/qianchuan/report/advertiser/get/"

def build_url(path, query=""):
    return urlunparse(("https", "ad.oceanengine.com/open_api/v1.0", path, "", query, ""))

def get(json_str):
    args = json.loads(json_str)
    query_string = urlencode({k: v if isinstance(v, string_types) else json.dumps(v) for k, v in args.items()})
    url = build_url(PATH, query_string)
    headers = {"Access-Token": ACCESS_TOKEN}
    rsp = requests.get(url, headers=headers)
    return rsp.json()

def generate_args(advertiser_id, start_date, end_date):
    return {
        "advertiser_id": str(advertiser_id),
        "start_date": start_date,
        "end_date": end_date,
        "time_granularity": "TIME_GRANULARITY_DAILY",
        "fields": [
            "stat_cost", "show_cnt", "ctr", "cpm_platform", "click_cnt",
            "prepay_and_pay_order_roi", "all_order_pay_roi_7days", "all_order_pay_gmv_7days"
        ],
        "order_field": "stat_cost",
        "page": "1",
        "page_size": "20",
        "filtering": {"marketing_goal": "LIVE_PROM_GOODS", "order_platform": "QIANCHUAN"}
    }

if __name__ == '__main__':
    advertisers_info = {
        "xiaoxiong": 1782904022538252,
        "ffalcon": 1757067277453327,
        "kongtiao": 1726906985781248,
        "ffalcon3": 1757067277453327,
        "bingxiang": 1760485701945348,
        "xiyiji": 1733424467898380,
        "tianranboshi": 1753269359988803
    }

    start_date = "2024-01-15"
    end_date = "2024-01-16"

    all_ad_data = {}  # 用于存储所有广告主的数据

    for advertiser_name, advertiser_id in advertisers_info.items():
        args = generate_args(advertiser_id, start_date, end_date)
        json_str = json.dumps(args)
        result = get(json_str)

        all_ad_data[advertiser_name] = result

    with open('GET_ad_data.json', 'w', encoding='utf-8') as json_file:
        json.dump(all_ad_data, json_file, ensure_ascii=False, indent=2)

    print('All data retrieved and saved in "all_ad_data.json".')
