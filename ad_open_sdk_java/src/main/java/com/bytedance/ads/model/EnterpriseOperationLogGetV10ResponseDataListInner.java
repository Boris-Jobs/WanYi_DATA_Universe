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
import com.bytedance.ads.model.EnterpriseOperationLogGetV10DataListBusinessPageOperationType;
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
 * EnterpriseOperationLogGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class EnterpriseOperationLogGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private List<Long> adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_OPERATION_TYPE = "business_page_operation_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_OPERATION_TYPE)
  private EnterpriseOperationLogGetV10DataListBusinessPageOperationType businessPageOperationType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ROOM_COVER = "room_cover";
  @SerializedName(SERIALIZED_NAME_ROOM_COVER)
  private String roomCover = null;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private Long roomId = null;

  public static final String SERIALIZED_NAME_ROOM_TITLE = "room_title";
  @SerializedName(SERIALIZED_NAME_ROOM_TITLE)
  private String roomTitle = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private Long videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_IMG = "video_img";
  @SerializedName(SERIALIZED_NAME_VIDEO_IMG)
  private String videoImg = null;

  public EnterpriseOperationLogGetV10ResponseDataListInner() {
  }

  public EnterpriseOperationLogGetV10ResponseDataListInner adId(List<Long> adId) {
    
    this.adId = adId;
    return this;
  }

  public EnterpriseOperationLogGetV10ResponseDataListInner addAdIdItem(Long adIdItem) {
    if (this.adId == null) {
      this.adId = new ArrayList<>();
    }
    this.adId.add(adIdItem);
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public List<Long> getAdId() {
    return adId;
  }


  public void setAdId(List<Long> adId) {
    this.adId = adId;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner businessPageOperationType(EnterpriseOperationLogGetV10DataListBusinessPageOperationType businessPageOperationType) {
    
    this.businessPageOperationType = businessPageOperationType;
    return this;
  }

   /**
   * Get businessPageOperationType
   * @return businessPageOperationType
  **/
  @javax.annotation.Nullable
  public EnterpriseOperationLogGetV10DataListBusinessPageOperationType getBusinessPageOperationType() {
    return businessPageOperationType;
  }


  public void setBusinessPageOperationType(EnterpriseOperationLogGetV10DataListBusinessPageOperationType businessPageOperationType) {
    this.businessPageOperationType = businessPageOperationType;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner roomCover(String roomCover) {
    
    this.roomCover = roomCover;
    return this;
  }

   /**
   * 
   * @return roomCover
  **/
  @javax.annotation.Nullable
  public String getRoomCover() {
    return roomCover;
  }


  public void setRoomCover(String roomCover) {
    this.roomCover = roomCover;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner roomId(Long roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * 
   * @return roomId
  **/
  @javax.annotation.Nullable
  public Long getRoomId() {
    return roomId;
  }


  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner roomTitle(String roomTitle) {
    
    this.roomTitle = roomTitle;
    return this;
  }

   /**
   * 
   * @return roomTitle
  **/
  @javax.annotation.Nullable
  public String getRoomTitle() {
    return roomTitle;
  }


  public void setRoomTitle(String roomTitle) {
    this.roomTitle = roomTitle;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner videoId(Long videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public Long getVideoId() {
    return videoId;
  }


  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public EnterpriseOperationLogGetV10ResponseDataListInner videoImg(String videoImg) {
    
    this.videoImg = videoImg;
    return this;
  }

   /**
   * 
   * @return videoImg
  **/
  @javax.annotation.Nullable
  public String getVideoImg() {
    return videoImg;
  }


  public void setVideoImg(String videoImg) {
    this.videoImg = videoImg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseOperationLogGetV10ResponseDataListInner enterpriseOperationLogGetV10ResponseDataListInner = (EnterpriseOperationLogGetV10ResponseDataListInner) o;
    return Objects.equals(this.adId, enterpriseOperationLogGetV10ResponseDataListInner.adId) &&
        Objects.equals(this.advertiserId, enterpriseOperationLogGetV10ResponseDataListInner.advertiserId) &&
        Objects.equals(this.budget, enterpriseOperationLogGetV10ResponseDataListInner.budget) &&
        Objects.equals(this.businessPageOperationType, enterpriseOperationLogGetV10ResponseDataListInner.businessPageOperationType) &&
        Objects.equals(this.createTime, enterpriseOperationLogGetV10ResponseDataListInner.createTime) &&
        Objects.equals(this.roomCover, enterpriseOperationLogGetV10ResponseDataListInner.roomCover) &&
        Objects.equals(this.roomId, enterpriseOperationLogGetV10ResponseDataListInner.roomId) &&
        Objects.equals(this.roomTitle, enterpriseOperationLogGetV10ResponseDataListInner.roomTitle) &&
        Objects.equals(this.videoId, enterpriseOperationLogGetV10ResponseDataListInner.videoId) &&
        Objects.equals(this.videoImg, enterpriseOperationLogGetV10ResponseDataListInner.videoImg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, budget, businessPageOperationType, createTime, roomCover, roomId, roomTitle, videoId, videoImg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseOperationLogGetV10ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    businessPageOperationType: ").append(toIndentedString(businessPageOperationType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    roomCover: ").append(toIndentedString(roomCover)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomTitle: ").append(toIndentedString(roomTitle)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoImg: ").append(toIndentedString(videoImg)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("budget");
    openapiFields.add("business_page_operation_type");
    openapiFields.add("create_time");
    openapiFields.add("room_cover");
    openapiFields.add("room_id");
    openapiFields.add("room_title");
    openapiFields.add("video_id");
    openapiFields.add("video_img");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseOperationLogGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseOperationLogGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseOperationLogGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseOperationLogGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseOperationLogGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseOperationLogGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseOperationLogGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseOperationLogGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseOperationLogGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseOperationLogGetV10ResponseDataListInner
  */
  public static EnterpriseOperationLogGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseOperationLogGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of EnterpriseOperationLogGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
