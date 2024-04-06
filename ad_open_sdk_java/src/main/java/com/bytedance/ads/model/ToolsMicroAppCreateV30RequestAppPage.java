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
public class ToolsMicroAppCreateV30RequestAppPage {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_LINK_REMARK = "link_remark";
  @SerializedName(SERIALIZED_NAME_LINK_REMARK)
  private String linkRemark = null;

  public static final String SERIALIZED_NAME_START_PAGE = "start_page";
  @SerializedName(SERIALIZED_NAME_START_PAGE)
  private String startPage = null;

  public static final String SERIALIZED_NAME_START_PARAM = "start_param";
  @SerializedName(SERIALIZED_NAME_START_PARAM)
  private String startParam = null;

  public ToolsMicroAppCreateV30RequestAppPage() {
  }

  public ToolsMicroAppCreateV30RequestAppPage link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 
   * @return link
  **/
  @javax.annotation.Nonnull
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public ToolsMicroAppCreateV30RequestAppPage linkRemark(String linkRemark) {
    
    this.linkRemark = linkRemark;
    return this;
  }

   /**
   * 
   * @return linkRemark
  **/
  @javax.annotation.Nonnull
  public String getLinkRemark() {
    return linkRemark;
  }


  public void setLinkRemark(String linkRemark) {
    this.linkRemark = linkRemark;
  }


  public ToolsMicroAppCreateV30RequestAppPage startPage(String startPage) {
    
    this.startPage = startPage;
    return this;
  }

   /**
   * 
   * @return startPage
  **/
  @javax.annotation.Nullable
  public String getStartPage() {
    return startPage;
  }


  public void setStartPage(String startPage) {
    this.startPage = startPage;
  }


  public ToolsMicroAppCreateV30RequestAppPage startParam(String startParam) {
    
    this.startParam = startParam;
    return this;
  }

   /**
   * 
   * @return startParam
  **/
  @javax.annotation.Nullable
  public String getStartParam() {
    return startParam;
  }


  public void setStartParam(String startParam) {
    this.startParam = startParam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroAppCreateV30RequestAppPage toolsMicroAppCreateV30RequestAppPage = (ToolsMicroAppCreateV30RequestAppPage) o;
    return Objects.equals(this.link, toolsMicroAppCreateV30RequestAppPage.link) &&
        Objects.equals(this.linkRemark, toolsMicroAppCreateV30RequestAppPage.linkRemark) &&
        Objects.equals(this.startPage, toolsMicroAppCreateV30RequestAppPage.startPage) &&
        Objects.equals(this.startParam, toolsMicroAppCreateV30RequestAppPage.startParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, linkRemark, startPage, startParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroAppCreateV30RequestAppPage {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkRemark: ").append(toIndentedString(linkRemark)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    startParam: ").append(toIndentedString(startParam)).append("\n");
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
    openapiFields.add("link");
    openapiFields.add("link_remark");
    openapiFields.add("start_page");
    openapiFields.add("start_param");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("link_remark");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroAppCreateV30RequestAppPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroAppCreateV30RequestAppPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroAppCreateV30RequestAppPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroAppCreateV30RequestAppPage.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroAppCreateV30RequestAppPage>() {
           @Override
           public void write(JsonWriter out, ToolsMicroAppCreateV30RequestAppPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroAppCreateV30RequestAppPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroAppCreateV30RequestAppPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroAppCreateV30RequestAppPage
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroAppCreateV30RequestAppPage
  */
  public static ToolsMicroAppCreateV30RequestAppPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroAppCreateV30RequestAppPage.class);
  }

 /**
  * Convert an instance of ToolsMicroAppCreateV30RequestAppPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
