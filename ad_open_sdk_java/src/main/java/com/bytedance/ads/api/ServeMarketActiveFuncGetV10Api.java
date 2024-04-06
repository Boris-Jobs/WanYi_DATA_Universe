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



import com.bytedance.ads.model.ServeMarketActiveFuncGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServeMarketActiveFuncGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ServeMarketActiveFuncGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ServeMarketActiveFuncGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10ServeMarketActiveFuncGetGet
     * @param useUid  (required)
     * @param appId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param funcKeys  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10ServeMarketActiveFuncGetGetCall(Long useUid, Long appId, Long page, Long pageSize, List<String> funcKeys, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/serve_market/active_func/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (useUid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("use_uid", useUid));
        }

        if (appId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_id", appId));
        }

        if (funcKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "func_keys", funcKeys));
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
    private okhttp3.Call openApiV10ServeMarketActiveFuncGetGetValidateBeforeCall(Long useUid, Long appId, Long page, Long pageSize, List<String> funcKeys, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'useUid' is set
        if (useUid == null) {
            throw new ApiException("Missing the required parameter 'useUid' when calling openApiV10ServeMarketActiveFuncGetGet(Async)");
        }

        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling openApiV10ServeMarketActiveFuncGetGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV10ServeMarketActiveFuncGetGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApiV10ServeMarketActiveFuncGetGet(Async)");
        }

        return openApiV10ServeMarketActiveFuncGetGetCall(useUid, appId, page, pageSize, funcKeys, _callback);

    }

    /**
     * 
     * 
     * @param useUid  (required)
     * @param appId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param funcKeys  (optional)
     * @return ServeMarketActiveFuncGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ServeMarketActiveFuncGetV10Response openApiV10ServeMarketActiveFuncGetGet(Long useUid, Long appId, Long page, Long pageSize, List<String> funcKeys) throws ApiException {
        ApiResponse<ServeMarketActiveFuncGetV10Response> localVarResp = openApiV10ServeMarketActiveFuncGetGetWithHttpInfo(useUid, appId, page, pageSize, funcKeys);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param useUid  (required)
     * @param appId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param funcKeys  (optional)
     * @return ApiResponse&lt;ServeMarketActiveFuncGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ServeMarketActiveFuncGetV10Response> openApiV10ServeMarketActiveFuncGetGetWithHttpInfo(Long useUid, Long appId, Long page, Long pageSize, List<String> funcKeys) throws ApiException {
        okhttp3.Call localVarCall = openApiV10ServeMarketActiveFuncGetGetValidateBeforeCall(useUid, appId, page, pageSize, funcKeys, null);
        Type localVarReturnType = new TypeToken<ServeMarketActiveFuncGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param useUid  (required)
     * @param appId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param funcKeys  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10ServeMarketActiveFuncGetGetAsync(Long useUid, Long appId, Long page, Long pageSize, List<String> funcKeys, final ApiCallback<ServeMarketActiveFuncGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10ServeMarketActiveFuncGetGetValidateBeforeCall(useUid, appId, page, pageSize, funcKeys, _callback);
        Type localVarReturnType = new TypeToken<ServeMarketActiveFuncGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}