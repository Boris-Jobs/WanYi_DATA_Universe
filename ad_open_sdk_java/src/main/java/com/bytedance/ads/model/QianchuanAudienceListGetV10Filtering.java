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
import com.bytedance.ads.model.QianchuanAudienceListGetV10FilteringAudienceType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class QianchuanAudienceListGetV10Filtering {
  public static final String SERIALIZED_NAME_AUDIENCE_ID = "audience_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ID)
  private List<Long> audienceId = null;

  public static final String SERIALIZED_NAME_AUDIENCE_NAME = "audience_name";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_NAME)
  private String audienceName = null;

  public static final String SERIALIZED_NAME_AUDIENCE_TYPE = "audience_type";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_TYPE)
  private List<QianchuanAudienceListGetV10FilteringAudienceType> audienceType = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<Integer> status = null;

  public QianchuanAudienceListGetV10Filtering() {
  }

  public QianchuanAudienceListGetV10Filtering audienceId(List<Long> audienceId) {
    
    this.audienceId = audienceId;
    return this;
  }

  public QianchuanAudienceListGetV10Filtering addAudienceIdItem(Long audienceIdItem) {
    if (this.audienceId == null) {
      this.audienceId = new ArrayList<>();
    }
    this.audienceId.add(audienceIdItem);
    return this;
  }

   /**
   * 
   * @return audienceId
  **/
  @javax.annotation.Nullable
  public List<Long> getAudienceId() {
    return audienceId;
  }


  public void setAudienceId(List<Long> audienceId) {
    this.audienceId = audienceId;
  }


  public QianchuanAudienceListGetV10Filtering audienceName(String audienceName) {
    
    this.audienceName = audienceName;
    return this;
  }

   /**
   * 
   * @return audienceName
  **/
  @javax.annotation.Nullable
  public String getAudienceName() {
    return audienceName;
  }


  public void setAudienceName(String audienceName) {
    this.audienceName = audienceName;
  }


  public QianchuanAudienceListGetV10Filtering audienceType(List<QianchuanAudienceListGetV10FilteringAudienceType> audienceType) {
    
    this.audienceType = audienceType;
    return this;
  }

  public QianchuanAudienceListGetV10Filtering addAudienceTypeItem(QianchuanAudienceListGetV10FilteringAudienceType audienceTypeItem) {
    if (this.audienceType == null) {
      this.audienceType = new ArrayList<>();
    }
    this.audienceType.add(audienceTypeItem);
    return this;
  }

   /**
   * 
   * @return audienceType
  **/
  @javax.annotation.Nullable
  public List<QianchuanAudienceListGetV10FilteringAudienceType> getAudienceType() {
    return audienceType;
  }


  public void setAudienceType(List<QianchuanAudienceListGetV10FilteringAudienceType> audienceType) {
    this.audienceType = audienceType;
  }


  public QianchuanAudienceListGetV10Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanAudienceListGetV10Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public QianchuanAudienceListGetV10Filtering status(List<Integer> status) {
    
    this.status = status;
    return this;
  }

  public QianchuanAudienceListGetV10Filtering addStatusItem(Integer statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public List<Integer> getStatus() {
    return status;
  }


  public void setStatus(List<Integer> status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAudienceListGetV10Filtering qianchuanAudienceListGetV10Filtering = (QianchuanAudienceListGetV10Filtering) o;
    return Objects.equals(this.audienceId, qianchuanAudienceListGetV10Filtering.audienceId) &&
        Objects.equals(this.audienceName, qianchuanAudienceListGetV10Filtering.audienceName) &&
        Objects.equals(this.audienceType, qianchuanAudienceListGetV10Filtering.audienceType) &&
        Objects.equals(this.endTime, qianchuanAudienceListGetV10Filtering.endTime) &&
        Objects.equals(this.startTime, qianchuanAudienceListGetV10Filtering.startTime) &&
        Objects.equals(this.status, qianchuanAudienceListGetV10Filtering.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, audienceName, audienceType, endTime, startTime, status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAudienceListGetV10Filtering {\n");
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    audienceName: ").append(toIndentedString(audienceName)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("audience_id");
    openapiFields.add("audience_name");
    openapiFields.add("audience_type");
    openapiFields.add("end_time");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAudienceListGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAudienceListGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAudienceListGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAudienceListGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAudienceListGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanAudienceListGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAudienceListGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAudienceListGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAudienceListGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanAudienceListGetV10Filtering
  */
  public static QianchuanAudienceListGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAudienceListGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanAudienceListGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

