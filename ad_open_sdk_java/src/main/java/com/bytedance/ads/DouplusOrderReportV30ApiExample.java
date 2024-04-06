package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DouplusOrderReportV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DouplusOrderReportV30Filter;
import com.bytedance.ads.model.DouplusOrderReportV30GroupBy;
import com.bytedance.ads.model.DouplusOrderReportV30Response;
import com.bytedance.ads.model.DouplusOrderReportV30StatTime;


import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DouplusOrderReportV30ApiExample {

    private static final DouplusOrderReportV30Api api = new DouplusOrderReportV30Api();

    private String awemeSecUid;
    private DouplusOrderReportV30StatTime statTime;
    private List<DouplusOrderReportV30GroupBy> groupBy;
    private DouplusOrderReportV30Filter filter;
    private Long pageSize = 10L;
    private Long page = 1L;

    private void setCase() {
        awemeSecUid = "1877555495835464";
        statTime = new DouplusOrderReportV30StatTime();
        statTime.setBeginTime("2024-01-01");
        statTime.setEndTime("2024-01-10");
        groupBy = new ArrayList<>();
        groupBy.add(DouplusOrderReportV30GroupBy.AD_ID);
        filter = new DouplusOrderReportV30Filter();
        List<Long> ids = new ArrayList<>();
        ids.add(111L);
        filter.setOrderIds(ids);
    }

    public static void main(String[] args) throws ApiException {
        DouplusOrderReportV30ApiExample example = new DouplusOrderReportV30ApiExample();
        example.setCase();

        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "15c213fe148dabb5c571484409a50e3597832be0");
        api.setApiClient(apiClient);
        DouplusOrderReportV30Response response = api.openApiV30DouplusOrderReportGet(example.awemeSecUid,
        example.statTime, example.groupBy, example.filter, example.pageSize, example.page);
        System.out.println(response);
    }

}
