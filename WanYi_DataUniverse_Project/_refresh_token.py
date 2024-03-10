import requests

TOKEN_FILE = "_refresh_token.txt"

def refresh_access_token():
    open_api_url_prefix = "https://ad.oceanengine.com/open_api/"
    uri = "oauth2/refresh_token/"
    
    # 加载 refresh token
    access_token, refresh_token = load_tokens_from_file()
    if not refresh_token:
        print("Refresh token not found in file.")
        return None

    refresh_token_url = open_api_url_prefix + uri
    data = {
        "appid": 1787637136689193,
        "secret": "2b7dd8c1b33bcd9fef991b870b40a556e633df61",
        "grant_type": "refresh_token",
        "refresh_token": refresh_token,
    }

    rsp = requests.post(refresh_token_url, json=data)
    rsp_data = rsp.json()
    print(rsp_data)  # 添加这行以输出结果

    # 保存 access token 和 refresh token 到文件
    with open(TOKEN_FILE, 'w') as f:
        f.write(f"Access Token: {rsp_data['data']['access_token']}\n")
        f.write(f"Refresh Token: {rsp_data['data']['refresh_token']}\n")

    return rsp_data

def load_tokens_from_file():
    try:
        with open(TOKEN_FILE, 'r') as f:
            lines = f.readlines()
            access_token = lines[0].split(': ')[1].strip()
            refresh_token = lines[1].split(': ')[1].strip()
            return access_token, refresh_token
    except FileNotFoundError:
        return None, None

if __name__ == "__main__":
    access_token, refresh_token = load_tokens_from_file()

    if not access_token or not refresh_token:
        # 文件中没有token，或者文件不存在，进行刷新
        response_data = refresh_access_token()
        access_token = response_data['data']['access_token']
        refresh_token = response_data['data']['refresh_token']
    else:
        print("Tokens loaded from file.")

    # 在这里使用 access_token 进行后续操作
    print("Access Token:", access_token)
    print("Refresh Token:", refresh_token)
