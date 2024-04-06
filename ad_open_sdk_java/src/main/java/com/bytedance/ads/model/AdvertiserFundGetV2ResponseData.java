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
public class AdvertiserFundGetV2ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance = null;

  public static final String SERIALIZED_NAME_CASH = "cash";
  @SerializedName(SERIALIZED_NAME_CASH)
  private Double cash = null;

  public static final String SERIALIZED_NAME_COMMON_GRANT = "common_grant";
  @SerializedName(SERIALIZED_NAME_COMMON_GRANT)
  private Double commonGrant = null;

  public static final String SERIALIZED_NAME_COMPENSATION_GRANT = "compensation_grant";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_GRANT)
  private Double compensationGrant = null;

  public static final String SERIALIZED_NAME_COMPENSATION_VALID_GRANT = "compensation_valid_grant";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_VALID_GRANT)
  private Double compensationValidGrant = null;

  public static final String SERIALIZED_NAME_DEFAULT_GRANT = "default_grant";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GRANT)
  private Double defaultGrant = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = null;

  public static final String SERIALIZED_NAME_GRANT = "grant";
  @SerializedName(SERIALIZED_NAME_GRANT)
  private Double grant = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RETURN_GOODS_ABS = "return_goods_abs";
  @SerializedName(SERIALIZED_NAME_RETURN_GOODS_ABS)
  private Double returnGoodsAbs = null;

  public static final String SERIALIZED_NAME_RETURN_GOODS_COST = "return_goods_cost";
  @SerializedName(SERIALIZED_NAME_RETURN_GOODS_COST)
  private Double returnGoodsCost = null;

  public static final String SERIALIZED_NAME_RETURN_GOODS_GRANT = "return_goods_grant";
  @SerializedName(SERIALIZED_NAME_RETURN_GOODS_GRANT)
  private Double returnGoodsGrant = null;

  public static final String SERIALIZED_NAME_RETURN_GOODS_VALID_GRANT = "return_goods_valid_grant";
  @SerializedName(SERIALIZED_NAME_RETURN_GOODS_VALID_GRANT)
  private Double returnGoodsValidGrant = null;

  public static final String SERIALIZED_NAME_SEARCH_GRANT = "search_grant";
  @SerializedName(SERIALIZED_NAME_SEARCH_GRANT)
  private Double searchGrant = null;

  public static final String SERIALIZED_NAME_UNION_GRANT = "union_grant";
  @SerializedName(SERIALIZED_NAME_UNION_GRANT)
  private Double unionGrant = null;

  public static final String SERIALIZED_NAME_VALID_BALANCE = "valid_balance";
  @SerializedName(SERIALIZED_NAME_VALID_BALANCE)
  private Double validBalance = null;

  public static final String SERIALIZED_NAME_VALID_CASH = "valid_cash";
  @SerializedName(SERIALIZED_NAME_VALID_CASH)
  private Double validCash = null;

  public static final String SERIALIZED_NAME_VALID_GRANT = "valid_grant";
  @SerializedName(SERIALIZED_NAME_VALID_GRANT)
  private Double validGrant = null;

  public static final String SERIALIZED_NAME_VALID_RETURN_GOODS_ABS = "valid_return_goods_abs";
  @SerializedName(SERIALIZED_NAME_VALID_RETURN_GOODS_ABS)
  private Double validReturnGoodsAbs = null;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId = null;

  public static final String SERIALIZED_NAME_WALLET_NAME = "wallet_name";
  @SerializedName(SERIALIZED_NAME_WALLET_NAME)
  private String walletName = null;

  public static final String SERIALIZED_NAME_WALLET_TOTAL_BALANCE_VALID = "wallet_total_balance_valid";
  @SerializedName(SERIALIZED_NAME_WALLET_TOTAL_BALANCE_VALID)
  private String walletTotalBalanceValid = null;

  public AdvertiserFundGetV2ResponseData() {
  }

  public AdvertiserFundGetV2ResponseData advertiserId(Long advertiserId) {
    
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


  public AdvertiserFundGetV2ResponseData balance(Double balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 
   * @return balance
  **/
  @javax.annotation.Nullable
  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    this.balance = balance;
  }


  public AdvertiserFundGetV2ResponseData cash(Double cash) {
    
    this.cash = cash;
    return this;
  }

   /**
   * 
   * @return cash
  **/
  @javax.annotation.Nullable
  public Double getCash() {
    return cash;
  }


  public void setCash(Double cash) {
    this.cash = cash;
  }


  public AdvertiserFundGetV2ResponseData commonGrant(Double commonGrant) {
    
    this.commonGrant = commonGrant;
    return this;
  }

   /**
   * 
   * @return commonGrant
  **/
  @javax.annotation.Nullable
  public Double getCommonGrant() {
    return commonGrant;
  }


  public void setCommonGrant(Double commonGrant) {
    this.commonGrant = commonGrant;
  }


  public AdvertiserFundGetV2ResponseData compensationGrant(Double compensationGrant) {
    
    this.compensationGrant = compensationGrant;
    return this;
  }

   /**
   * 
   * @return compensationGrant
  **/
  @javax.annotation.Nullable
  public Double getCompensationGrant() {
    return compensationGrant;
  }


  public void setCompensationGrant(Double compensationGrant) {
    this.compensationGrant = compensationGrant;
  }


  public AdvertiserFundGetV2ResponseData compensationValidGrant(Double compensationValidGrant) {
    
    this.compensationValidGrant = compensationValidGrant;
    return this;
  }

   /**
   * 
   * @return compensationValidGrant
  **/
  @javax.annotation.Nullable
  public Double getCompensationValidGrant() {
    return compensationValidGrant;
  }


  public void setCompensationValidGrant(Double compensationValidGrant) {
    this.compensationValidGrant = compensationValidGrant;
  }


  public AdvertiserFundGetV2ResponseData defaultGrant(Double defaultGrant) {
    
    this.defaultGrant = defaultGrant;
    return this;
  }

   /**
   * 
   * @return defaultGrant
  **/
  @javax.annotation.Nullable
  public Double getDefaultGrant() {
    return defaultGrant;
  }


  public void setDefaultGrant(Double defaultGrant) {
    this.defaultGrant = defaultGrant;
  }


  public AdvertiserFundGetV2ResponseData email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AdvertiserFundGetV2ResponseData grant(Double grant) {
    
    this.grant = grant;
    return this;
  }

   /**
   * 
   * @return grant
  **/
  @javax.annotation.Nullable
  public Double getGrant() {
    return grant;
  }


  public void setGrant(Double grant) {
    this.grant = grant;
  }


  public AdvertiserFundGetV2ResponseData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AdvertiserFundGetV2ResponseData returnGoodsAbs(Double returnGoodsAbs) {
    
    this.returnGoodsAbs = returnGoodsAbs;
    return this;
  }

   /**
   * 
   * @return returnGoodsAbs
  **/
  @javax.annotation.Nullable
  public Double getReturnGoodsAbs() {
    return returnGoodsAbs;
  }


  public void setReturnGoodsAbs(Double returnGoodsAbs) {
    this.returnGoodsAbs = returnGoodsAbs;
  }


  public AdvertiserFundGetV2ResponseData returnGoodsCost(Double returnGoodsCost) {
    
    this.returnGoodsCost = returnGoodsCost;
    return this;
  }

   /**
   * 
   * @return returnGoodsCost
  **/
  @javax.annotation.Nullable
  public Double getReturnGoodsCost() {
    return returnGoodsCost;
  }


  public void setReturnGoodsCost(Double returnGoodsCost) {
    this.returnGoodsCost = returnGoodsCost;
  }


  public AdvertiserFundGetV2ResponseData returnGoodsGrant(Double returnGoodsGrant) {
    
    this.returnGoodsGrant = returnGoodsGrant;
    return this;
  }

   /**
   * 
   * @return returnGoodsGrant
  **/
  @javax.annotation.Nullable
  public Double getReturnGoodsGrant() {
    return returnGoodsGrant;
  }


  public void setReturnGoodsGrant(Double returnGoodsGrant) {
    this.returnGoodsGrant = returnGoodsGrant;
  }


  public AdvertiserFundGetV2ResponseData returnGoodsValidGrant(Double returnGoodsValidGrant) {
    
    this.returnGoodsValidGrant = returnGoodsValidGrant;
    return this;
  }

   /**
   * 
   * @return returnGoodsValidGrant
  **/
  @javax.annotation.Nullable
  public Double getReturnGoodsValidGrant() {
    return returnGoodsValidGrant;
  }


  public void setReturnGoodsValidGrant(Double returnGoodsValidGrant) {
    this.returnGoodsValidGrant = returnGoodsValidGrant;
  }


  public AdvertiserFundGetV2ResponseData searchGrant(Double searchGrant) {
    
    this.searchGrant = searchGrant;
    return this;
  }

   /**
   * 
   * @return searchGrant
  **/
  @javax.annotation.Nullable
  public Double getSearchGrant() {
    return searchGrant;
  }


  public void setSearchGrant(Double searchGrant) {
    this.searchGrant = searchGrant;
  }


  public AdvertiserFundGetV2ResponseData unionGrant(Double unionGrant) {
    
    this.unionGrant = unionGrant;
    return this;
  }

   /**
   * 
   * @return unionGrant
  **/
  @javax.annotation.Nullable
  public Double getUnionGrant() {
    return unionGrant;
  }


  public void setUnionGrant(Double unionGrant) {
    this.unionGrant = unionGrant;
  }


  public AdvertiserFundGetV2ResponseData validBalance(Double validBalance) {
    
    this.validBalance = validBalance;
    return this;
  }

   /**
   * 
   * @return validBalance
  **/
  @javax.annotation.Nullable
  public Double getValidBalance() {
    return validBalance;
  }


  public void setValidBalance(Double validBalance) {
    this.validBalance = validBalance;
  }


  public AdvertiserFundGetV2ResponseData validCash(Double validCash) {
    
    this.validCash = validCash;
    return this;
  }

   /**
   * 
   * @return validCash
  **/
  @javax.annotation.Nullable
  public Double getValidCash() {
    return validCash;
  }


  public void setValidCash(Double validCash) {
    this.validCash = validCash;
  }


  public AdvertiserFundGetV2ResponseData validGrant(Double validGrant) {
    
    this.validGrant = validGrant;
    return this;
  }

   /**
   * 
   * @return validGrant
  **/
  @javax.annotation.Nullable
  public Double getValidGrant() {
    return validGrant;
  }


  public void setValidGrant(Double validGrant) {
    this.validGrant = validGrant;
  }


  public AdvertiserFundGetV2ResponseData validReturnGoodsAbs(Double validReturnGoodsAbs) {
    
    this.validReturnGoodsAbs = validReturnGoodsAbs;
    return this;
  }

   /**
   * 
   * @return validReturnGoodsAbs
  **/
  @javax.annotation.Nullable
  public Double getValidReturnGoodsAbs() {
    return validReturnGoodsAbs;
  }


  public void setValidReturnGoodsAbs(Double validReturnGoodsAbs) {
    this.validReturnGoodsAbs = validReturnGoodsAbs;
  }


  public AdvertiserFundGetV2ResponseData walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * 
   * @return walletId
  **/
  @javax.annotation.Nullable
  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public AdvertiserFundGetV2ResponseData walletName(String walletName) {
    
    this.walletName = walletName;
    return this;
  }

   /**
   * 
   * @return walletName
  **/
  @javax.annotation.Nullable
  public String getWalletName() {
    return walletName;
  }


  public void setWalletName(String walletName) {
    this.walletName = walletName;
  }


  public AdvertiserFundGetV2ResponseData walletTotalBalanceValid(String walletTotalBalanceValid) {
    
    this.walletTotalBalanceValid = walletTotalBalanceValid;
    return this;
  }

   /**
   * 
   * @return walletTotalBalanceValid
  **/
  @javax.annotation.Nullable
  public String getWalletTotalBalanceValid() {
    return walletTotalBalanceValid;
  }


  public void setWalletTotalBalanceValid(String walletTotalBalanceValid) {
    this.walletTotalBalanceValid = walletTotalBalanceValid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserFundGetV2ResponseData advertiserFundGetV2ResponseData = (AdvertiserFundGetV2ResponseData) o;
    return Objects.equals(this.advertiserId, advertiserFundGetV2ResponseData.advertiserId) &&
        Objects.equals(this.balance, advertiserFundGetV2ResponseData.balance) &&
        Objects.equals(this.cash, advertiserFundGetV2ResponseData.cash) &&
        Objects.equals(this.commonGrant, advertiserFundGetV2ResponseData.commonGrant) &&
        Objects.equals(this.compensationGrant, advertiserFundGetV2ResponseData.compensationGrant) &&
        Objects.equals(this.compensationValidGrant, advertiserFundGetV2ResponseData.compensationValidGrant) &&
        Objects.equals(this.defaultGrant, advertiserFundGetV2ResponseData.defaultGrant) &&
        Objects.equals(this.email, advertiserFundGetV2ResponseData.email) &&
        Objects.equals(this.grant, advertiserFundGetV2ResponseData.grant) &&
        Objects.equals(this.name, advertiserFundGetV2ResponseData.name) &&
        Objects.equals(this.returnGoodsAbs, advertiserFundGetV2ResponseData.returnGoodsAbs) &&
        Objects.equals(this.returnGoodsCost, advertiserFundGetV2ResponseData.returnGoodsCost) &&
        Objects.equals(this.returnGoodsGrant, advertiserFundGetV2ResponseData.returnGoodsGrant) &&
        Objects.equals(this.returnGoodsValidGrant, advertiserFundGetV2ResponseData.returnGoodsValidGrant) &&
        Objects.equals(this.searchGrant, advertiserFundGetV2ResponseData.searchGrant) &&
        Objects.equals(this.unionGrant, advertiserFundGetV2ResponseData.unionGrant) &&
        Objects.equals(this.validBalance, advertiserFundGetV2ResponseData.validBalance) &&
        Objects.equals(this.validCash, advertiserFundGetV2ResponseData.validCash) &&
        Objects.equals(this.validGrant, advertiserFundGetV2ResponseData.validGrant) &&
        Objects.equals(this.validReturnGoodsAbs, advertiserFundGetV2ResponseData.validReturnGoodsAbs) &&
        Objects.equals(this.walletId, advertiserFundGetV2ResponseData.walletId) &&
        Objects.equals(this.walletName, advertiserFundGetV2ResponseData.walletName) &&
        Objects.equals(this.walletTotalBalanceValid, advertiserFundGetV2ResponseData.walletTotalBalanceValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, balance, cash, commonGrant, compensationGrant, compensationValidGrant, defaultGrant, email, grant, name, returnGoodsAbs, returnGoodsCost, returnGoodsGrant, returnGoodsValidGrant, searchGrant, unionGrant, validBalance, validCash, validGrant, validReturnGoodsAbs, walletId, walletName, walletTotalBalanceValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserFundGetV2ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    commonGrant: ").append(toIndentedString(commonGrant)).append("\n");
    sb.append("    compensationGrant: ").append(toIndentedString(compensationGrant)).append("\n");
    sb.append("    compensationValidGrant: ").append(toIndentedString(compensationValidGrant)).append("\n");
    sb.append("    defaultGrant: ").append(toIndentedString(defaultGrant)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    returnGoodsAbs: ").append(toIndentedString(returnGoodsAbs)).append("\n");
    sb.append("    returnGoodsCost: ").append(toIndentedString(returnGoodsCost)).append("\n");
    sb.append("    returnGoodsGrant: ").append(toIndentedString(returnGoodsGrant)).append("\n");
    sb.append("    returnGoodsValidGrant: ").append(toIndentedString(returnGoodsValidGrant)).append("\n");
    sb.append("    searchGrant: ").append(toIndentedString(searchGrant)).append("\n");
    sb.append("    unionGrant: ").append(toIndentedString(unionGrant)).append("\n");
    sb.append("    validBalance: ").append(toIndentedString(validBalance)).append("\n");
    sb.append("    validCash: ").append(toIndentedString(validCash)).append("\n");
    sb.append("    validGrant: ").append(toIndentedString(validGrant)).append("\n");
    sb.append("    validReturnGoodsAbs: ").append(toIndentedString(validReturnGoodsAbs)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
    sb.append("    walletTotalBalanceValid: ").append(toIndentedString(walletTotalBalanceValid)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("cash");
    openapiFields.add("common_grant");
    openapiFields.add("compensation_grant");
    openapiFields.add("compensation_valid_grant");
    openapiFields.add("default_grant");
    openapiFields.add("email");
    openapiFields.add("grant");
    openapiFields.add("name");
    openapiFields.add("return_goods_abs");
    openapiFields.add("return_goods_cost");
    openapiFields.add("return_goods_grant");
    openapiFields.add("return_goods_valid_grant");
    openapiFields.add("search_grant");
    openapiFields.add("union_grant");
    openapiFields.add("valid_balance");
    openapiFields.add("valid_cash");
    openapiFields.add("valid_grant");
    openapiFields.add("valid_return_goods_abs");
    openapiFields.add("wallet_id");
    openapiFields.add("wallet_name");
    openapiFields.add("wallet_total_balance_valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserFundGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserFundGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserFundGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserFundGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserFundGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserFundGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserFundGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserFundGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserFundGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserFundGetV2ResponseData
  */
  public static AdvertiserFundGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserFundGetV2ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserFundGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

