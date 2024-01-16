import json
def get_auth_account():
    import requests
    open_api_url_prefix = "https://ad.oceanengine.com/open_api/"
    uri = "oauth2/advertiser/get/"
    url = open_api_url_prefix + uri
    data = {
        "app_id": 1787637136689193,
        "secret": "2b7dd8c1b33bcd9fef991b870b40a556e633df61",
        "access_token": "4ab9802b564dbef527e02b15e8b77a66f9c6d48d"
    }
    rsp = requests.get(url, json=data)
    rsp_data = rsp.json()
    with open('GET_auth_account.json','w',encoding='utf-8') as json_file:
        json.dump(rsp.json(),json_file,ensure_ascii=False,indent=2)
    return rsp_data

if __name__=='__main__':
    get_auth_account()