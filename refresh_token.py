"""
latest output of access_token.py:
{'code': 0, 'message': 'OK', 'request_id': '202401092349374E78EEEF3BE989F6FB80', 'data': {
'access_token': '1bdda83fe4da83722962c730aa9422a3a1a58337', 'expires_in': 86399,
'refresh_token': '41fc332ea4a04a479cab88e66067a6e1b4472fee',
'refresh_token_expires_in': 2591999}}

9 Jan 2024, 23:52
command to change venv to localenv: deactivate
"""
import requests
def refresh_access_token():

    open_api_url_prefix = "https://ad.oceanengine.com/open_api/"
    uri = "oauth2/refresh_token/"
    refresh_token_url = open_api_url_prefix + uri
    data = {
        "appid": 1787489176384537,
        "secret": "bedde394aa3b078e31b84061a8bcfbc743cd89e7",
        "grant_type": "refresh_token",
        "refresh_token": "41fc332ea4a04a479cab88e66067a6e1b4472fee",
    }
    rsp = requests.post(refresh_token_url, json=data)
    rsp_data = rsp.json()
    print(rsp_data)  # 添加这行以输出结果
    return rsp_data

if __name__=="__main__":
    refresh_access_token()