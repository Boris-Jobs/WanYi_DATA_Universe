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
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsAssetTypes;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsDeepExternalAction;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType;
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
 * ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner {
  public static final String SERIALIZED_NAME_ASSET_TYPES = "asset_types";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPES)
  private List<ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsAssetTypes> assetTypes = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_HISTORY_BACK = "history_back";
  @SerializedName(SERIALIZED_NAME_HISTORY_BACK)
  private Boolean historyBack = null;

  public static final String SERIALIZED_NAME_OPTIMIZATION_NAME = "optimization_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_NAME)
  private String optimizationName = null;

  public static final String SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK = "twenty_four_hour_back";
  @SerializedName(SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK)
  private Boolean twentyFourHourBack = null;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "value_type";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType valueType = null;

  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner() {
  }

  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner assetTypes(List<ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsAssetTypes> assetTypes) {
    
    this.assetTypes = assetTypes;
    return this;
  }

  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner addAssetTypesItem(ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsAssetTypes assetTypesItem) {
    if (this.assetTypes == null) {
      this.assetTypes = new ArrayList<>();
    }
    this.assetTypes.add(assetTypesItem);
    return this;
  }

   /**
   * 
   * @return assetTypes
  **/
  @javax.annotation.Nullable
  public List<ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsAssetTypes> getAssetTypes() {
    return assetTypes;
  }


  public void setAssetTypes(List<ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsAssetTypes> assetTypes) {
    this.assetTypes = assetTypes;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner deepExternalAction(ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner historyBack(Boolean historyBack) {
    
    this.historyBack = historyBack;
    return this;
  }

   /**
   * 
   * @return historyBack
  **/
  @javax.annotation.Nullable
  public Boolean getHistoryBack() {
    return historyBack;
  }


  public void setHistoryBack(Boolean historyBack) {
    this.historyBack = historyBack;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner optimizationName(String optimizationName) {
    
    this.optimizationName = optimizationName;
    return this;
  }

   /**
   * 
   * @return optimizationName
  **/
  @javax.annotation.Nullable
  public String getOptimizationName() {
    return optimizationName;
  }


  public void setOptimizationName(String optimizationName) {
    this.optimizationName = optimizationName;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner twentyFourHourBack(Boolean twentyFourHourBack) {
    
    this.twentyFourHourBack = twentyFourHourBack;
    return this;
  }

   /**
   * 
   * @return twentyFourHourBack
  **/
  @javax.annotation.Nullable
  public Boolean getTwentyFourHourBack() {
    return twentyFourHourBack;
  }


  public void setTwentyFourHourBack(Boolean twentyFourHourBack) {
    this.twentyFourHourBack = twentyFourHourBack;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner valueType(ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  public ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType getValueType() {
    return valueType;
  }


  public void setValueType(ToolsEventConvertOptimizedGoalGetV30DataGoalsDeepGoalsValueType valueType) {
    this.valueType = valueType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner = (ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner) o;
    return Objects.equals(this.assetTypes, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.assetTypes) &&
        Objects.equals(this.deepExternalAction, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.deepExternalAction) &&
        Objects.equals(this.historyBack, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.historyBack) &&
        Objects.equals(this.optimizationName, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.optimizationName) &&
        Objects.equals(this.twentyFourHourBack, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.twentyFourHourBack) &&
        Objects.equals(this.valueType, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.valueType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTypes, deepExternalAction, historyBack, optimizationName, twentyFourHourBack, valueType);
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
    sb.append("class ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner {\n");
    sb.append("    assetTypes: ").append(toIndentedString(assetTypes)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    historyBack: ").append(toIndentedString(historyBack)).append("\n");
    sb.append("    optimizationName: ").append(toIndentedString(optimizationName)).append("\n");
    sb.append("    twentyFourHourBack: ").append(toIndentedString(twentyFourHourBack)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
    openapiFields.add("asset_types");
    openapiFields.add("deep_external_action");
    openapiFields.add("history_back");
    openapiFields.add("optimization_name");
    openapiFields.add("twenty_four_hour_back");
    openapiFields.add("value_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner>() {
           @Override
           public void write(JsonWriter out, ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner
  */
  public static ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner.class);
  }

 /**
  * Convert an instance of ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
