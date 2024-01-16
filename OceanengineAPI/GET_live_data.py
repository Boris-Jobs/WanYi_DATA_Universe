# coding=utf-8
import json
import requests

from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse  # noqa

ACCESS_TOKEN = "4ab9802b564dbef527e02b15e8b77a66f9c6d48d"
PATH = "/open_api/v1.0/qianchuan/report/live/get/"


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
        "xiaoxiong": {"advertiser_id": 1782904022538252, "aweme_id": 3184613825708974},
        "ffalcon": {"advertiser_id": 1757067277453327, "aweme_id": 3637645348186535},
        "ffalcon2": {"advertiser_id": 1757067277453327, "aweme_id": 52302947396},
        "kongtiao": {"advertiser_id": 1726906985781248, "aweme_id": 421835258726919},
        "ffalcon3": {"advertiser_id": 1757067277453327, "aweme_id": 1684925512700927},
        "bingxiang": {"advertiser_id": 1760485701945348, "aweme_id": 59620235049},
        "xiyiji": {"advertiser_id": 1733424467898380, "aweme_id": 1601309836879312},
        "tianranboshi": {"advertiser_id": 1753269359988803, "aweme_id": 1877555495835464},
    }

    start_time = "2024-01-15 00:00:00"
    end_time = "2024-01-15 23:00:00"
    fields_list = ["stat_cost", "cpm_platform", "click_cnt"]

    combined_data = {}

    for advertiser_name, info in advertisers_info.items():
        my_args = generate_args(info["advertiser_id"], info["aweme_id"], start_time, end_time, fields_list)
        combined_data[advertiser_name] = my_args

    with open("GET_live_data.json", "w", encoding="utf-8") as f:
        json.dump(combined_data, f, ensure_ascii=False, indent=2)


"""
if __name__ == '__main__':
    # 以下为部门各店铺的千川广告id与抖音id（区别于“抖音显示id”）
    advertiser_id_xiaoxiong = 1782904022538252
    aweme_id_xiaoxiong = 3184613825708974

    advertiser_id_ffalcon = 1757067277453327
    aweme_id_ffalcon = 3637645348186535
    aweme_id_ffalcon2 = 52302947396

    advertiser_id_kongtiao = 1726906985781248
    aweme_id_kongtiao = 421835258726919

    advertiser_id_ffalcon3 = 1757067277453327
    aweme_idffalcon3 = 1684925512700927

    advertiser_id_bingxiang = 1760485701945348
    aweme_id_bingxiang = 59620235049

    advertiser_id_xiyiji = 1733424467898380
    aweme_id_xiyiji = 1601309836879312

    advertiser_id_tianranboshi = 1753269359988803
    aweme_id_tianranboshi = 1877555495835464

    start_time = "2024-01-15 00:00:00"
    end_time = "2024-01-15 23:00:00"
    fields_list = ["stat_cost","cpm_platform","click_cnt"]
    fields = json.dumps(fields_list)

    # Args in JSON format
    my_args_xiaoxiong = get("{\"advertiser_id\": \"%s\", \"aweme_id\": \"%s\", \"start_time\": \"%s\", \"end_time\": \"%s\", \"fields\": %s}"
               % (advertiser_id_xiaoxiong, aweme_id_xiaoxiong, start_time, end_time, fields))
    my_args_ffalcon = get("{\"advertiser_id\": \"%s\", \"aweme_id\": \"%s\", \"start_time\": \"%s\", \"end_time\": \"%s\", \"fields\": %s}"
               % (advertiser_id_ffalcon, aweme_id_ffalcon, start_time, end_time, fields))
    my_args_ffalcon2 = get("{\"advertiser_id\": \"%s\", \"aweme_id\": \"%s\", \"start_time\": \"%s\", \"end_time\": \"%s\", \"fields\": %s}"
               % (advertiser_id_ffalcon, aweme_id_ffalcon2, start_time, end_time, fields))
    combined_data = {"xiaoxiong":my_args_xiaoxiong,
                     "ffalcon":my_args_ffalcon,
                     "ffalcon2":my_args_ffalcon2,
                     "kongtiao":1}
    with open("GET_live_data.json", "w", encoding="utf-8") as f:
        json.dump(combined_data, f, ensure_ascii=False, indent=2)
"""

