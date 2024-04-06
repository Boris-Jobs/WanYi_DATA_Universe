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



import com.bytedance.ads.model.ToolsRubeexPlayableAdListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsRubeexPlayableAdListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsRubeexPlayableAdListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsRubeexPlayableAdListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsRubeexPlayableAdListGet
     * @param playableId 试玩素材id (required)
     * @param advertiserId 广告主id (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为20, 最大为100 (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsRubeexPlayableAdListGetCall(Integer playableId, Long advertiserId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/rubeex_playable/ad_list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (playableId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("playable_id", playableId));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
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
    private okhttp3.Call openApi2ToolsRubeexPlayableAdListGetValidateBeforeCall(Integer playableId, Long advertiserId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'playableId' is set
        if (playableId == null) {
            throw new ApiException("Missing the required parameter 'playableId' when calling openApi2ToolsRubeexPlayableAdListGet(Async)");
        }

        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsRubeexPlayableAdListGet(Async)");
        }

        return openApi2ToolsRubeexPlayableAdListGetCall(playableId, advertiserId, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param playableId 试玩素材id (required)
     * @param advertiserId 广告主id (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为20, 最大为100 (optional, default to 20)
     * @return ToolsRubeexPlayableAdListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsRubeexPlayableAdListV2Response openApi2ToolsRubeexPlayableAdListGet(Integer playableId, Long advertiserId, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<ToolsRubeexPlayableAdListV2Response> localVarResp = openApi2ToolsRubeexPlayableAdListGetWithHttpInfo(playableId, advertiserId, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param playableId 试玩素材id (required)
     * @param advertiserId 广告主id (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为20, 最大为100 (optional, default to 20)
     * @return ApiResponse&lt;ToolsRubeexPlayableAdListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsRubeexPlayableAdListV2Response> openApi2ToolsRubeexPlayableAdListGetWithHttpInfo(Integer playableId, Long advertiserId, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsRubeexPlayableAdListGetValidateBeforeCall(playableId, advertiserId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ToolsRubeexPlayableAdListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param playableId 试玩素材id (required)
     * @param advertiserId 广告主id (required)
     * @param page 页码。默认为1 (optional, default to 1)
     * @param pageSize 页面大小。默认为20, 最大为100 (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsRubeexPlayableAdListGetAsync(Integer playableId, Long advertiserId, Integer page, Integer pageSize, final ApiCallback<ToolsRubeexPlayableAdListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsRubeexPlayableAdListGetValidateBeforeCall(playableId, advertiserId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ToolsRubeexPlayableAdListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}