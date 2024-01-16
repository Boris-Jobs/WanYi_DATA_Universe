
# coding=utf-8
import json
import requests

from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse  # noqa

ACCESS_TOKEN = "4ab9802b564dbef527e02b15e8b77a66f9c6d48d"
PATH = "/qianchuan/aweme/authorized/get/"


def build_url(path, query=""):
    return urlunparse(("https","ad.oceanengine.com/open_api/v1.0", path, "", query, ""))

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
    # Args in JSON format
    my_args_xiaoxiong =  "{\"advertiser_id\": \"1782904022538252\"}"
    my_args_ffalcon = "{\"advertiser_id\":\"1757067277453327\"}"
    my_args_kongtiao = "{\"advertiser_id\":\"1726906985781248\"}"
    my_args_bingxiang = "{\"advertiser_id\":\"1760485701945348\"}"
    my_args_ffalcon3 = "{\"advertiser_id\":\"1757067277453327\"}"
    my_args_xiyiji = "{\"advertiser_id\":\"1733424467898380\"}"
    my_args_tianranboshi = "{\"advertiser_id\":\"1753269359988803\"}"
    my_args_shenghuodianqi = "{\"advertiser_id\":\"1734404969104392\"}"

    combined_data = {"xiaoxiong":get(my_args_xiaoxiong),
                     "tianranboshi":get(my_args_tianranboshi),
                     "kongtiao":get(my_args_kongtiao),
                     "ffalcon":get(my_args_ffalcon),
                     "bingxiang":get(my_args_bingxiang),
                     "xiyiji":get(my_args_xiyiji),
                     "shenghuodianqi":get(my_args_shenghuodianqi),
                     "ffalcon3":get(my_args_ffalcon3)}
    with open('GET_aweme_id.json','w',encoding='utf-8') as json_file:
        json.dump(combined_data,json_file,ensure_ascii=False,indent=2)
    
