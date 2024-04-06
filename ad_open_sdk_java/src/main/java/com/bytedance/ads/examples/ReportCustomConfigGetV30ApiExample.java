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
import com.bytedance.ads.api.ReportCustomConfigGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCustomConfigGetV30DataTopics;
import com.bytedance.ads.model.ReportCustomConfigGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/custom/config/get/ GET
public class ReportCustomConfigGetV30ApiExample {

    private static final ReportCustomConfigGetV30Api api = new ReportCustomConfigGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<ReportCustomConfigGetV30DataTopics> dataTopics = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCustomConfigGetV30Response response = api.openApiV30ReportCustomConfigGetGet(advertiserId, dataTopics);
        System.out.println(response);
    }

}