# coding=utf-8
import json
import requests

from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse  # noqa

ACCESS_TOKEN = "d9f6ef0658f4e8703b6a760817f7d070f6a2d7fe"
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


if __name__ == '__main__':
    advertiser_id = 1753269359988803
    aweme_id = 1877555495835464
    start_time = "2024-01-11 00:00:00"
    end_time = "2024-01-11 19:00:00"
    fields_list = ["stat_cost","cpm_platform","click_cnt"]
    fields = json.dumps(fields_list)

    # Args in JSON format
    my_args = ("{\"advertiser_id\": \"%s\", \"aweme_id\": \"%s\", \"start_time\": \"%s\", \"end_time\": \"%s\", \"fields\": %s}"
               % (advertiser_id, aweme_id, start_time, end_time, fields))
    print(get(my_args))
    with open("live_data.json", "w", encoding="utf-8") as f:
        json.dump(get(my_args), f, ensure_ascii=False, indent=2)
