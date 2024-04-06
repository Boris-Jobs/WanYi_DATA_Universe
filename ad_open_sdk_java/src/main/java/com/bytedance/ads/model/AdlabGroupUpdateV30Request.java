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
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestAdInfo;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestCampaignInfo;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestCreativeInfo;
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
 * AdlabGroupUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class AdlabGroupUpdateV30Request {
  public static final String SERIALIZED_NAME_AD_INFO = "ad_info";
  @SerializedName(SERIALIZED_NAME_AD_INFO)
  private AdlabGroupUpdateV30RequestAdInfo adInfo = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_INFO = "campaign_info";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_INFO)
  private AdlabGroupUpdateV30RequestCampaignInfo campaignInfo = null;

  public static final String SERIALIZED_NAME_CREATIVE_INFO = "creative_info";
  @SerializedName(SERIALIZED_NAME_CREATIVE_INFO)
  private AdlabGroupUpdateV30RequestCreativeInfo creativeInfo = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public AdlabGroupUpdateV30Request() {
  }

  public AdlabGroupUpdateV30Request adInfo(AdlabGroupUpdateV30RequestAdInfo adInfo) {
    
    this.adInfo = adInfo;
    return this;
  }

   /**
   * Get adInfo
   * @return adInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30RequestAdInfo getAdInfo() {
    return adInfo;
  }


  public void setAdInfo(AdlabGroupUpdateV30RequestAdInfo adInfo) {
    this.adInfo = adInfo;
  }


  public AdlabGroupUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdlabGroupUpdateV30Request campaignInfo(AdlabGroupUpdateV30RequestCampaignInfo campaignInfo) {
    
    this.campaignInfo = campaignInfo;
    return this;
  }

   /**
   * Get campaignInfo
   * @return campaignInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30RequestCampaignInfo getCampaignInfo() {
    return campaignInfo;
  }


  public void setCampaignInfo(AdlabGroupUpdateV30RequestCampaignInfo campaignInfo) {
    this.campaignInfo = campaignInfo;
  }


  public AdlabGroupUpdateV30Request creativeInfo(AdlabGroupUpdateV30RequestCreativeInfo creativeInfo) {
    
    this.creativeInfo = creativeInfo;
    return this;
  }

   /**
   * Get creativeInfo
   * @return creativeInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30RequestCreativeInfo getCreativeInfo() {
    return creativeInfo;
  }


  public void setCreativeInfo(AdlabGroupUpdateV30RequestCreativeInfo creativeInfo) {
    this.creativeInfo = creativeInfo;
  }


  public AdlabGroupUpdateV30Request id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 管家项目id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateV30Request adlabGroupUpdateV30Request = (AdlabGroupUpdateV30Request) o;
    return Objects.equals(this.adInfo, adlabGroupUpdateV30Request.adInfo) &&
        Objects.equals(this.advertiserId, adlabGroupUpdateV30Request.advertiserId) &&
        Objects.equals(this.campaignInfo, adlabGroupUpdateV30Request.campaignInfo) &&
        Objects.equals(this.creativeInfo, adlabGroupUpdateV30Request.creativeInfo) &&
        Objects.equals(this.id, adlabGroupUpdateV30Request.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adInfo, advertiserId, campaignInfo, creativeInfo, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateV30Request {\n");
    sb.append("    adInfo: ").append(toIndentedString(adInfo)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignInfo: ").append(toIndentedString(campaignInfo)).append("\n");
    sb.append("    creativeInfo: ").append(toIndentedString(creativeInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("ad_info");
    openapiFields.add("advertiser_id");
    openapiFields.add("campaign_info");
    openapiFields.add("creative_info");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateV30Request
  */
  public static AdlabGroupUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateV30Request.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

