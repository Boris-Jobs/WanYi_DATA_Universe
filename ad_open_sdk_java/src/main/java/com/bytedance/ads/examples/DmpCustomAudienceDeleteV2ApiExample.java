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
import com.bytedance.ads.api.DmpCustomAudienceDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DmpCustomAudienceDeleteV2Request;
import com.bytedance.ads.model.DmpCustomAudienceDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dmp/custom_audience/delete/ POST
public class DmpCustomAudienceDeleteV2ApiExample {

    private static final DmpCustomAudienceDeleteV2Api api = new DmpCustomAudienceDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        DmpCustomAudienceDeleteV2Request dmpCustomAudienceDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DmpCustomAudienceDeleteV2Response response = api.openApi2DmpCustomAudienceDeletePost(dmpCustomAudienceDeleteV2Request);
        System.out.println(response);
    }

}