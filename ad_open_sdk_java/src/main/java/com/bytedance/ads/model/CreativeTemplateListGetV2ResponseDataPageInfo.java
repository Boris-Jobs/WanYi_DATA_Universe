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
 * 分页信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class CreativeTemplateListGetV2ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = null;

  public CreativeTemplateListGetV2ResponseDataPageInfo() {
  }

  public CreativeTemplateListGetV2ResponseDataPageInfo hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * 是否还有下一页
   * @return hasMore
  **/
  @javax.annotation.Nullable
  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public CreativeTemplateListGetV2ResponseDataPageInfo page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * 页数
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public CreativeTemplateListGetV2ResponseDataPageInfo pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页面大小
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeTemplateListGetV2ResponseDataPageInfo creativeTemplateListGetV2ResponseDataPageInfo = (CreativeTemplateListGetV2ResponseDataPageInfo) o;
    return Objects.equals(this.hasMore, creativeTemplateListGetV2ResponseDataPageInfo.hasMore) &&
        Objects.equals(this.page, creativeTemplateListGetV2ResponseDataPageInfo.page) &&
        Objects.equals(this.pageSize, creativeTemplateListGetV2ResponseDataPageInfo.pageSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, page, pageSize);
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
    sb.append("class CreativeTemplateListGetV2ResponseDataPageInfo {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("has_more");
    openapiFields.add("page");
    openapiFields.add("page_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeTemplateListGetV2ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeTemplateListGetV2ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeTemplateListGetV2ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeTemplateListGetV2ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeTemplateListGetV2ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, CreativeTemplateListGetV2ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeTemplateListGetV2ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeTemplateListGetV2ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeTemplateListGetV2ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeTemplateListGetV2ResponseDataPageInfo
  */
  public static CreativeTemplateListGetV2ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeTemplateListGetV2ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of CreativeTemplateListGetV2ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

