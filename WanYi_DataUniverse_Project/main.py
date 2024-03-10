# coding=utf-8
import json
import requests
import datetime
from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse
import os

current_dir = os.getcwd()
os.chdir(r"C:\Users\EDY\GitHub\WanYi_DATA_Universe\OceanengineAPI")

from _refresh_token import load_tokens_from_file

# 每次自动生成新的token
ACCESS_TOKEN, refresh_token = load_tokens_from_file()

PATH_ADVERTISER = "/qianchuan/report/advertiser/get/"
PATH_LIVE = "/open_api/v1.0/qianchuan/report/live/get/"

today = datetime.date.today()
yesterday = today - datetime.timedelta(days=1)
ndaysago = today - datetime.timedelta(days=5)
start_date_ad = ndaysago.strftime("%Y-%m-%d")
end_date_ad = yesterday.strftime("%Y-%m-%d")

start_time_live = ndaysago.strftime("%Y-%m-%d 00:00:00")
end_time_live = yesterday.strftime("%Y-%m-%d 23:59:59")

def build_url(path, query=""):
    return urlunparse(("https", "ad.oceanengine.com/open_api/v1.0", path, "", query, ""))

def get(json_str, path):
    args = json.loads(json_str)
    query_string = urlencode({k: v if isinstance(v, string_types) else json.dumps(v) for k, v in args.items()})
    url = build_url(path, query_string)
    headers = {"Access-Token": ACCESS_TOKEN}
    rsp = requests.get(url, headers=headers)

    try:
        rsp.raise_for_status()
        return rsp.json()
    except requests.exceptions.HTTPError as errh:
        print ("HTTP Error:",errh)
    except requests.exceptions.ConnectionError as errc:
        print ("Error Connecting:",errc)
    except requests.exceptions.Timeout as errt:
        print ("Timeout Error:",errt)
    except requests.exceptions.RequestException as err:
        print ("OOps: Something Else",err)
        
    print("Response Text:", rsp.text)
    return None


def generate_ad_args(advertiser_id, start_date_ad, end_date_ad):
    return {
        "advertiser_id": str(advertiser_id),
        "start_date_ad": start_date_ad,
        "end_date_ad": end_date_ad,
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

def generate_live_args(advertiser_id, aweme_id, fields_list):
    fields = json.dumps(fields_list)
    return {
        "advertiser_id": advertiser_id,
        "aweme_id": aweme_id,
        "start_time_live": start_time_live,
        "end_time_live": end_time_live,
        "fields": fields
    }

if __name__ == '__main__':
    advertisers_info_ad = {
        "小熊": 1782904022538252,
        "雷鸟1+2": 1757067277453327,
        "TCL空调": 1726906985781248,
        "雷鸟3": 1757067277453327,
        "TCL冰箱": 1760485701945348,
        "TCL洗衣机": 1733424467898380,
        "天然博士": 1753269359988803
    }

    advertisers_info_live = {
        "小熊": {"advertiser_id": 1782904022538252, "aweme_id": 3184613825708974},
        "雷鸟1+2": {"advertiser_id": 1757067277453327, "aweme_id": 3637645348186535},
        "雷鸟2": {"advertiser_id": 1757067277453327, "aweme_id": 52302947396},
        "TCL空调": {"advertiser_id": 1726906985781248, "aweme_id": 421835258726919},
        "雷鸟3": {"advertiser_id": 1757067277453327, "aweme_id": 1684925512700927},
        "TCL冰箱": {"advertiser_id": 1760485701945348, "aweme_id": 59620235049},
        "TCL洗衣机": {"advertiser_id": 1733424467898380, "aweme_id": 1601309836879312},
        "天然博士": {"advertiser_id": 1753269359988803, "aweme_id": 1877555495835464},
    }

    fields_list_live = ["stat_cost", "cpm_platform", "click_cnt"]

    all_ad_data = {}
    all_live_data = {}

    for advertiser_name, advertiser_id in advertisers_info_ad.items():
        args_ad = generate_ad_args(advertiser_id, start_date_ad, end_date_ad)
        json_str_ad = json.dumps(args_ad)
        result_ad = get(json_str_ad, PATH_ADVERTISER)

        all_ad_data[advertiser_name] = result_ad

    for advertiser_name, info in advertisers_info_live.items():
        args_live = generate_live_args(info["advertiser_id"], info["aweme_id"], fields_list_live)
        json_str_live = json.dumps(args_live)
        result_live = get(json_str_live, PATH_LIVE)

        all_live_data[advertiser_name] = result_live

    with open('GET_ad_data.json', 'w', encoding='utf-8') as json_file_ad:
        json.dump(all_ad_data, json_file_ad, ensure_ascii=False, indent=2)

    with open("GET_live_data.json", "w", encoding="utf-8") as json_file_live:
        json.dump(all_live_data, json_file_live, ensure_ascii=False, indent=2)

    print('All data retrieved and saved in "GET_ad_data.json" and "GET_live_data.json".')
