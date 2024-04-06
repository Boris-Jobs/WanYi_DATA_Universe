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
import com.bytedance.ads.model.DpaVideoGetV2ResponseDataListInnerImageInfo;
import com.bytedance.ads.model.DpaVideoGetV2ResponseDataListInnerVideoInfo;
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
 * DpaVideoGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class DpaVideoGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private DpaVideoGetV2ResponseDataListInnerImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private DpaVideoGetV2ResponseDataListInnerVideoInfo videoInfo = null;

  public DpaVideoGetV2ResponseDataListInner() {
  }

  public DpaVideoGetV2ResponseDataListInner createTime(String createTime) {
    
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


  public DpaVideoGetV2ResponseDataListInner imageInfo(DpaVideoGetV2ResponseDataListInnerImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public DpaVideoGetV2ResponseDataListInnerImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(DpaVideoGetV2ResponseDataListInnerImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public DpaVideoGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DpaVideoGetV2ResponseDataListInner packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 
   * @return packageId
  **/
  @javax.annotation.Nullable
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public DpaVideoGetV2ResponseDataListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public DpaVideoGetV2ResponseDataListInner productPlatformId(Long productPlatformId) {
    
    this.productPlatformId = productPlatformId;
    return this;
  }

   /**
   * 
   * @return productPlatformId
  **/
  @javax.annotation.Nullable
  public Long getProductPlatformId() {
    return productPlatformId;
  }


  public void setProductPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
  }


  public DpaVideoGetV2ResponseDataListInner videoInfo(DpaVideoGetV2ResponseDataListInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public DpaVideoGetV2ResponseDataListInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(DpaVideoGetV2ResponseDataListInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaVideoGetV2ResponseDataListInner dpaVideoGetV2ResponseDataListInner = (DpaVideoGetV2ResponseDataListInner) o;
    return Objects.equals(this.createTime, dpaVideoGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.imageInfo, dpaVideoGetV2ResponseDataListInner.imageInfo) &&
        Objects.equals(this.name, dpaVideoGetV2ResponseDataListInner.name) &&
        Objects.equals(this.packageId, dpaVideoGetV2ResponseDataListInner.packageId) &&
        Objects.equals(this.productId, dpaVideoGetV2ResponseDataListInner.productId) &&
        Objects.equals(this.productPlatformId, dpaVideoGetV2ResponseDataListInner.productPlatformId) &&
        Objects.equals(this.videoInfo, dpaVideoGetV2ResponseDataListInner.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, imageInfo, name, packageId, productId, productPlatformId, videoInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaVideoGetV2ResponseDataListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("image_info");
    openapiFields.add("name");
    openapiFields.add("package_id");
    openapiFields.add("product_id");
    openapiFields.add("product_platform_id");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaVideoGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaVideoGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaVideoGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaVideoGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaVideoGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, DpaVideoGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaVideoGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaVideoGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaVideoGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to DpaVideoGetV2ResponseDataListInner
  */
  public static DpaVideoGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaVideoGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of DpaVideoGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
