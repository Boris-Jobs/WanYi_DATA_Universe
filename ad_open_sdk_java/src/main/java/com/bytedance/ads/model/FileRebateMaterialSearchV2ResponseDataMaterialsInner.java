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
import com.bytedance.ads.model.FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo;
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
 * FileRebateMaterialSearchV2ResponseDataMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class FileRebateMaterialSearchV2ResponseDataMaterialsInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AGENT_SALE_NAME = "agent_sale_name";
  @SerializedName(SERIALIZED_NAME_AGENT_SALE_NAME)
  private String agentSaleName = null;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName = null;

  public static final String SERIALIZED_NAME_MATERIAL_INFO = "material_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_INFO)
  private FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo materialInfo = null;

  public static final String SERIALIZED_NAME_OPERATOR_TAG = "operator_tag";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TAG)
  private Integer operatorTag = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_NAME = "optimizer_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_NAME)
  private String optimizerName = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_FIRST_INDUSTRY_NAME = "rebate_calc_first_industry_name";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_FIRST_INDUSTRY_NAME)
  private String rebateCalcFirstIndustryName = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_POLICY_TYPE = "rebate_calc_policy_type";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_POLICY_TYPE)
  private Integer rebateCalcPolicyType = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_SECOND_INDUSTRY_NAME = "rebate_calc_second_industry_name";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_SECOND_INDUSTRY_NAME)
  private String rebateCalcSecondIndustryName = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_SETTLEMENT_STATS_TYPE = "rebate_calc_settlement_stats_type";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_SETTLEMENT_STATS_TYPE)
  private Integer rebateCalcSettlementStatsType = null;

  public static final String SERIALIZED_NAME_SECOND_AD_AGENT_ID = "second_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_SECOND_AD_AGENT_ID)
  private Long secondAdAgentId = null;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "update_date";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private String updateDate = null;

  public FileRebateMaterialSearchV2ResponseDataMaterialsInner() {
  }

  public FileRebateMaterialSearchV2ResponseDataMaterialsInner advertiserId(Long advertiserId) {
    
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


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner agentSaleName(String agentSaleName) {
    
    this.agentSaleName = agentSaleName;
    return this;
  }

   /**
   * 
   * @return agentSaleName
  **/
  @javax.annotation.Nullable
  public String getAgentSaleName() {
    return agentSaleName;
  }


  public void setAgentSaleName(String agentSaleName) {
    this.agentSaleName = agentSaleName;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * 
   * @return customerName
  **/
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner materialInfo(FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo materialInfo) {
    
    this.materialInfo = materialInfo;
    return this;
  }

   /**
   * Get materialInfo
   * @return materialInfo
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo getMaterialInfo() {
    return materialInfo;
  }


  public void setMaterialInfo(FileRebateMaterialSearchV2ResponseDataMaterialsInnerMaterialInfo materialInfo) {
    this.materialInfo = materialInfo;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner operatorTag(Integer operatorTag) {
    
    this.operatorTag = operatorTag;
    return this;
  }

   /**
   * 
   * @return operatorTag
  **/
  @javax.annotation.Nullable
  public Integer getOperatorTag() {
    return operatorTag;
  }


  public void setOperatorTag(Integer operatorTag) {
    this.operatorTag = operatorTag;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner optimizerName(String optimizerName) {
    
    this.optimizerName = optimizerName;
    return this;
  }

   /**
   * 
   * @return optimizerName
  **/
  @javax.annotation.Nullable
  public String getOptimizerName() {
    return optimizerName;
  }


  public void setOptimizerName(String optimizerName) {
    this.optimizerName = optimizerName;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner rebateCalcFirstIndustryName(String rebateCalcFirstIndustryName) {
    
    this.rebateCalcFirstIndustryName = rebateCalcFirstIndustryName;
    return this;
  }

   /**
   * 
   * @return rebateCalcFirstIndustryName
  **/
  @javax.annotation.Nullable
  public String getRebateCalcFirstIndustryName() {
    return rebateCalcFirstIndustryName;
  }


  public void setRebateCalcFirstIndustryName(String rebateCalcFirstIndustryName) {
    this.rebateCalcFirstIndustryName = rebateCalcFirstIndustryName;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner rebateCalcPolicyType(Integer rebateCalcPolicyType) {
    
    this.rebateCalcPolicyType = rebateCalcPolicyType;
    return this;
  }

   /**
   * 
   * @return rebateCalcPolicyType
  **/
  @javax.annotation.Nullable
  public Integer getRebateCalcPolicyType() {
    return rebateCalcPolicyType;
  }


  public void setRebateCalcPolicyType(Integer rebateCalcPolicyType) {
    this.rebateCalcPolicyType = rebateCalcPolicyType;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner rebateCalcSecondIndustryName(String rebateCalcSecondIndustryName) {
    
    this.rebateCalcSecondIndustryName = rebateCalcSecondIndustryName;
    return this;
  }

   /**
   * 
   * @return rebateCalcSecondIndustryName
  **/
  @javax.annotation.Nullable
  public String getRebateCalcSecondIndustryName() {
    return rebateCalcSecondIndustryName;
  }


  public void setRebateCalcSecondIndustryName(String rebateCalcSecondIndustryName) {
    this.rebateCalcSecondIndustryName = rebateCalcSecondIndustryName;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner rebateCalcSettlementStatsType(Integer rebateCalcSettlementStatsType) {
    
    this.rebateCalcSettlementStatsType = rebateCalcSettlementStatsType;
    return this;
  }

   /**
   * 
   * @return rebateCalcSettlementStatsType
  **/
  @javax.annotation.Nullable
  public Integer getRebateCalcSettlementStatsType() {
    return rebateCalcSettlementStatsType;
  }


  public void setRebateCalcSettlementStatsType(Integer rebateCalcSettlementStatsType) {
    this.rebateCalcSettlementStatsType = rebateCalcSettlementStatsType;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner secondAdAgentId(Long secondAdAgentId) {
    
    this.secondAdAgentId = secondAdAgentId;
    return this;
  }

   /**
   * 
   * @return secondAdAgentId
  **/
  @javax.annotation.Nullable
  public Long getSecondAdAgentId() {
    return secondAdAgentId;
  }


  public void setSecondAdAgentId(Long secondAdAgentId) {
    this.secondAdAgentId = secondAdAgentId;
  }


  public FileRebateMaterialSearchV2ResponseDataMaterialsInner updateDate(String updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * 
   * @return updateDate
  **/
  @javax.annotation.Nullable
  public String getUpdateDate() {
    return updateDate;
  }


  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRebateMaterialSearchV2ResponseDataMaterialsInner fileRebateMaterialSearchV2ResponseDataMaterialsInner = (FileRebateMaterialSearchV2ResponseDataMaterialsInner) o;
    return Objects.equals(this.advertiserId, fileRebateMaterialSearchV2ResponseDataMaterialsInner.advertiserId) &&
        Objects.equals(this.agentSaleName, fileRebateMaterialSearchV2ResponseDataMaterialsInner.agentSaleName) &&
        Objects.equals(this.customerName, fileRebateMaterialSearchV2ResponseDataMaterialsInner.customerName) &&
        Objects.equals(this.materialInfo, fileRebateMaterialSearchV2ResponseDataMaterialsInner.materialInfo) &&
        Objects.equals(this.operatorTag, fileRebateMaterialSearchV2ResponseDataMaterialsInner.operatorTag) &&
        Objects.equals(this.optimizerName, fileRebateMaterialSearchV2ResponseDataMaterialsInner.optimizerName) &&
        Objects.equals(this.rebateCalcFirstIndustryName, fileRebateMaterialSearchV2ResponseDataMaterialsInner.rebateCalcFirstIndustryName) &&
        Objects.equals(this.rebateCalcPolicyType, fileRebateMaterialSearchV2ResponseDataMaterialsInner.rebateCalcPolicyType) &&
        Objects.equals(this.rebateCalcSecondIndustryName, fileRebateMaterialSearchV2ResponseDataMaterialsInner.rebateCalcSecondIndustryName) &&
        Objects.equals(this.rebateCalcSettlementStatsType, fileRebateMaterialSearchV2ResponseDataMaterialsInner.rebateCalcSettlementStatsType) &&
        Objects.equals(this.secondAdAgentId, fileRebateMaterialSearchV2ResponseDataMaterialsInner.secondAdAgentId) &&
        Objects.equals(this.updateDate, fileRebateMaterialSearchV2ResponseDataMaterialsInner.updateDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, agentSaleName, customerName, materialInfo, operatorTag, optimizerName, rebateCalcFirstIndustryName, rebateCalcPolicyType, rebateCalcSecondIndustryName, rebateCalcSettlementStatsType, secondAdAgentId, updateDate);
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
    sb.append("class FileRebateMaterialSearchV2ResponseDataMaterialsInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    agentSaleName: ").append(toIndentedString(agentSaleName)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    materialInfo: ").append(toIndentedString(materialInfo)).append("\n");
    sb.append("    operatorTag: ").append(toIndentedString(operatorTag)).append("\n");
    sb.append("    optimizerName: ").append(toIndentedString(optimizerName)).append("\n");
    sb.append("    rebateCalcFirstIndustryName: ").append(toIndentedString(rebateCalcFirstIndustryName)).append("\n");
    sb.append("    rebateCalcPolicyType: ").append(toIndentedString(rebateCalcPolicyType)).append("\n");
    sb.append("    rebateCalcSecondIndustryName: ").append(toIndentedString(rebateCalcSecondIndustryName)).append("\n");
    sb.append("    rebateCalcSettlementStatsType: ").append(toIndentedString(rebateCalcSettlementStatsType)).append("\n");
    sb.append("    secondAdAgentId: ").append(toIndentedString(secondAdAgentId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
    openapiFields.add("agent_sale_name");
    openapiFields.add("customer_name");
    openapiFields.add("material_info");
    openapiFields.add("operator_tag");
    openapiFields.add("optimizer_name");
    openapiFields.add("rebate_calc_first_industry_name");
    openapiFields.add("rebate_calc_policy_type");
    openapiFields.add("rebate_calc_second_industry_name");
    openapiFields.add("rebate_calc_settlement_stats_type");
    openapiFields.add("second_ad_agent_id");
    openapiFields.add("update_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateMaterialSearchV2ResponseDataMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateMaterialSearchV2ResponseDataMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateMaterialSearchV2ResponseDataMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateMaterialSearchV2ResponseDataMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateMaterialSearchV2ResponseDataMaterialsInner>() {
           @Override
           public void write(JsonWriter out, FileRebateMaterialSearchV2ResponseDataMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateMaterialSearchV2ResponseDataMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateMaterialSearchV2ResponseDataMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateMaterialSearchV2ResponseDataMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to FileRebateMaterialSearchV2ResponseDataMaterialsInner
  */
  public static FileRebateMaterialSearchV2ResponseDataMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateMaterialSearchV2ResponseDataMaterialsInner.class);
  }

 /**
  * Convert an instance of FileRebateMaterialSearchV2ResponseDataMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

