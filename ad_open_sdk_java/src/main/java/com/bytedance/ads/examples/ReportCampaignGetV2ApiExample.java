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
import com.bytedance.ads.api.ReportCampaignGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCampaignGetV2Filtering;
import com.bytedance.ads.model.ReportCampaignGetV2GroupBy;
import com.bytedance.ads.model.ReportCampaignGetV2OrderField;
import com.bytedance.ads.model.ReportCampaignGetV2OrderType;
import com.bytedance.ads.model.ReportCampaignGetV2Response;
import com.bytedance.ads.model.ReportCampaignGetV2TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/campaign/get/ GET
public class ReportCampaignGetV2ApiExample {

    private static final ReportCampaignGetV2Api api = new ReportCampaignGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        List<String> fields = null;
        ReportCampaignGetV2Filtering filtering = null;
        List<ReportCampaignGetV2GroupBy> groupBy = null;
        ReportCampaignGetV2OrderField orderField = null;
        ReportCampaignGetV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startDate = null;
        ReportCampaignGetV2TimeGranularity timeGranularity = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCampaignGetV2Response response = api.openApi2ReportCampaignGetGet(advertiserId, endDate, fields, filtering, groupBy, orderField, orderType, page, pageSize, startDate, timeGranularity);
        System.out.println(response);
    }

}