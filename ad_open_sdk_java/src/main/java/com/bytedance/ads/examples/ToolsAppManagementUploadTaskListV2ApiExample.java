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
import com.bytedance.ads.api.ToolsAppManagementUploadTaskListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskListV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskListV2Filtering;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/upload_task/list/ GET
public class ToolsAppManagementUploadTaskListV2ApiExample {

    private static final ToolsAppManagementUploadTaskListV2Api api = new ToolsAppManagementUploadTaskListV2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        ToolsAppManagementUploadTaskListV2AccountType accountType = null;
        ToolsAppManagementUploadTaskListV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementUploadTaskListV2Response response = api.openApi2ToolsAppManagementUploadTaskListGet(accountId, accountType, filtering);
        System.out.println(response);
    }

}