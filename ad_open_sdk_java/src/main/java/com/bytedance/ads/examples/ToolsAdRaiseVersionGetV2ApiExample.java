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
import com.bytedance.ads.api.ToolsAdRaiseVersionGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdRaiseVersionGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ad_raise_version/get/ GET
public class ToolsAdRaiseVersionGetV2ApiExample {

    private static final ToolsAdRaiseVersionGetV2Api api = new ToolsAdRaiseVersionGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long adId = null;
        Long advertiserId = null;
        Long pageSize = null;
        Long page = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdRaiseVersionGetV2Response response = api.openApi2ToolsAdRaiseVersionGetGet(adId, advertiserId, pageSize, page);
        System.out.println(response);
    }

}