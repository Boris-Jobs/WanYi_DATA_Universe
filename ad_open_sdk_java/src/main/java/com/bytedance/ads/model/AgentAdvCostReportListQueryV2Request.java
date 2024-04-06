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


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2OrderType;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2RequestFiltering;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * AgentAdvCostReportListQueryV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class AgentAdvCostReportListQueryV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate = null;

  public static final String SERIALIZED_NAME_FILTERING = "filtering";
  @SerializedName(SERIALIZED_NAME_FILTERING)
  private AgentAdvCostReportListQueryV2RequestFiltering filtering = null;

  public static final String SERIALIZED_NAME_ORDER_FIELD = "order_field";
  @SerializedName(SERIALIZED_NAME_ORDER_FIELD)
  private String orderField = null;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private AgentAdvCostReportListQueryV2OrderType orderType = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate = null;

  public AgentAdvCostReportListQueryV2Request() {
  }

  public AgentAdvCostReportListQueryV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商ID
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentAdvCostReportListQueryV2Request endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 结束时间。格式：YYYY-MM-DD。闭区间,可选日期范围是今天以前；开始时间与结束时间的跨度不能超过365天。
   * @return endDate
  **/
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public AgentAdvCostReportListQueryV2Request filtering(AgentAdvCostReportListQueryV2RequestFiltering filtering) {
    
    this.filtering = filtering;
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @javax.annotation.Nullable
  public AgentAdvCostReportListQueryV2RequestFiltering getFiltering() {
    return filtering;
  }


  public void setFiltering(AgentAdvCostReportListQueryV2RequestFiltering filtering) {
    this.filtering = filtering;
  }


  public AgentAdvCostReportListQueryV2Request orderField(String orderField) {
    
    this.orderField = orderField;
    return this;
  }

   /**
   * 排序字段
   * @return orderField
  **/
  @javax.annotation.Nullable
  public String getOrderField() {
    return orderField;
  }


  public void setOrderField(String orderField) {
    this.orderField = orderField;
  }


  public AgentAdvCostReportListQueryV2Request orderType(AgentAdvCostReportListQueryV2OrderType orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @javax.annotation.Nullable
  public AgentAdvCostReportListQueryV2OrderType getOrderType() {
    return orderType;
  }


  public void setOrderType(AgentAdvCostReportListQueryV2OrderType orderType) {
    this.orderType = orderType;
  }


  public AgentAdvCostReportListQueryV2Request page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * 页数，默认1
   * minimum: 1
   * maximum: 1000
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public AgentAdvCostReportListQueryV2Request pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 单页条数，默认20
   * minimum: 1
   * maximum: 100
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AgentAdvCostReportListQueryV2Request startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 开始时间。格式：YYYY-MM-DD。闭区间,可选日期范围是今天以前（不允许包括今天）
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvCostReportListQueryV2Request agentAdvCostReportListQueryV2Request = (AgentAdvCostReportListQueryV2Request) o;
    return Objects.equals(this.agentId, agentAdvCostReportListQueryV2Request.agentId) &&
        Objects.equals(this.endDate, agentAdvCostReportListQueryV2Request.endDate) &&
        Objects.equals(this.filtering, agentAdvCostReportListQueryV2Request.filtering) &&
        Objects.equals(this.orderField, agentAdvCostReportListQueryV2Request.orderField) &&
        Objects.equals(this.orderType, agentAdvCostReportListQueryV2Request.orderType) &&
        Objects.equals(this.page, agentAdvCostReportListQueryV2Request.page) &&
        Objects.equals(this.pageSize, agentAdvCostReportListQueryV2Request.pageSize) &&
        Objects.equals(this.startDate, agentAdvCostReportListQueryV2Request.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, endDate, filtering, orderField, orderType, page, pageSize, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvCostReportListQueryV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("agent_id");
    openapiFields.add("end_date");
    openapiFields.add("filtering");
    openapiFields.add("order_field");
    openapiFields.add("order_type");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("start_date");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvCostReportListQueryV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvCostReportListQueryV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvCostReportListQueryV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvCostReportListQueryV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvCostReportListQueryV2Request>() {
           @Override
           public void write(JsonWriter out, AgentAdvCostReportListQueryV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvCostReportListQueryV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvCostReportListQueryV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvCostReportListQueryV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentAdvCostReportListQueryV2Request
  */
  public static AgentAdvCostReportListQueryV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvCostReportListQueryV2Request.class);
  }

 /**
  * Convert an instance of AgentAdvCostReportListQueryV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
