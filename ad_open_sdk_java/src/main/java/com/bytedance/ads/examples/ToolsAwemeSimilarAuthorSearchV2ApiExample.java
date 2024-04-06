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
import com.bytedance.ads.api.ToolsAwemeSimilarAuthorSearchV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAwemeSimilarAuthorSearchV2Behaviors;
import com.bytedance.ads.model.ToolsAwemeSimilarAuthorSearchV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/aweme_similar_author_search/ GET
public class ToolsAwemeSimilarAuthorSearchV2ApiExample {

    private static final ToolsAwemeSimilarAuthorSearchV2Api api = new ToolsAwemeSimilarAuthorSearchV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String awemeId = null;
        List<ToolsAwemeSimilarAuthorSearchV2Behaviors> behaviors = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAwemeSimilarAuthorSearchV2Response response = api.openApi2ToolsAwemeSimilarAuthorSearchGet(advertiserId, awemeId, behaviors);
        System.out.println(response);
    }

}