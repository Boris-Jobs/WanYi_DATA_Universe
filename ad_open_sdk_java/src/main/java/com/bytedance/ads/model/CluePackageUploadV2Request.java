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
 * CluePackageUploadV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class CluePackageUploadV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_APP_SECRET = "app_secret";
  @SerializedName(SERIALIZED_NAME_APP_SECRET)
  private String appSecret = null;

  public static final String SERIALIZED_NAME_CODE_RESOURCE = "code_resource";
  @SerializedName(SERIALIZED_NAME_CODE_RESOURCE)
  private Object codeResource = null;

  public static final String SERIALIZED_NAME_INSTANCE_IDS = "instance_ids";
  @SerializedName(SERIALIZED_NAME_INSTANCE_IDS)
  private List<Long> instanceIds = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public CluePackageUploadV2Request() {
  }

  public CluePackageUploadV2Request advertiserId(Long advertiserId) {
    
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


  public CluePackageUploadV2Request appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nonnull
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public CluePackageUploadV2Request appSecret(String appSecret) {
    
    this.appSecret = appSecret;
    return this;
  }

   /**
   * 
   * @return appSecret
  **/
  @javax.annotation.Nullable
  public String getAppSecret() {
    return appSecret;
  }


  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }


  public CluePackageUploadV2Request codeResource(Object codeResource) {
    
    this.codeResource = codeResource;
    return this;
  }

   /**
   * 
   * @return codeResource
  **/
  @javax.annotation.Nullable
  public Object getCodeResource() {
    return codeResource;
  }


  public void setCodeResource(Object codeResource) {
    this.codeResource = codeResource;
  }


  public CluePackageUploadV2Request instanceIds(List<Long> instanceIds) {
    
    this.instanceIds = instanceIds;
    return this;
  }

  public CluePackageUploadV2Request addInstanceIdsItem(Long instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * 
   * @return instanceIds
  **/
  @javax.annotation.Nullable
  public List<Long> getInstanceIds() {
    return instanceIds;
  }


  public void setInstanceIds(List<Long> instanceIds) {
    this.instanceIds = instanceIds;
  }


  public CluePackageUploadV2Request resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * 
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public CluePackageUploadV2Request siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public CluePackageUploadV2Request templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CluePackageUploadV2Request cluePackageUploadV2Request = (CluePackageUploadV2Request) o;
    return Objects.equals(this.advertiserId, cluePackageUploadV2Request.advertiserId) &&
        Objects.equals(this.appId, cluePackageUploadV2Request.appId) &&
        Objects.equals(this.appSecret, cluePackageUploadV2Request.appSecret) &&
        Objects.equals(this.codeResource, cluePackageUploadV2Request.codeResource) &&
        Objects.equals(this.instanceIds, cluePackageUploadV2Request.instanceIds) &&
        Objects.equals(this.resourceId, cluePackageUploadV2Request.resourceId) &&
        Objects.equals(this.siteId, cluePackageUploadV2Request.siteId) &&
        Objects.equals(this.templateId, cluePackageUploadV2Request.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, appSecret, codeResource, instanceIds, resourceId, siteId, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CluePackageUploadV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    codeResource: ").append(toIndentedString(codeResource)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("app_secret");
    openapiFields.add("code_resource");
    openapiFields.add("instance_ids");
    openapiFields.add("resource_id");
    openapiFields.add("site_id");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("code_resource");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CluePackageUploadV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CluePackageUploadV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CluePackageUploadV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CluePackageUploadV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CluePackageUploadV2Request>() {
           @Override
           public void write(JsonWriter out, CluePackageUploadV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CluePackageUploadV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CluePackageUploadV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CluePackageUploadV2Request
  * @throws IOException if the JSON string is invalid with respect to CluePackageUploadV2Request
  */
  public static CluePackageUploadV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CluePackageUploadV2Request.class);
  }

 /**
  * Convert an instance of CluePackageUploadV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

