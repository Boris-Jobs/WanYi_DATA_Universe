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
import com.bytedance.ads.api.ToolsInterestActionId2wordV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsInterestActionId2wordV2ActionDays;
import com.bytedance.ads.model.ToolsInterestActionId2wordV2Response;
import com.bytedance.ads.model.ToolsInterestActionId2wordV2TagType;
import com.bytedance.ads.model.ToolsInterestActionId2wordV2TargetingType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/interest_action/id2word/ GET
public class ToolsInterestActionId2wordV2ApiExample {

    private static final ToolsInterestActionId2wordV2Api api = new ToolsInterestActionId2wordV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsInterestActionId2wordV2ActionDays actionDays = null;
        Long advertiserId = null;
        List<Long> ids = null;
        ToolsInterestActionId2wordV2TagType tagType = null;
        ToolsInterestActionId2wordV2TargetingType targetingType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsInterestActionId2wordV2Response response = api.openApi2ToolsInterestActionId2wordGet(actionDays, advertiserId, ids, tagType, targetingType);
        System.out.println(response);
    }

}