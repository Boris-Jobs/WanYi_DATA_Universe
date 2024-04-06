/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAdvertiserTypeGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdvertiserTypeGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/advertiser/type/get/ GET
public class QianchuanAdvertiserTypeGetV10ApiExample {

    private static final QianchuanAdvertiserTypeGetV10Api api = new QianchuanAdvertiserTypeGetV10Api();

    public static void main(String[] args) throws ApiException {
        List<Long> advertiserIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdvertiserTypeGetV10Response response = api.openApiV10QianchuanAdvertiserTypeGetGet(advertiserIds);
        System.out.println(response);
    }

}