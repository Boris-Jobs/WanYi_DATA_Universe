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
 * CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner {
  public static final String SERIALIZED_NAME_TEMPLATE_TAG_ID = "template_tag_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TAG_ID)
  private String templateTagId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TAG_NAME = "template_tag_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TAG_NAME)
  private String templateTagName = null;

  public CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner() {
  }

  public CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner templateTagId(String templateTagId) {
    
    this.templateTagId = templateTagId;
    return this;
  }

   /**
   * 模板标签ID
   * @return templateTagId
  **/
  @javax.annotation.Nullable
  public String getTemplateTagId() {
    return templateTagId;
  }


  public void setTemplateTagId(String templateTagId) {
    this.templateTagId = templateTagId;
  }


  public CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner templateTagName(String templateTagName) {
    
    this.templateTagName = templateTagName;
    return this;
  }

   /**
   * 模板标签名称，e.g. \&quot;价格优惠\&quot;、\&quot;节日氛围\&quot;、\&quot;玩法吸引力\&quot;、\&quot;利益点露出\&quot;
   * @return templateTagName
  **/
  @javax.annotation.Nullable
  public String getTemplateTagName() {
    return templateTagName;
  }


  public void setTemplateTagName(String templateTagName) {
    this.templateTagName = templateTagName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner creativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner = (CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner) o;
    return Objects.equals(this.templateTagId, creativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner.templateTagId) &&
        Objects.equals(this.templateTagName, creativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner.templateTagName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateTagId, templateTagName);
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
    sb.append("class CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner {\n");
    sb.append("    templateTagId: ").append(toIndentedString(templateTagId)).append("\n");
    sb.append("    templateTagName: ").append(toIndentedString(templateTagName)).append("\n");
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
    openapiFields.add("template_tag_id");
    openapiFields.add("template_tag_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner>() {
           @Override
           public void write(JsonWriter out, CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner
  */
  public static CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner.class);
  }

 /**
  * Convert an instance of CreativeTemplateListGetV2ResponseDataListsInnerTemplateTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

