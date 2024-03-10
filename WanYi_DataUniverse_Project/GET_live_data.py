# coding=utf-8
import json
import requests

import datetime
from six import string_types
from six.moves.urllib.parse import urlencode, urlunparse  # noqa

import os #规定当前工作路径，使生成的json文件在当前的路径
current_dir = os.getcwd()
os.chdir("C:\\Users\\borisσ\\Desktop\\boris Inc\\_Github\\WanYi_DATA_Universe\\OceanengineAPI")

from _refresh_token import load_tokens_from_file #每次自动生成新的token
ACCESS_TOKEN, refresh_token = load_tokens_from_file()

PATH = "/open_api/v1.0/qianchuan/report/live/get/"
today = datetime.date.today() # 获取今天的日期
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


# ... (same imports and definitions as before)

if __name__ == '__main__':
    advertisers_info = {
        "TCL空调": {"advertiser_id": 1726906985781248, "aweme_id": 421835258726919},
    }

    fields_list = [
        "stat_cost",  # 消耗
        "cpm_platform",  # 平均千次展现费用
        "click_cnt",  # 广告点击次数
        "ctr",  # 广告点击率
        "total_live_pay_order_gpm",  # GPM
        "luban_live_pay_order_gpm",  # 广告GPM
        "cpc_platform",  # 广告点击单价
        "ecp_convert_rate",  # 转化率
        "ecp_convert_cnt",  # 转化数
        "ecp_cpa_platform",  # 转化成本
        "live_pay_order_gmv_alias",  # 累计成交金额
        "luban_live_pay_order_gmv",  # 广告成交金额
        "live_pay_order_gmv_roi",  # 整体ROI，仅支持直客广告主
        "ad_live_prepay_and_pay_order_gmv_roi",  # 广告ROI
        "live_create_order_count_alias",  # 整体下单数
        "live_create_order_rate",  # 整体下单率
        "luban_live_order_count",  # 广告下单数
        "ad_live_create_order_rate",  # 广告下单率
        "live_pay_order_count_alias",  # 整体成单数
        "live_pay_order_rate",  # 整体成单率
        "luban_live_pay_order_count",  # 广告成单数
        "ad_live_pay_order_rate",  # 广告成单率
        "live_pay_order_gmv_avg",  # 直播间平均成单金额
        "ad_live_pay_order_gmv_avg",  # 广告平均成单金额
        "luban_live_prepay_order_count",  # 广告预售订单数
        "luban_live_prepay_order_gmv",  # 广告预售订单金额
        "live_prepay_order_count_alias",  # 整体预售订单数
        "live_prepay_order_gmv_alias",  # 整体预售订单金额
        "live_order_pay_coupon_amount",  # 成交智能优惠券金额
        "total_live_watch_cnt",  # 直播间观看人次
        "total_live_follow_cnt",  # 新增粉丝数
        "live_watch_one_minute_count",  # 广告引导超1分钟观看人数
        "total_live_fans_club_join_cnt",  # 直播间新加团人数
        "live_click_cart_count_alias",  # 直播间查看购物车次数
        "live_click_product_count_alias",  # 直播间商品点击次数
        "total_live_comment_cnt",  # 直播间评论次数
        "total_live_share_cnt",  # 直播间分享次数
        "total_live_gift_cnt",  # 直播间打赏次数
        "total_live_gift_amount",  # 直播间音浪收入
    ]

    combined_data = {}

    for advertiser_name, info in advertisers_info.items():
        daily_data = {}
        for day in range(5):  # Loop for the last 5 days
            ndaysago = today - datetime.timedelta(days=day)
            start_time = ndaysago.strftime("%Y-%m-%d 00:00:00")
            end_time = (ndaysago + datetime.timedelta(days=1) - datetime.timedelta(seconds=1)).strftime("%Y-%m-%d %H:%M:%S")

            my_args = generate_args(info["advertiser_id"], info["aweme_id"], start_time, end_time, fields_list)
            daily_data[ndaysago.strftime("%Y-%m-%d")] = my_args

        combined_data[advertiser_name] = daily_data

    with open("GET_live_data_daily.json", "w", encoding="utf-8") as f:
        json.dump(combined_data, f, ensure_ascii=False, indent=2)

    print('All data retrieved and saved in "GET_live_data_daily.json".')

    # 返回数据，金额相关指标的单位为「千分之一分」
