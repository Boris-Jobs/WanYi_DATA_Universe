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
 * AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner {
  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private Long attachmentId = null;

  public static final String SERIALIZED_NAME_PICTURE_URL = "picture_url";
  @SerializedName(SERIALIZED_NAME_PICTURE_URL)
  private String pictureUrl = null;

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner() {
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner attachmentId(Long attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 附件id
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  public Long getAttachmentId() {
    return attachmentId;
  }


  public void setAttachmentId(Long attachmentId) {
    this.attachmentId = attachmentId;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner pictureUrl(String pictureUrl) {
    
    this.pictureUrl = pictureUrl;
    return this;
  }

   /**
   * 图片链接
   * @return pictureUrl
  **/
  @javax.annotation.Nullable
  public String getPictureUrl() {
    return pictureUrl;
  }


  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner = (AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner) o;
    return Objects.equals(this.attachmentId, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner.attachmentId) &&
        Objects.equals(this.pictureUrl, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner.pictureUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, pictureUrl);
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
    sb.append("class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner {\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
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
    openapiFields.add("attachment_id");
    openapiFields.add("picture_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachment_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner
  */
  public static AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInnerAttachmentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
