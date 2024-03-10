"""
latest code:
auth_code=3059ce8fe9c3de2bf9086ab7f9dd3fd2a81ddc17

{'code': 0, 'message': 'OK', 'request_id': '202403101824500AE7DF4AEE995ADBB70D', 'data': {'access_token': '8b2ab18d83bd5895d8230b3dcfdcf2bb4f087daa', 'expires_in': 86399, 'refresh_token': 'df8dc44841cf8100a5c6fe1ead63dcf282c5f645', 'refresh_token_expires_in': 2591999}}

date:20240310
"""
import requests

# 该页面只需要：1.授权码、2.应用的APP_ID即可
# 授权了一次以后，就立刻保存生成的信息，一定不要再运行第二次
# 授权了一次以后，就立刻保存生成的信息，一定不要再运行第二次
# 授权了一次以后，就立刻保存生成的信息，一定不要再运行第二次


def get_access_token() -> any:
    open_api_url_prefix = "https://ad.oceanengine.com/open_api/"
    uri = "oauth2/access_token/"
    url = open_api_url_prefix + uri
    data = {
        "app_id": 1787637136689193,
        "secret": "2b7dd8c1b33bcd9fef991b870b40a556e633df61",
        "grant_type": "auth_code",
        "auth_code": "3059ce8fe9c3de2bf9086ab7f9dd3fd2a81ddc17"
    }
    rsp = requests.post(url, json=data)
    rsp_data = rsp.json()
    print(rsp_data)
    return rsp_data

if __name__ == "__main__":
    get_access_token()