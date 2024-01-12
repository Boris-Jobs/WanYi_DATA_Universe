"""
latest output of access_token.py:
{'code': 0, 'message': 'OK', 'request_id': '202401120917417EE45D1DFD69DBAA2457',
'data': {'access_token': '15c213fe148dabb5c571484409a50e3597832be0', 'expires_in': 86399,
'refresh_token': 'ae2c8f78f880703a826b3774b5f54906c30468ac',
'refresh_token_expires_in': 2591999}}

12 Jan 2024
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
        "refresh_token": "ae2c8f78f880703a826b3774b5f54906c30468ac",
    }
    rsp = requests.post(refresh_token_url, json=data)
    rsp_data = rsp.json()
    print(rsp_data)  # 添加这行以输出结果
    return rsp_data

if __name__=="__main__":
    refresh_access_token()