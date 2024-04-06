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


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.ClueCouponGetV2ActivityTypes;
import com.bytedance.ads.model.ClueCouponGetV2IsDel;
import com.bytedance.ads.model.ClueCouponGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClueCouponGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ClueCouponGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ClueCouponGetV2Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for openApi2ClueCouponGetGet
     * @param activityIds  (optional)
     * @param activityTypes  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param isDel  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ClueCouponGetGetCall(List<Long> activityIds, List<ClueCouponGetV2ActivityTypes> activityTypes, Long advertiserId, String endTime, ClueCouponGetV2IsDel isDel, Long page, Long pageSize, String startTime, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open_api/2/clue/coupon/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (activityIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "activity_ids", activityIds));
        }

        if (activityTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "activity_types", activityTypes));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (isDel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("is_del", isDel));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2ClueCouponGetGetValidateBeforeCall(List<Long> activityIds, List<ClueCouponGetV2ActivityTypes> activityTypes, Long advertiserId, String endTime, ClueCouponGetV2IsDel isDel, Long page, Long pageSize, String startTime, final ApiCallback _callback) throws ApiException {
        return openApi2ClueCouponGetGetCall(activityIds, activityTypes, advertiserId, endTime, isDel, page, pageSize, startTime, _callback);

    }

    /**
     * 
     * 
     * @param activityIds  (optional)
     * @param activityTypes  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param isDel  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @return ClueCouponGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ClueCouponGetV2Response openApi2ClueCouponGetGet(List<Long> activityIds, List<ClueCouponGetV2ActivityTypes> activityTypes, Long advertiserId, String endTime, ClueCouponGetV2IsDel isDel, Long page, Long pageSize, String startTime) throws ApiException {
        ApiResponse<ClueCouponGetV2Response> localVarResp = openApi2ClueCouponGetGetWithHttpInfo(activityIds, activityTypes, advertiserId, endTime, isDel, page, pageSize, startTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param activityIds  (optional)
     * @param activityTypes  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param isDel  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @return ApiResponse&lt;ClueCouponGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClueCouponGetV2Response> openApi2ClueCouponGetGetWithHttpInfo(List<Long> activityIds, List<ClueCouponGetV2ActivityTypes> activityTypes, Long advertiserId, String endTime, ClueCouponGetV2IsDel isDel, Long page, Long pageSize, String startTime) throws ApiException {
        okhttp3.Call localVarCall = openApi2ClueCouponGetGetValidateBeforeCall(activityIds, activityTypes, advertiserId, endTime, isDel, page, pageSize, startTime, null);
        Type localVarReturnType = new TypeToken<ClueCouponGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param activityIds  (optional)
     * @param activityTypes  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param isDel  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ClueCouponGetGetAsync(List<Long> activityIds, List<ClueCouponGetV2ActivityTypes> activityTypes, Long advertiserId, String endTime, ClueCouponGetV2IsDel isDel, Long page, Long pageSize, String startTime, final ApiCallback<ClueCouponGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ClueCouponGetGetValidateBeforeCall(activityIds, activityTypes, advertiserId, endTime, isDel, page, pageSize, startTime, _callback);
        Type localVarReturnType = new TypeToken<ClueCouponGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
