# coding=utf-8
import json
import requests

from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse  # noqa

ACCESS_TOKEN = "d9f6ef0658f4e8703b6a760817f7d070f6a2d7fe"
PATH = "/open_api/v1.0/qianchuan/report/live/get/"

"app_id": 1787637136689193,
        "secret": "2b7dd8c1b33bcd9fef991b870b40a556e633df61",

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
    advertiser_id = 82670747
    aweme_id = AWEME_ID
    start_time = START_TIME
    end_time = END_TIME
    fields_list = FIELDS
    fields = json.dumps(fields_list)

    # Args in JSON format
    my_args = "{\"advertiser_id\": \"%s\", \"aweme_id\": \"%s\", \"start_time\": \"%s\", \"end_time\": \"%s\", \"fields\": %s, \"stats_authority\": \"%s\"}" % (
    advertiser_id, aweme_id, start_time, end_time, fields, stats_authority)
    print(get(my_args))
