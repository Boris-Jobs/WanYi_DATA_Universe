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



import com.bytedance.ads.model.ToolsCommentTermsBannedGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsCommentTermsBannedGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsCommentTermsBannedGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsCommentTermsBannedGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ToolsCommentTermsBannedGetGet
     * @param advertiserId 广告主id (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @param awemeId 抖音号，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @param isApplyToAdv 是否应用于当前账户，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsCommentTermsBannedGetGetCall(Long advertiserId, Long page, Long pageSize, String awemeId, Boolean isApplyToAdv, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/tools/comment/terms_banned/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (awemeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_id", awemeId));
        }

        if (isApplyToAdv != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("is_apply_to_adv", isApplyToAdv));
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
    private okhttp3.Call openApiV30ToolsCommentTermsBannedGetGetValidateBeforeCall(Long advertiserId, Long page, Long pageSize, String awemeId, Boolean isApplyToAdv, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ToolsCommentTermsBannedGetGet(Async)");
        }

        return openApiV30ToolsCommentTermsBannedGetGetCall(advertiserId, page, pageSize, awemeId, isApplyToAdv, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @param awemeId 抖音号，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @param isApplyToAdv 是否应用于当前账户，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @return ToolsCommentTermsBannedGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsCommentTermsBannedGetV30Response openApiV30ToolsCommentTermsBannedGetGet(Long advertiserId, Long page, Long pageSize, String awemeId, Boolean isApplyToAdv) throws ApiException {
        ApiResponse<ToolsCommentTermsBannedGetV30Response> localVarResp = openApiV30ToolsCommentTermsBannedGetGetWithHttpInfo(advertiserId, page, pageSize, awemeId, isApplyToAdv);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @param awemeId 抖音号，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @param isApplyToAdv 是否应用于当前账户，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @return ApiResponse&lt;ToolsCommentTermsBannedGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsCommentTermsBannedGetV30Response> openApiV30ToolsCommentTermsBannedGetGetWithHttpInfo(Long advertiserId, Long page, Long pageSize, String awemeId, Boolean isApplyToAdv) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ToolsCommentTermsBannedGetGetValidateBeforeCall(advertiserId, page, pageSize, awemeId, isApplyToAdv, null);
        Type localVarReturnType = new TypeToken<ToolsCommentTermsBannedGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @param awemeId 抖音号，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @param isApplyToAdv 是否应用于当前账户，当is_apply_to_adv不传或为false时，aweme_id生效 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsCommentTermsBannedGetGetAsync(Long advertiserId, Long page, Long pageSize, String awemeId, Boolean isApplyToAdv, final ApiCallback<ToolsCommentTermsBannedGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ToolsCommentTermsBannedGetGetValidateBeforeCall(advertiserId, page, pageSize, awemeId, isApplyToAdv, _callback);
        Type localVarReturnType = new TypeToken<ToolsCommentTermsBannedGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
