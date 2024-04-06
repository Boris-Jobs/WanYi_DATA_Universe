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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ToolsSiteHandselV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ToolsSiteHandselV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_SITE_IDS = "site_ids";
  @SerializedName(SERIALIZED_NAME_SITE_IDS)
  private List<String> siteIds = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_IDS = "target_advertiser_ids";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_IDS)
  private List<String> targetAdvertiserIds = null;

  public ToolsSiteHandselV2Request() {
  }

  public ToolsSiteHandselV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id，范围：1 &lt;&#x3D; advertiser_id &lt;&#x3D; MAX_INT64
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsSiteHandselV2Request siteIds(List<String> siteIds) {
    
    this.siteIds = siteIds;
    return this;
  }

  public ToolsSiteHandselV2Request addSiteIdsItem(String siteIdsItem) {
    if (this.siteIds == null) {
      this.siteIds = new ArrayList<>();
    }
    this.siteIds.add(siteIdsItem);
    return this;
  }

   /**
   * 站点id列表, min_size&#x3D;1, max_size&#x3D;20
   * @return siteIds
  **/
  @javax.annotation.Nonnull
  public List<String> getSiteIds() {
    return siteIds;
  }


  public void setSiteIds(List<String> siteIds) {
    this.siteIds = siteIds;
  }


  public ToolsSiteHandselV2Request targetAdvertiserIds(List<String> targetAdvertiserIds) {
    
    this.targetAdvertiserIds = targetAdvertiserIds;
    return this;
  }

  public ToolsSiteHandselV2Request addTargetAdvertiserIdsItem(String targetAdvertiserIdsItem) {
    if (this.targetAdvertiserIds == null) {
      this.targetAdvertiserIds = new ArrayList<>();
    }
    this.targetAdvertiserIds.add(targetAdvertiserIdsItem);
    return this;
  }

   /**
   * 目标广告主id列表, min_size&#x3D;1, max_size&#x3D;20
   * @return targetAdvertiserIds
  **/
  @javax.annotation.Nonnull
  public List<String> getTargetAdvertiserIds() {
    return targetAdvertiserIds;
  }


  public void setTargetAdvertiserIds(List<String> targetAdvertiserIds) {
    this.targetAdvertiserIds = targetAdvertiserIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteHandselV2Request toolsSiteHandselV2Request = (ToolsSiteHandselV2Request) o;
    return Objects.equals(this.advertiserId, toolsSiteHandselV2Request.advertiserId) &&
        Objects.equals(this.siteIds, toolsSiteHandselV2Request.siteIds) &&
        Objects.equals(this.targetAdvertiserIds, toolsSiteHandselV2Request.targetAdvertiserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, siteIds, targetAdvertiserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteHandselV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    siteIds: ").append(toIndentedString(siteIds)).append("\n");
    sb.append("    targetAdvertiserIds: ").append(toIndentedString(targetAdvertiserIds)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("site_ids");
    openapiFields.add("target_advertiser_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("site_ids");
    openapiRequiredFields.add("target_advertiser_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteHandselV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteHandselV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteHandselV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteHandselV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteHandselV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsSiteHandselV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteHandselV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteHandselV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteHandselV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteHandselV2Request
  */
  public static ToolsSiteHandselV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteHandselV2Request.class);
  }

 /**
  * Convert an instance of ToolsSiteHandselV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
