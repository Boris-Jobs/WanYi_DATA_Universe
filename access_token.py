"""
latest code:
auth_code=cb790751c8556aa6b920aa8627780459b4166b6b
"""
def get_access_token():
    open_api_url_prefix = "https://ad.oceanengine.com/open_api/"
    uri = "oauth2/access_token/"
    url = open_api_url_prefix + uri
    data = {
        "app_id": 1787489176384537,
        "secret": "bedde394aa3b078e31b84061a8bcfbc743cd89e7",
        "grant_type": "auth_code",
        "auth_code": "cb790751c8556aa6b920aa8627780459b4166b6b"
    }
    rsp = requests.post(url, json=data)
    rsp_data = rsp.json()
    print(rsp_data)
    return rsp_data

if __name__=="__main__":
    get_access_token()