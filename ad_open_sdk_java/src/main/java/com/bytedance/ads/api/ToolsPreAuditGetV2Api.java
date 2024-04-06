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



import com.bytedance.ads.model.ToolsPreAuditGetV2Filter;
import com.bytedance.ads.model.ToolsPreAuditGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsPreAuditGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsPreAuditGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsPreAuditGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsPreAuditGetGet
     * @param advertiserId 广告主ID (required)
     * @param filter 过滤条件 (optional)
     * @param page 页码，默认值&#x60;1&#x60;，范围：page &gt;&#x3D; 1 (optional)
     * @param pageSize 页面大小，默认值 &#x60;20&#x60;，范围：&#x60;1-50&#x60; (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsPreAuditGetGetCall(Long advertiserId, ToolsPreAuditGetV2Filter filter, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/pre_audit/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApi2ToolsPreAuditGetGetValidateBeforeCall(Long advertiserId, ToolsPreAuditGetV2Filter filter, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsPreAuditGetGet(Async)");
        }

        return openApi2ToolsPreAuditGetGetCall(advertiserId, filter, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param filter 过滤条件 (optional)
     * @param page 页码，默认值&#x60;1&#x60;，范围：page &gt;&#x3D; 1 (optional)
     * @param pageSize 页面大小，默认值 &#x60;20&#x60;，范围：&#x60;1-50&#x60; (optional, default to 20)
     * @return ToolsPreAuditGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsPreAuditGetV2Response openApi2ToolsPreAuditGetGet(Long advertiserId, ToolsPreAuditGetV2Filter filter, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<ToolsPreAuditGetV2Response> localVarResp = openApi2ToolsPreAuditGetGetWithHttpInfo(advertiserId, filter, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param filter 过滤条件 (optional)
     * @param page 页码，默认值&#x60;1&#x60;，范围：page &gt;&#x3D; 1 (optional)
     * @param pageSize 页面大小，默认值 &#x60;20&#x60;，范围：&#x60;1-50&#x60; (optional, default to 20)
     * @return ApiResponse&lt;ToolsPreAuditGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsPreAuditGetV2Response> openApi2ToolsPreAuditGetGetWithHttpInfo(Long advertiserId, ToolsPreAuditGetV2Filter filter, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsPreAuditGetGetValidateBeforeCall(advertiserId, filter, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ToolsPreAuditGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param filter 过滤条件 (optional)
     * @param page 页码，默认值&#x60;1&#x60;，范围：page &gt;&#x3D; 1 (optional)
     * @param pageSize 页面大小，默认值 &#x60;20&#x60;，范围：&#x60;1-50&#x60; (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsPreAuditGetGetAsync(Long advertiserId, ToolsPreAuditGetV2Filter filter, Integer page, Integer pageSize, final ApiCallback<ToolsPreAuditGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsPreAuditGetGetValidateBeforeCall(advertiserId, filter, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ToolsPreAuditGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}