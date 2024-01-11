"""
latest code:
auth_code=914faaec6c363e49a0427331c631b4c28bbe91a3
date:20240111
"""
import requests
def get_access_token():
    open_api_url_prefix = "https://ad.oceanengine.com/open_api/"
    uri = "oauth2/access_token/"
    url = open_api_url_prefix + uri
    data = {
        "app_id": 1787637136689193,
        "secret": "2b7dd8c1b33bcd9fef991b870b40a556e633df61",
        "grant_type": "auth_code",
        "auth_code": "914faaec6c363e49a0427331c631b4c28bbe91a3"
    }
    rsp = requests.post(url, json=data)
    rsp_data = rsp.json()
    print(rsp_data)
    return rsp_data

if __name__=="__main__":
    get_access_token()