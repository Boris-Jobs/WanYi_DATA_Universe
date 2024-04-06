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
import com.bytedance.ads.api.EnterpriseVideoInfoGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EnterpriseVideoInfoGetV10Filter;
import com.bytedance.ads.model.EnterpriseVideoInfoGetV10OrderType;
import com.bytedance.ads.model.EnterpriseVideoInfoGetV10Response;
import com.bytedance.ads.model.EnterpriseVideoInfoGetV10TimeDimension;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/enterprise/video/info/get/ GET
public class EnterpriseVideoInfoGetV10ApiExample {

    private static final EnterpriseVideoInfoGetV10Api api = new EnterpriseVideoInfoGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endTime = null;
        List<String> fields = null;
        EnterpriseVideoInfoGetV10Filter filter = null;
        String lastEndTime = null;
        String lastStartTime = null;
        Long limit = null;
        Long offset = null;
        String orderField = null;
        EnterpriseVideoInfoGetV10OrderType orderType = null;
        List<String> ratioFields = null;
        String startTime = null;
        EnterpriseVideoInfoGetV10TimeDimension timeDimension = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EnterpriseVideoInfoGetV10Response response = api.openApiV10EnterpriseVideoInfoGetGet(advertiserId, endTime, fields, filter, lastEndTime, lastStartTime, limit, offset, orderField, orderType, ratioFields, startTime, timeDimension);
        System.out.println(response);
    }

}