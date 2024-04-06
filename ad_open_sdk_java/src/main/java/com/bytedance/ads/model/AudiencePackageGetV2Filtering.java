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
import com.bytedance.ads.model.AudiencePackageGetV2FilteringAdType;
import com.bytedance.ads.model.AudiencePackageGetV2FilteringDeliveryRange;
import com.bytedance.ads.model.AudiencePackageGetV2FilteringLandingType;
import com.bytedance.ads.model.AudiencePackageGetV2FilteringMarketingGoal;
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
public class AudiencePackageGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private AudiencePackageGetV2FilteringAdType adType = null;

  public static final String SERIALIZED_NAME_DELIVERY_RANGE = "delivery_range";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RANGE)
  private AudiencePackageGetV2FilteringDeliveryRange deliveryRange = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private AudiencePackageGetV2FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private AudiencePackageGetV2FilteringMarketingGoal marketingGoal = null;

  public AudiencePackageGetV2Filtering() {
  }

  public AudiencePackageGetV2Filtering adType(AudiencePackageGetV2FilteringAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2FilteringAdType getAdType() {
    return adType;
  }


  public void setAdType(AudiencePackageGetV2FilteringAdType adType) {
    this.adType = adType;
  }


  public AudiencePackageGetV2Filtering deliveryRange(AudiencePackageGetV2FilteringDeliveryRange deliveryRange) {
    
    this.deliveryRange = deliveryRange;
    return this;
  }

   /**
   * Get deliveryRange
   * @return deliveryRange
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2FilteringDeliveryRange getDeliveryRange() {
    return deliveryRange;
  }


  public void setDeliveryRange(AudiencePackageGetV2FilteringDeliveryRange deliveryRange) {
    this.deliveryRange = deliveryRange;
  }


  public AudiencePackageGetV2Filtering landingType(AudiencePackageGetV2FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(AudiencePackageGetV2FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public AudiencePackageGetV2Filtering marketingGoal(AudiencePackageGetV2FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(AudiencePackageGetV2FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV2Filtering audiencePackageGetV2Filtering = (AudiencePackageGetV2Filtering) o;
    return Objects.equals(this.adType, audiencePackageGetV2Filtering.adType) &&
        Objects.equals(this.deliveryRange, audiencePackageGetV2Filtering.deliveryRange) &&
        Objects.equals(this.landingType, audiencePackageGetV2Filtering.landingType) &&
        Objects.equals(this.marketingGoal, audiencePackageGetV2Filtering.marketingGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, deliveryRange, landingType, marketingGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudiencePackageGetV2Filtering {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    deliveryRange: ").append(toIndentedString(deliveryRange)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
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
    openapiFields.add("ad_type");
    openapiFields.add("delivery_range");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV2Filtering
  */
  public static AudiencePackageGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV2Filtering.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
