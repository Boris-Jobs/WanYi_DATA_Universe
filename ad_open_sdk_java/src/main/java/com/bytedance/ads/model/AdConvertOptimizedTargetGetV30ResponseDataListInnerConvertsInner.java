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
import com.bytedance.ads.model.AdConvertOptimizedTargetGetV30DataListConvertsConvertType;
import com.bytedance.ads.model.AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInnerExternalActionsInner;
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
 * AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner {
  public static final String SERIALIZED_NAME_CONVERT_TYPE = "convert_type";
  @SerializedName(SERIALIZED_NAME_CONVERT_TYPE)
  private AdConvertOptimizedTargetGetV30DataListConvertsConvertType convertType = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTIONS = "external_actions";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTIONS)
  private List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInnerExternalActionsInner> externalActions = null;

  public AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner() {
  }

  public AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner convertType(AdConvertOptimizedTargetGetV30DataListConvertsConvertType convertType) {
    
    this.convertType = convertType;
    return this;
  }

   /**
   * Get convertType
   * @return convertType
  **/
  @javax.annotation.Nullable
  public AdConvertOptimizedTargetGetV30DataListConvertsConvertType getConvertType() {
    return convertType;
  }


  public void setConvertType(AdConvertOptimizedTargetGetV30DataListConvertsConvertType convertType) {
    this.convertType = convertType;
  }


  public AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * 优化是否禁用,true 表示已经禁用，false 表示可用
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner externalActions(List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInnerExternalActionsInner> externalActions) {
    
    this.externalActions = externalActions;
    return this;
  }

  public AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner addExternalActionsItem(AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInnerExternalActionsInner externalActionsItem) {
    if (this.externalActions == null) {
      this.externalActions = new ArrayList<>();
    }
    this.externalActions.add(externalActionsItem);
    return this;
  }

   /**
   * 优化目标列表
   * @return externalActions
  **/
  @javax.annotation.Nullable
  public List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInnerExternalActionsInner> getExternalActions() {
    return externalActions;
  }


  public void setExternalActions(List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInnerExternalActionsInner> externalActions) {
    this.externalActions = externalActions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner adConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner = (AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner) o;
    return Objects.equals(this.convertType, adConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner.convertType) &&
        Objects.equals(this.disabled, adConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner.disabled) &&
        Objects.equals(this.externalActions, adConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner.externalActions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertType, disabled, externalActions);
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
    sb.append("class AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner {\n");
    sb.append("    convertType: ").append(toIndentedString(convertType)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    externalActions: ").append(toIndentedString(externalActions)).append("\n");
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
    openapiFields.add("convert_type");
    openapiFields.add("disabled");
    openapiFields.add("external_actions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner>() {
           @Override
           public void write(JsonWriter out, AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner
  * @throws IOException if the JSON string is invalid with respect to AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner
  */
  public static AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner.class);
  }

 /**
  * Convert an instance of AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

