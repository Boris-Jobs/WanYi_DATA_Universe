"""
latest output of access_token.py:
{'code': 0, 'message': 'OK', 'request_id': '202401111036492FC18349ADD658128F57',
'data': {'access_token': 'd9f6ef0658f4e8703b6a760817f7d070f6a2d7fe', 'expires_in': 86399,
'refresh_token': 'fb7f599888e0f79235100bcdeb3fe6a6b379e46f',
'refresh_token_expires_in': 2591999}}

11 Jan 2024
command to change venv to localenv: deactivate
"""
import requests
def refresh_access_token():

    open_api_url_prefix = "https://ad.oceanengine.com/open_api/"
    uri = "oauth2/refresh_token/"
    refresh_token_url = open_api_url_prefix + uri
    data = {
        "appid": 1787637136689193,
        "secret": "2b7dd8c1b33bcd9fef991b870b40a556e633df61",
        "grant_type": "refresh_token",
        "refresh_token": "fb7f599888e0f79235100bcdeb3fe6a6b379e46f",
    }
    rsp = requests.post(refresh_token_url, json=data)
    rsp_data = rsp.json()
    print(rsp_data)  # 添加这行以输出结果
    return rsp_data

if __name__=="__main__":
    refresh_access_token()