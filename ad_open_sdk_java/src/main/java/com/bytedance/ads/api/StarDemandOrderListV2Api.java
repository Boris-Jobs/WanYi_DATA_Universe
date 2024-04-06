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



import com.bytedance.ads.model.StarDemandOrderListV2Filtering;
import com.bytedance.ads.model.StarDemandOrderListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarDemandOrderListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarDemandOrderListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarDemandOrderListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarDemandOrderListGet
     * @param starId 星图id，星图客户授权后，通过“获取已授权账户”接口，查询到账号角色为”6-星图账号“的账户id，即为星图id (required)
     * @param demandId 任务id，可通过“获取星图客户任务列表”获取 (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码，默认为1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，最大值50 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemandOrderListGetCall(Long starId, Long demandId, StarDemandOrderListV2Filtering filtering, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/demand/order/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (demandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("demand_id", demandId));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
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
    private okhttp3.Call openApi2StarDemandOrderListGetValidateBeforeCall(Long starId, Long demandId, StarDemandOrderListV2Filtering filtering, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarDemandOrderListGet(Async)");
        }

        // verify the required parameter 'demandId' is set
        if (demandId == null) {
            throw new ApiException("Missing the required parameter 'demandId' when calling openApi2StarDemandOrderListGet(Async)");
        }

        return openApi2StarDemandOrderListGetCall(starId, demandId, filtering, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param starId 星图id，星图客户授权后，通过“获取已授权账户”接口，查询到账号角色为”6-星图账号“的账户id，即为星图id (required)
     * @param demandId 任务id，可通过“获取星图客户任务列表”获取 (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码，默认为1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，最大值50 (optional, default to 10)
     * @return StarDemandOrderListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarDemandOrderListV2Response openApi2StarDemandOrderListGet(Long starId, Long demandId, StarDemandOrderListV2Filtering filtering, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<StarDemandOrderListV2Response> localVarResp = openApi2StarDemandOrderListGetWithHttpInfo(starId, demandId, filtering, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 星图id，星图客户授权后，通过“获取已授权账户”接口，查询到账号角色为”6-星图账号“的账户id，即为星图id (required)
     * @param demandId 任务id，可通过“获取星图客户任务列表”获取 (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码，默认为1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，最大值50 (optional, default to 10)
     * @return ApiResponse&lt;StarDemandOrderListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarDemandOrderListV2Response> openApi2StarDemandOrderListGetWithHttpInfo(Long starId, Long demandId, StarDemandOrderListV2Filtering filtering, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarDemandOrderListGetValidateBeforeCall(starId, demandId, filtering, page, pageSize, null);
        Type localVarReturnType = new TypeToken<StarDemandOrderListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 星图id，星图客户授权后，通过“获取已授权账户”接口，查询到账号角色为”6-星图账号“的账户id，即为星图id (required)
     * @param demandId 任务id，可通过“获取星图客户任务列表”获取 (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param page 页码，默认为1 (optional, default to 1)
     * @param pageSize 页面大小，默认10，最大值50 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemandOrderListGetAsync(Long starId, Long demandId, StarDemandOrderListV2Filtering filtering, Integer page, Integer pageSize, final ApiCallback<StarDemandOrderListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarDemandOrderListGetValidateBeforeCall(starId, demandId, filtering, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<StarDemandOrderListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
