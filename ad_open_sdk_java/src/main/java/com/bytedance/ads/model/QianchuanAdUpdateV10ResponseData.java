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
import com.bytedance.ads.model.QianchuanAdUpdateV10ResponseDataErrorListInner;
import com.bytedance.ads.model.QianchuanAdUpdateV10ResponseDataNoticeInfosInner;
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
public class QianchuanAdUpdateV10ResponseData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<QianchuanAdUpdateV10ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_NOTICE_INFOS = "notice_infos";
  @SerializedName(SERIALIZED_NAME_NOTICE_INFOS)
  private List<QianchuanAdUpdateV10ResponseDataNoticeInfosInner> noticeInfos = null;

  public QianchuanAdUpdateV10ResponseData() {
  }

  public QianchuanAdUpdateV10ResponseData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAdUpdateV10ResponseData errorList(List<QianchuanAdUpdateV10ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public QianchuanAdUpdateV10ResponseData addErrorListItem(QianchuanAdUpdateV10ResponseDataErrorListInner errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 
   * @return errorList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdUpdateV10ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<QianchuanAdUpdateV10ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public QianchuanAdUpdateV10ResponseData noticeInfos(List<QianchuanAdUpdateV10ResponseDataNoticeInfosInner> noticeInfos) {
    
    this.noticeInfos = noticeInfos;
    return this;
  }

  public QianchuanAdUpdateV10ResponseData addNoticeInfosItem(QianchuanAdUpdateV10ResponseDataNoticeInfosInner noticeInfosItem) {
    if (this.noticeInfos == null) {
      this.noticeInfos = new ArrayList<>();
    }
    this.noticeInfos.add(noticeInfosItem);
    return this;
  }

   /**
   * 
   * @return noticeInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdUpdateV10ResponseDataNoticeInfosInner> getNoticeInfos() {
    return noticeInfos;
  }


  public void setNoticeInfos(List<QianchuanAdUpdateV10ResponseDataNoticeInfosInner> noticeInfos) {
    this.noticeInfos = noticeInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10ResponseData qianchuanAdUpdateV10ResponseData = (QianchuanAdUpdateV10ResponseData) o;
    return Objects.equals(this.adId, qianchuanAdUpdateV10ResponseData.adId) &&
        Objects.equals(this.errorList, qianchuanAdUpdateV10ResponseData.errorList) &&
        Objects.equals(this.noticeInfos, qianchuanAdUpdateV10ResponseData.noticeInfos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, errorList, noticeInfos);
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
    sb.append("class QianchuanAdUpdateV10ResponseData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    noticeInfos: ").append(toIndentedString(noticeInfos)).append("\n");
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
    openapiFields.add("error_list");
    openapiFields.add("notice_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10ResponseData
  */
  public static QianchuanAdUpdateV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
