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
import com.bytedance.ads.model.ReportCampaignGetV2FilteringCampaignTypes;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringCreativeMaterialModes;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringDeliveryMode;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringImageModes;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringInventoryTypes;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringLandingType;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringLandingTypes;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringPricingCategories;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringPricings;
import com.bytedance.ads.model.ReportCampaignGetV2FilteringStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ReportCampaignGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPES = "campaign_types";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPES)
  private List<ReportCampaignGetV2FilteringCampaignTypes> campaignTypes = null;

  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODES = "creative_material_modes";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODES)
  private List<ReportCampaignGetV2FilteringCreativeMaterialModes> creativeMaterialModes = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private List<ReportCampaignGetV2FilteringDeliveryMode> deliveryMode = null;

  public static final String SERIALIZED_NAME_IMAGE_MODES = "image_modes";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODES)
  private List<ReportCampaignGetV2FilteringImageModes> imageModes = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPES = "inventory_types";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPES)
  private List<ReportCampaignGetV2FilteringInventoryTypes> inventoryTypes = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private ReportCampaignGetV2FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_LANDING_TYPES = "landing_types";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPES)
  private List<ReportCampaignGetV2FilteringLandingTypes> landingTypes = null;

  public static final String SERIALIZED_NAME_PRICING_CATEGORIES = "pricing_categories";
  @SerializedName(SERIALIZED_NAME_PRICING_CATEGORIES)
  private List<ReportCampaignGetV2FilteringPricingCategories> pricingCategories = null;

  public static final String SERIALIZED_NAME_PRICINGS = "pricings";
  @SerializedName(SERIALIZED_NAME_PRICINGS)
  private List<ReportCampaignGetV2FilteringPricings> pricings = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ReportCampaignGetV2FilteringStatus status = null;

  public ReportCampaignGetV2Filtering() {
  }

  public ReportCampaignGetV2Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ReportCampaignGetV2Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public ReportCampaignGetV2Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportCampaignGetV2Filtering addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public ReportCampaignGetV2Filtering campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public ReportCampaignGetV2Filtering campaignTypes(List<ReportCampaignGetV2FilteringCampaignTypes> campaignTypes) {
    
    this.campaignTypes = campaignTypes;
    return this;
  }

  public ReportCampaignGetV2Filtering addCampaignTypesItem(ReportCampaignGetV2FilteringCampaignTypes campaignTypesItem) {
    if (this.campaignTypes == null) {
      this.campaignTypes = new ArrayList<>();
    }
    this.campaignTypes.add(campaignTypesItem);
    return this;
  }

   /**
   * 
   * @return campaignTypes
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringCampaignTypes> getCampaignTypes() {
    return campaignTypes;
  }


  public void setCampaignTypes(List<ReportCampaignGetV2FilteringCampaignTypes> campaignTypes) {
    this.campaignTypes = campaignTypes;
  }


  public ReportCampaignGetV2Filtering creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public ReportCampaignGetV2Filtering addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * 
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public ReportCampaignGetV2Filtering creativeMaterialModes(List<ReportCampaignGetV2FilteringCreativeMaterialModes> creativeMaterialModes) {
    
    this.creativeMaterialModes = creativeMaterialModes;
    return this;
  }

  public ReportCampaignGetV2Filtering addCreativeMaterialModesItem(ReportCampaignGetV2FilteringCreativeMaterialModes creativeMaterialModesItem) {
    if (this.creativeMaterialModes == null) {
      this.creativeMaterialModes = new ArrayList<>();
    }
    this.creativeMaterialModes.add(creativeMaterialModesItem);
    return this;
  }

   /**
   * 
   * @return creativeMaterialModes
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringCreativeMaterialModes> getCreativeMaterialModes() {
    return creativeMaterialModes;
  }


  public void setCreativeMaterialModes(List<ReportCampaignGetV2FilteringCreativeMaterialModes> creativeMaterialModes) {
    this.creativeMaterialModes = creativeMaterialModes;
  }


  public ReportCampaignGetV2Filtering deliveryMode(List<ReportCampaignGetV2FilteringDeliveryMode> deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

  public ReportCampaignGetV2Filtering addDeliveryModeItem(ReportCampaignGetV2FilteringDeliveryMode deliveryModeItem) {
    if (this.deliveryMode == null) {
      this.deliveryMode = new ArrayList<>();
    }
    this.deliveryMode.add(deliveryModeItem);
    return this;
  }

   /**
   * 
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringDeliveryMode> getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(List<ReportCampaignGetV2FilteringDeliveryMode> deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public ReportCampaignGetV2Filtering imageModes(List<ReportCampaignGetV2FilteringImageModes> imageModes) {
    
    this.imageModes = imageModes;
    return this;
  }

  public ReportCampaignGetV2Filtering addImageModesItem(ReportCampaignGetV2FilteringImageModes imageModesItem) {
    if (this.imageModes == null) {
      this.imageModes = new ArrayList<>();
    }
    this.imageModes.add(imageModesItem);
    return this;
  }

   /**
   * 
   * @return imageModes
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringImageModes> getImageModes() {
    return imageModes;
  }


  public void setImageModes(List<ReportCampaignGetV2FilteringImageModes> imageModes) {
    this.imageModes = imageModes;
  }


  public ReportCampaignGetV2Filtering inventoryTypes(List<ReportCampaignGetV2FilteringInventoryTypes> inventoryTypes) {
    
    this.inventoryTypes = inventoryTypes;
    return this;
  }

  public ReportCampaignGetV2Filtering addInventoryTypesItem(ReportCampaignGetV2FilteringInventoryTypes inventoryTypesItem) {
    if (this.inventoryTypes == null) {
      this.inventoryTypes = new ArrayList<>();
    }
    this.inventoryTypes.add(inventoryTypesItem);
    return this;
  }

   /**
   * 
   * @return inventoryTypes
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringInventoryTypes> getInventoryTypes() {
    return inventoryTypes;
  }


  public void setInventoryTypes(List<ReportCampaignGetV2FilteringInventoryTypes> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
  }


  public ReportCampaignGetV2Filtering landingType(ReportCampaignGetV2FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public ReportCampaignGetV2FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(ReportCampaignGetV2FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public ReportCampaignGetV2Filtering landingTypes(List<ReportCampaignGetV2FilteringLandingTypes> landingTypes) {
    
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportCampaignGetV2Filtering addLandingTypesItem(ReportCampaignGetV2FilteringLandingTypes landingTypesItem) {
    if (this.landingTypes == null) {
      this.landingTypes = new ArrayList<>();
    }
    this.landingTypes.add(landingTypesItem);
    return this;
  }

   /**
   * 
   * @return landingTypes
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringLandingTypes> getLandingTypes() {
    return landingTypes;
  }


  public void setLandingTypes(List<ReportCampaignGetV2FilteringLandingTypes> landingTypes) {
    this.landingTypes = landingTypes;
  }


  public ReportCampaignGetV2Filtering pricingCategories(List<ReportCampaignGetV2FilteringPricingCategories> pricingCategories) {
    
    this.pricingCategories = pricingCategories;
    return this;
  }

  public ReportCampaignGetV2Filtering addPricingCategoriesItem(ReportCampaignGetV2FilteringPricingCategories pricingCategoriesItem) {
    if (this.pricingCategories == null) {
      this.pricingCategories = new ArrayList<>();
    }
    this.pricingCategories.add(pricingCategoriesItem);
    return this;
  }

   /**
   * 
   * @return pricingCategories
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringPricingCategories> getPricingCategories() {
    return pricingCategories;
  }


  public void setPricingCategories(List<ReportCampaignGetV2FilteringPricingCategories> pricingCategories) {
    this.pricingCategories = pricingCategories;
  }


  public ReportCampaignGetV2Filtering pricings(List<ReportCampaignGetV2FilteringPricings> pricings) {
    
    this.pricings = pricings;
    return this;
  }

  public ReportCampaignGetV2Filtering addPricingsItem(ReportCampaignGetV2FilteringPricings pricingsItem) {
    if (this.pricings == null) {
      this.pricings = new ArrayList<>();
    }
    this.pricings.add(pricingsItem);
    return this;
  }

   /**
   * 
   * @return pricings
  **/
  @javax.annotation.Nullable
  public List<ReportCampaignGetV2FilteringPricings> getPricings() {
    return pricings;
  }


  public void setPricings(List<ReportCampaignGetV2FilteringPricings> pricings) {
    this.pricings = pricings;
  }


  public ReportCampaignGetV2Filtering status(ReportCampaignGetV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ReportCampaignGetV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(ReportCampaignGetV2FilteringStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCampaignGetV2Filtering reportCampaignGetV2Filtering = (ReportCampaignGetV2Filtering) o;
    return Objects.equals(this.adIds, reportCampaignGetV2Filtering.adIds) &&
        Objects.equals(this.campaignIds, reportCampaignGetV2Filtering.campaignIds) &&
        Objects.equals(this.campaignName, reportCampaignGetV2Filtering.campaignName) &&
        Objects.equals(this.campaignTypes, reportCampaignGetV2Filtering.campaignTypes) &&
        Objects.equals(this.creativeIds, reportCampaignGetV2Filtering.creativeIds) &&
        Objects.equals(this.creativeMaterialModes, reportCampaignGetV2Filtering.creativeMaterialModes) &&
        Objects.equals(this.deliveryMode, reportCampaignGetV2Filtering.deliveryMode) &&
        Objects.equals(this.imageModes, reportCampaignGetV2Filtering.imageModes) &&
        Objects.equals(this.inventoryTypes, reportCampaignGetV2Filtering.inventoryTypes) &&
        Objects.equals(this.landingType, reportCampaignGetV2Filtering.landingType) &&
        Objects.equals(this.landingTypes, reportCampaignGetV2Filtering.landingTypes) &&
        Objects.equals(this.pricingCategories, reportCampaignGetV2Filtering.pricingCategories) &&
        Objects.equals(this.pricings, reportCampaignGetV2Filtering.pricings) &&
        Objects.equals(this.status, reportCampaignGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, campaignIds, campaignName, campaignTypes, creativeIds, creativeMaterialModes, deliveryMode, imageModes, inventoryTypes, landingType, landingTypes, pricingCategories, pricings, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCampaignGetV2Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTypes: ").append(toIndentedString(campaignTypes)).append("\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    creativeMaterialModes: ").append(toIndentedString(creativeMaterialModes)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    imageModes: ").append(toIndentedString(imageModes)).append("\n");
    sb.append("    inventoryTypes: ").append(toIndentedString(inventoryTypes)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    landingTypes: ").append(toIndentedString(landingTypes)).append("\n");
    sb.append("    pricingCategories: ").append(toIndentedString(pricingCategories)).append("\n");
    sb.append("    pricings: ").append(toIndentedString(pricings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("campaign_ids");
    openapiFields.add("campaign_name");
    openapiFields.add("campaign_types");
    openapiFields.add("creative_ids");
    openapiFields.add("creative_material_modes");
    openapiFields.add("delivery_mode");
    openapiFields.add("image_modes");
    openapiFields.add("inventory_types");
    openapiFields.add("landing_type");
    openapiFields.add("landing_types");
    openapiFields.add("pricing_categories");
    openapiFields.add("pricings");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCampaignGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCampaignGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCampaignGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCampaignGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCampaignGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportCampaignGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCampaignGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCampaignGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCampaignGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportCampaignGetV2Filtering
  */
  public static ReportCampaignGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCampaignGetV2Filtering.class);
  }

 /**
  * Convert an instance of ReportCampaignGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

