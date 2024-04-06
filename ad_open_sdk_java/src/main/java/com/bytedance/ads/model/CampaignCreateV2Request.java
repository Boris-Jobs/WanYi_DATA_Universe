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
import com.bytedance.ads.model.CampaignCreateV2BudgetMode;
import com.bytedance.ads.model.CampaignCreateV2CampaignBudgetOptimization;
import com.bytedance.ads.model.CampaignCreateV2CampaignType;
import com.bytedance.ads.model.CampaignCreateV2DedicateType;
import com.bytedance.ads.model.CampaignCreateV2DeliveryMode;
import com.bytedance.ads.model.CampaignCreateV2DeliveryRelatedNum;
import com.bytedance.ads.model.CampaignCreateV2LandingType;
import com.bytedance.ads.model.CampaignCreateV2MarketingPurpose;
import com.bytedance.ads.model.CampaignCreateV2MarketingScene;
import com.bytedance.ads.model.CampaignCreateV2Operation;
import com.bytedance.ads.model.CampaignCreateV2SmartBidType;
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
 * CampaignCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class CampaignCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private CampaignCreateV2BudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_BUDGET_OPTIMIZATION = "campaign_budget_optimization";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_BUDGET_OPTIMIZATION)
  private CampaignCreateV2CampaignBudgetOptimization campaignBudgetOptimization = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private CampaignCreateV2CampaignType campaignType = null;

  public static final String SERIALIZED_NAME_DEDICATE_TYPE = "dedicate_type";
  @SerializedName(SERIALIZED_NAME_DEDICATE_TYPE)
  private CampaignCreateV2DedicateType dedicateType = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private CampaignCreateV2DeliveryMode deliveryMode = null;

  public static final String SERIALIZED_NAME_DELIVERY_RELATED_NUM = "delivery_related_num";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RELATED_NUM)
  private CampaignCreateV2DeliveryRelatedNum deliveryRelatedNum = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private CampaignCreateV2LandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_PURPOSE = "marketing_purpose";
  @SerializedName(SERIALIZED_NAME_MARKETING_PURPOSE)
  private CampaignCreateV2MarketingPurpose marketingPurpose = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private CampaignCreateV2MarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private CampaignCreateV2Operation operation = null;

  public static final String SERIALIZED_NAME_OPT_PERMISSION = "opt_permission";
  @SerializedName(SERIALIZED_NAME_OPT_PERMISSION)
  private Long optPermission = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private CampaignCreateV2SmartBidType smartBidType = null;

  public CampaignCreateV2Request() {
  }

  public CampaignCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CampaignCreateV2Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * minimum: 0.0
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public CampaignCreateV2Request budgetMode(CampaignCreateV2BudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nonnull
  public CampaignCreateV2BudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(CampaignCreateV2BudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public CampaignCreateV2Request campaignBudgetOptimization(CampaignCreateV2CampaignBudgetOptimization campaignBudgetOptimization) {
    
    this.campaignBudgetOptimization = campaignBudgetOptimization;
    return this;
  }

   /**
   * Get campaignBudgetOptimization
   * @return campaignBudgetOptimization
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2CampaignBudgetOptimization getCampaignBudgetOptimization() {
    return campaignBudgetOptimization;
  }


  public void setCampaignBudgetOptimization(CampaignCreateV2CampaignBudgetOptimization campaignBudgetOptimization) {
    this.campaignBudgetOptimization = campaignBudgetOptimization;
  }


  public CampaignCreateV2Request campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 
   * @return campaignName
  **/
  @javax.annotation.Nonnull
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public CampaignCreateV2Request campaignType(CampaignCreateV2CampaignType campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2CampaignType getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(CampaignCreateV2CampaignType campaignType) {
    this.campaignType = campaignType;
  }


  public CampaignCreateV2Request dedicateType(CampaignCreateV2DedicateType dedicateType) {
    
    this.dedicateType = dedicateType;
    return this;
  }

   /**
   * Get dedicateType
   * @return dedicateType
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2DedicateType getDedicateType() {
    return dedicateType;
  }


  public void setDedicateType(CampaignCreateV2DedicateType dedicateType) {
    this.dedicateType = dedicateType;
  }


  public CampaignCreateV2Request deliveryMode(CampaignCreateV2DeliveryMode deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Get deliveryMode
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2DeliveryMode getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(CampaignCreateV2DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public CampaignCreateV2Request deliveryRelatedNum(CampaignCreateV2DeliveryRelatedNum deliveryRelatedNum) {
    
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

   /**
   * Get deliveryRelatedNum
   * @return deliveryRelatedNum
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2DeliveryRelatedNum getDeliveryRelatedNum() {
    return deliveryRelatedNum;
  }


  public void setDeliveryRelatedNum(CampaignCreateV2DeliveryRelatedNum deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
  }


  public CampaignCreateV2Request landingType(CampaignCreateV2LandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nonnull
  public CampaignCreateV2LandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(CampaignCreateV2LandingType landingType) {
    this.landingType = landingType;
  }


  public CampaignCreateV2Request marketingPurpose(CampaignCreateV2MarketingPurpose marketingPurpose) {
    
    this.marketingPurpose = marketingPurpose;
    return this;
  }

   /**
   * Get marketingPurpose
   * @return marketingPurpose
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2MarketingPurpose getMarketingPurpose() {
    return marketingPurpose;
  }


  public void setMarketingPurpose(CampaignCreateV2MarketingPurpose marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
  }


  public CampaignCreateV2Request marketingScene(CampaignCreateV2MarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2MarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(CampaignCreateV2MarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public CampaignCreateV2Request operation(CampaignCreateV2Operation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2Operation getOperation() {
    return operation;
  }


  public void setOperation(CampaignCreateV2Operation operation) {
    this.operation = operation;
  }


  public CampaignCreateV2Request optPermission(Long optPermission) {
    
    this.optPermission = optPermission;
    return this;
  }

   /**
   * 
   * @return optPermission
  **/
  @javax.annotation.Nullable
  public Long getOptPermission() {
    return optPermission;
  }


  public void setOptPermission(Long optPermission) {
    this.optPermission = optPermission;
  }


  public CampaignCreateV2Request smartBidType(CampaignCreateV2SmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public CampaignCreateV2SmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(CampaignCreateV2SmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateV2Request campaignCreateV2Request = (CampaignCreateV2Request) o;
    return Objects.equals(this.advertiserId, campaignCreateV2Request.advertiserId) &&
        Objects.equals(this.budget, campaignCreateV2Request.budget) &&
        Objects.equals(this.budgetMode, campaignCreateV2Request.budgetMode) &&
        Objects.equals(this.campaignBudgetOptimization, campaignCreateV2Request.campaignBudgetOptimization) &&
        Objects.equals(this.campaignName, campaignCreateV2Request.campaignName) &&
        Objects.equals(this.campaignType, campaignCreateV2Request.campaignType) &&
        Objects.equals(this.dedicateType, campaignCreateV2Request.dedicateType) &&
        Objects.equals(this.deliveryMode, campaignCreateV2Request.deliveryMode) &&
        Objects.equals(this.deliveryRelatedNum, campaignCreateV2Request.deliveryRelatedNum) &&
        Objects.equals(this.landingType, campaignCreateV2Request.landingType) &&
        Objects.equals(this.marketingPurpose, campaignCreateV2Request.marketingPurpose) &&
        Objects.equals(this.marketingScene, campaignCreateV2Request.marketingScene) &&
        Objects.equals(this.operation, campaignCreateV2Request.operation) &&
        Objects.equals(this.optPermission, campaignCreateV2Request.optPermission) &&
        Objects.equals(this.smartBidType, campaignCreateV2Request.smartBidType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, budgetMode, campaignBudgetOptimization, campaignName, campaignType, dedicateType, deliveryMode, deliveryRelatedNum, landingType, marketingPurpose, marketingScene, operation, optPermission, smartBidType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    campaignBudgetOptimization: ").append(toIndentedString(campaignBudgetOptimization)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    dedicateType: ").append(toIndentedString(dedicateType)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    deliveryRelatedNum: ").append(toIndentedString(deliveryRelatedNum)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingPurpose: ").append(toIndentedString(marketingPurpose)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    optPermission: ").append(toIndentedString(optPermission)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("campaign_budget_optimization");
    openapiFields.add("campaign_name");
    openapiFields.add("campaign_type");
    openapiFields.add("dedicate_type");
    openapiFields.add("delivery_mode");
    openapiFields.add("delivery_related_num");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_purpose");
    openapiFields.add("marketing_scene");
    openapiFields.add("operation");
    openapiFields.add("opt_permission");
    openapiFields.add("smart_bid_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("budget_mode");
    openapiRequiredFields.add("campaign_name");
    openapiRequiredFields.add("landing_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignCreateV2Request>() {
           @Override
           public void write(JsonWriter out, CampaignCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to CampaignCreateV2Request
  */
  public static CampaignCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignCreateV2Request.class);
  }

 /**
  * Convert an instance of CampaignCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

