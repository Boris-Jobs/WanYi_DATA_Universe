# hi, there is a new change.

# Now, let's start by githubdesktop.
"""
    with open('formatted_output.json', 'w', encoding='utf-8') as json_file:
        json.dump(rsp_data, json_file, ensure_ascii=False, indent=2)
"""
import requests
import json

# coding=utf-8
import json
import requests

from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse  # noqa

ACCESS_TOKEN = "d9f6ef0658f4e8703b6a760817f7d070f6a2d7fe"
PATH = "/qianchuan/aweme/authorized/get/"


def build_url(path, query=""):
    return urlunparse(("https", "ad.oceanengine.com/open_api/v1.0", path, "", query, ""))


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
    my_args = "{\"advertiser_id\": 1753269359988803}"
    with open('tiktok_id_test.json', 'w', encoding='utf-8') as json_file:
        json.dump(get(my_args), json_file, ensure_ascii=False, indent=2)
