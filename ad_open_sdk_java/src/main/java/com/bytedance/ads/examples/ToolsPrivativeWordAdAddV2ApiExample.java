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
import com.bytedance.ads.api.ToolsPrivativeWordAdAddV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2Request;
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/privative_word/ad/add/ POST
public class ToolsPrivativeWordAdAddV2ApiExample {

    private static final ToolsPrivativeWordAdAddV2Api api = new ToolsPrivativeWordAdAddV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsPrivativeWordAdAddV2Request toolsPrivativeWordAdAddV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPrivativeWordAdAddV2Response response = api.openApi2ToolsPrivativeWordAdAddPost(toolsPrivativeWordAdAddV2Request);
        System.out.println(response);
    }

}