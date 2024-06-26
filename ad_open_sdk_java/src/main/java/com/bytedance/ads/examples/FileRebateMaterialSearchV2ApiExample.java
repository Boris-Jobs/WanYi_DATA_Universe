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
import com.bytedance.ads.api.FileRebateMaterialSearchV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileRebateMaterialSearchV2Filtering;
import com.bytedance.ads.model.FileRebateMaterialSearchV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/rebate/material_search/ GET
public class FileRebateMaterialSearchV2ApiExample {

    private static final FileRebateMaterialSearchV2Api api = new FileRebateMaterialSearchV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        String period = null;
        FileRebateMaterialSearchV2Filtering filtering = null;
        String cursor = null;
        Integer count = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileRebateMaterialSearchV2Response response = api.openApi2FileRebateMaterialSearchGet(agentId, period, filtering, cursor, count, page, pageSize);
        System.out.println(response);
    }

}