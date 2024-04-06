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
import com.bytedance.ads.model.AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine;
import com.bytedance.ads.model.AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgUnnecessaryCombinesInner;
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
 * 推广产品资质
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg {
  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_NECESSARY_COMBINE = "necessary_combine";
  @SerializedName(SERIALIZED_NAME_NECESSARY_COMBINE)
  private AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine necessaryCombine = null;

  public static final String SERIALIZED_NAME_PKG_ID = "pkg_id";
  @SerializedName(SERIALIZED_NAME_PKG_ID)
  private Long pkgId = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_UNNECESSARY_COMBINES = "unnecessary_combines";
  @SerializedName(SERIALIZED_NAME_UNNECESSARY_COMBINES)
  private List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgUnnecessaryCombinesInner> unnecessaryCombines = null;

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg() {
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 来自【推广产品资质规则配置查询接口】，行业的资质规则中的config_id
   * @return configId
  **/
  @javax.annotation.Nonnull
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg necessaryCombine(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine necessaryCombine) {
    
    this.necessaryCombine = necessaryCombine;
    return this;
  }

   /**
   * Get necessaryCombine
   * @return necessaryCombine
  **/
  @javax.annotation.Nullable
  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine getNecessaryCombine() {
    return necessaryCombine;
  }


  public void setNecessaryCombine(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine necessaryCombine) {
    this.necessaryCombine = necessaryCombine;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg pkgId(Long pkgId) {
    
    this.pkgId = pkgId;
    return this;
  }

   /**
   * 推广产品组id ① 针对新增的场景传0即可  ② 提交推广产品资质时系统会返回生成的pkg_id，针对编辑的场景，再此传入对应需要编辑的pkg_id即可
   * @return pkgId
  **/
  @javax.annotation.Nonnull
  public Long getPkgId() {
    return pkgId;
  }


  public void setPkgId(Long pkgId) {
    this.pkgId = pkgId;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 推广产品资质的产品名称，字符长度1~128
   * @return productName
  **/
  @javax.annotation.Nonnull
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg unnecessaryCombines(List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgUnnecessaryCombinesInner> unnecessaryCombines) {
    
    this.unnecessaryCombines = unnecessaryCombines;
    return this;
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg addUnnecessaryCombinesItem(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgUnnecessaryCombinesInner unnecessaryCombinesItem) {
    if (this.unnecessaryCombines == null) {
      this.unnecessaryCombines = new ArrayList<>();
    }
    this.unnecessaryCombines.add(unnecessaryCombinesItem);
    return this;
  }

   /**
   * 选填资质模块，数组长度0~30
   * @return unnecessaryCombines
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgUnnecessaryCombinesInner> getUnnecessaryCombines() {
    return unnecessaryCombines;
  }


  public void setUnnecessaryCombines(List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgUnnecessaryCombinesInner> unnecessaryCombines) {
    this.unnecessaryCombines = unnecessaryCombines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg advertiserDeliveryPkgSubmitV30RequestDeliveryPkg = (AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg) o;
    return Objects.equals(this.configId, advertiserDeliveryPkgSubmitV30RequestDeliveryPkg.configId) &&
        Objects.equals(this.necessaryCombine, advertiserDeliveryPkgSubmitV30RequestDeliveryPkg.necessaryCombine) &&
        Objects.equals(this.pkgId, advertiserDeliveryPkgSubmitV30RequestDeliveryPkg.pkgId) &&
        Objects.equals(this.productName, advertiserDeliveryPkgSubmitV30RequestDeliveryPkg.productName) &&
        Objects.equals(this.unnecessaryCombines, advertiserDeliveryPkgSubmitV30RequestDeliveryPkg.unnecessaryCombines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, necessaryCombine, pkgId, productName, unnecessaryCombines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    necessaryCombine: ").append(toIndentedString(necessaryCombine)).append("\n");
    sb.append("    pkgId: ").append(toIndentedString(pkgId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    unnecessaryCombines: ").append(toIndentedString(unnecessaryCombines)).append("\n");
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
    openapiFields.add("config_id");
    openapiFields.add("necessary_combine");
    openapiFields.add("pkg_id");
    openapiFields.add("product_name");
    openapiFields.add("unnecessary_combines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("config_id");
    openapiRequiredFields.add("pkg_id");
    openapiRequiredFields.add("product_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg
  */
  public static AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

