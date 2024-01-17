import json
from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse
import requests
import datetime

import os #规定当前工作路径，使生成的json文件在当前的路径
current_dir = os.getcwd()
os.chdir(r"C:\Users\EDY\GitHub\WanYi_DATA_Universe\OceanengineAPI")

from _refresh_token import load_tokens_from_file #每次自动生成新的token
ACCESS_TOKEN, refresh_token = load_tokens_from_file()
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
        "小熊": 1782904022538252,
        "雷鸟1+2": 1757067277453327,
        "TCL空调": 1726906985781248,
        "雷鸟3": 1757067277453327,
        "TCL冰箱": 1760485701945348,
        "TCL洗衣机": 1733424467898380,
        "天然博士": 1753269359988803
    }

    today = datetime.date.today()
    yesterday = today - datetime.timedelta(days=1)
    ndaysago = today - datetime.timedelta(days=5)

    start_date = ndaysago.strftime("%Y-%m-%d")
    end_date = yesterday.strftime("%Y-%m-%d")

    all_ad_data = {}  # 用于存储所有广告主的数据

    for advertiser_name, advertiser_id in advertisers_info.items():
        args = generate_args(advertiser_id, start_date, end_date)
        json_str = json.dumps(args)
        result = get(json_str)

        all_ad_data[advertiser_name] = result

    with open('GET_ad_data.json', 'w', encoding='utf-8') as json_file:
        json.dump(all_ad_data, json_file, ensure_ascii=False, indent=2)

    print('All data retrieved and saved in "GET_ad_data.json".')
