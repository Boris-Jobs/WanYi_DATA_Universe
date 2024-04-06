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
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfoAc;
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfoAges;
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfoDistrictInfo;
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfoGender;
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfoPlatform;
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfoRetargetingInfo;
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
public class BrandQueryStockV30AudienceInfo {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private BrandQueryStockV30AudienceInfoAc ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORY = "action_category";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORY)
  private List<Long> actionCategory = null;

  public static final String SERIALIZED_NAME_AGES = "ages";
  @SerializedName(SERIALIZED_NAME_AGES)
  private List<BrandQueryStockV30AudienceInfoAges> ages = null;

  public static final String SERIALIZED_NAME_DISTRICT_INFO = "district_info";
  @SerializedName(SERIALIZED_NAME_DISTRICT_INFO)
  private BrandQueryStockV30AudienceInfoDistrictInfo districtInfo = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private BrandQueryStockV30AudienceInfoGender gender = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private BrandQueryStockV30AudienceInfoPlatform platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_INFO = "retargeting_info";
  @SerializedName(SERIALIZED_NAME_RETARGETING_INFO)
  private BrandQueryStockV30AudienceInfoRetargetingInfo retargetingInfo = null;

  public BrandQueryStockV30AudienceInfo() {
  }

  public BrandQueryStockV30AudienceInfo ac(BrandQueryStockV30AudienceInfoAc ac) {
    
    this.ac = ac;
    return this;
  }

   /**
   * Get ac
   * @return ac
  **/
  @javax.annotation.Nullable
  public BrandQueryStockV30AudienceInfoAc getAc() {
    return ac;
  }


  public void setAc(BrandQueryStockV30AudienceInfoAc ac) {
    this.ac = ac;
  }


  public BrandQueryStockV30AudienceInfo actionCategory(List<Long> actionCategory) {
    
    this.actionCategory = actionCategory;
    return this;
  }

  public BrandQueryStockV30AudienceInfo addActionCategoryItem(Long actionCategoryItem) {
    if (this.actionCategory == null) {
      this.actionCategory = new ArrayList<>();
    }
    this.actionCategory.add(actionCategoryItem);
    return this;
  }

   /**
   * 兴趣定向
   * @return actionCategory
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategory() {
    return actionCategory;
  }


  public void setActionCategory(List<Long> actionCategory) {
    this.actionCategory = actionCategory;
  }


  public BrandQueryStockV30AudienceInfo ages(List<BrandQueryStockV30AudienceInfoAges> ages) {
    
    this.ages = ages;
    return this;
  }

  public BrandQueryStockV30AudienceInfo addAgesItem(BrandQueryStockV30AudienceInfoAges agesItem) {
    if (this.ages == null) {
      this.ages = new ArrayList<>();
    }
    this.ages.add(agesItem);
    return this;
  }

   /**
   * 年龄定向，支持的枚举值：&lt;br&gt; BETWEEN18_23：18～23岁&lt;br&gt; BETWEEN24_30：24～30岁&lt;br&gt; BETWEEN31_40：31～40岁&lt;br&gt; BETWEEN41_49：41～49岁&lt;br&gt; ABOVE50：50岁及以上 UNLIMITED：不限
   * @return ages
  **/
  @javax.annotation.Nullable
  public List<BrandQueryStockV30AudienceInfoAges> getAges() {
    return ages;
  }


  public void setAges(List<BrandQueryStockV30AudienceInfoAges> ages) {
    this.ages = ages;
  }


  public BrandQueryStockV30AudienceInfo districtInfo(BrandQueryStockV30AudienceInfoDistrictInfo districtInfo) {
    
    this.districtInfo = districtInfo;
    return this;
  }

   /**
   * Get districtInfo
   * @return districtInfo
  **/
  @javax.annotation.Nullable
  public BrandQueryStockV30AudienceInfoDistrictInfo getDistrictInfo() {
    return districtInfo;
  }


  public void setDistrictInfo(BrandQueryStockV30AudienceInfoDistrictInfo districtInfo) {
    this.districtInfo = districtInfo;
  }


  public BrandQueryStockV30AudienceInfo gender(BrandQueryStockV30AudienceInfoGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public BrandQueryStockV30AudienceInfoGender getGender() {
    return gender;
  }


  public void setGender(BrandQueryStockV30AudienceInfoGender gender) {
    this.gender = gender;
  }


  public BrandQueryStockV30AudienceInfo platform(BrandQueryStockV30AudienceInfoPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public BrandQueryStockV30AudienceInfoPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(BrandQueryStockV30AudienceInfoPlatform platform) {
    this.platform = platform;
  }


  public BrandQueryStockV30AudienceInfo retargetingInfo(BrandQueryStockV30AudienceInfoRetargetingInfo retargetingInfo) {
    
    this.retargetingInfo = retargetingInfo;
    return this;
  }

   /**
   * Get retargetingInfo
   * @return retargetingInfo
  **/
  @javax.annotation.Nullable
  public BrandQueryStockV30AudienceInfoRetargetingInfo getRetargetingInfo() {
    return retargetingInfo;
  }


  public void setRetargetingInfo(BrandQueryStockV30AudienceInfoRetargetingInfo retargetingInfo) {
    this.retargetingInfo = retargetingInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandQueryStockV30AudienceInfo brandQueryStockV30AudienceInfo = (BrandQueryStockV30AudienceInfo) o;
    return Objects.equals(this.ac, brandQueryStockV30AudienceInfo.ac) &&
        Objects.equals(this.actionCategory, brandQueryStockV30AudienceInfo.actionCategory) &&
        Objects.equals(this.ages, brandQueryStockV30AudienceInfo.ages) &&
        Objects.equals(this.districtInfo, brandQueryStockV30AudienceInfo.districtInfo) &&
        Objects.equals(this.gender, brandQueryStockV30AudienceInfo.gender) &&
        Objects.equals(this.platform, brandQueryStockV30AudienceInfo.platform) &&
        Objects.equals(this.retargetingInfo, brandQueryStockV30AudienceInfo.retargetingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategory, ages, districtInfo, gender, platform, retargetingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandQueryStockV30AudienceInfo {\n");
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    actionCategory: ").append(toIndentedString(actionCategory)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    districtInfo: ").append(toIndentedString(districtInfo)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    retargetingInfo: ").append(toIndentedString(retargetingInfo)).append("\n");
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
    openapiFields.add("ac");
    openapiFields.add("action_category");
    openapiFields.add("ages");
    openapiFields.add("district_info");
    openapiFields.add("gender");
    openapiFields.add("platform");
    openapiFields.add("retargeting_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandQueryStockV30AudienceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandQueryStockV30AudienceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandQueryStockV30AudienceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandQueryStockV30AudienceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandQueryStockV30AudienceInfo>() {
           @Override
           public void write(JsonWriter out, BrandQueryStockV30AudienceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandQueryStockV30AudienceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandQueryStockV30AudienceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandQueryStockV30AudienceInfo
  * @throws IOException if the JSON string is invalid with respect to BrandQueryStockV30AudienceInfo
  */
  public static BrandQueryStockV30AudienceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandQueryStockV30AudienceInfo.class);
  }

 /**
  * Convert an instance of BrandQueryStockV30AudienceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

