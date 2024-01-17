# coding=utf-8
import json
import requests

import datetime
from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse  # noqa

import os #规定当前工作路径，使生成的json文件在当前的路径
current_dir = os.getcwd()
os.chdir(r"C:\Users\EDY\GitHub\WanYi_DATA_Universe\OceanengineAPI")

from _refresh_token import load_tokens_from_file #每次自动生成新的token
ACCESS_TOKEN, refresh_token = load_tokens_from_file()

PATH = "/open_api/v1.0/qianchuan/report/live/get/"
today = datetime.date.today()
yesterday = today - datetime.timedelta(days=1)
ndaysago = today - datetime.timedelta(days=5)
start_time = ndaysago.strftime("%Y-%m-%d 00:00:00")
end_time = yesterday.strftime("%Y-%m-%d 23:59:59")


def build_url(path, query=""):
    scheme, netloc = "https", "api.oceanengine.com"
    return urlunparse((scheme, netloc, path, "", query, ""))


def get(json_str):
    args = json.loads(json_str)
    query_string = urlencode({k: v if isinstance(v, string_types) else json.dumps(v) for k, v in args.items()})
    url = build_url(PATH, query_string)
    headers = {
        "Access-Token": ACCESS_TOKEN,
    }
    rsp = requests.get(url, headers=headers)
    return rsp.json()


def generate_args(advertiser_id, aweme_id, start_time, end_time, fields_list):
    fields = json.dumps(fields_list)
    return get(json.dumps({
        "advertiser_id": advertiser_id,
        "aweme_id": aweme_id,
        "start_time": start_time,
        "end_time": end_time,
        "fields": fields
    }))


if __name__ == '__main__':
    advertisers_info = {
        "小熊": {"advertiser_id": 1782904022538252, "aweme_id": 3184613825708974},
        "雷鸟1+2": {"advertiser_id": 1757067277453327, "aweme_id": 3637645348186535},
        "雷鸟2": {"advertiser_id": 1757067277453327, "aweme_id": 52302947396},
        "TCL空调": {"advertiser_id": 1726906985781248, "aweme_id": 421835258726919},
        "雷鸟3": {"advertiser_id": 1757067277453327, "aweme_id": 1684925512700927},
        "TCL冰箱": {"advertiser_id": 1760485701945348, "aweme_id": 59620235049},
        "TCL洗衣机": {"advertiser_id": 1733424467898380, "aweme_id": 1601309836879312},
        "天然博士": {"advertiser_id": 1753269359988803, "aweme_id": 1877555495835464},
    }

    fields_list = ["stat_cost", "cpm_platform", "click_cnt","live_pay_order_gmv_alias","total_live_watch_cnt","total_live_watch_cnt"]

    combined_data = {}

    for advertiser_name, info in advertisers_info.items():
        my_args = generate_args(info["advertiser_id"], info["aweme_id"], start_time, end_time, fields_list)
        combined_data[advertiser_name] = my_args

    with open("GET_live_data.json", "w", encoding="utf-8") as f:
        json.dump(combined_data, f, ensure_ascii=False, indent=2)

    print('All data retrieved and saved in "GET_live_data.json".')