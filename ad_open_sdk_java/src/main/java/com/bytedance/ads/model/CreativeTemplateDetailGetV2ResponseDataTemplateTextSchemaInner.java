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
 * CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_TEXT_MAX_LENGTH = "text_max_length";
  @SerializedName(SERIALIZED_NAME_TEXT_MAX_LENGTH)
  private Long textMaxLength = null;

  public static final String SERIALIZED_NAME_TEXT_MIN_LENGTH = "text_min_length";
  @SerializedName(SERIALIZED_NAME_TEXT_MIN_LENGTH)
  private Long textMinLength = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner() {
  }

  public CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 填充内容的键
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 填充内容的名称，e.g. 卖点主文本、卖点副文本
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner textMaxLength(Long textMaxLength) {
    
    this.textMaxLength = textMaxLength;
    return this;
  }

   /**
   * 文本的字符最长长度
   * @return textMaxLength
  **/
  @javax.annotation.Nullable
  public Long getTextMaxLength() {
    return textMaxLength;
  }


  public void setTextMaxLength(Long textMaxLength) {
    this.textMaxLength = textMaxLength;
  }


  public CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner textMinLength(Long textMinLength) {
    
    this.textMinLength = textMinLength;
    return this;
  }

   /**
   * 文本的字符最小长度
   * @return textMinLength
  **/
  @javax.annotation.Nullable
  public Long getTextMinLength() {
    return textMinLength;
  }


  public void setTextMinLength(Long textMinLength) {
    this.textMinLength = textMinLength;
  }


  public CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 默认填充内容的值（文本类型的填充值为文字）
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner creativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner = (CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner) o;
    return Objects.equals(this.key, creativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.key) &&
        Objects.equals(this.name, creativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.name) &&
        Objects.equals(this.textMaxLength, creativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.textMaxLength) &&
        Objects.equals(this.textMinLength, creativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.textMinLength) &&
        Objects.equals(this.value, creativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, textMaxLength, textMinLength, value);
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
    sb.append("class CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    textMaxLength: ").append(toIndentedString(textMaxLength)).append("\n");
    sb.append("    textMinLength: ").append(toIndentedString(textMinLength)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("text_max_length");
    openapiFields.add("text_min_length");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner>() {
           @Override
           public void write(JsonWriter out, CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner
  * @throws IOException if the JSON string is invalid with respect to CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner
  */
  public static CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner.class);
  }

 /**
  * Convert an instance of CreativeTemplateDetailGetV2ResponseDataTemplateTextSchemaInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

