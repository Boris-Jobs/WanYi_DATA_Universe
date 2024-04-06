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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class QianchuanCreativeGetV10ResponseDataListInnerImageMaterial {
  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IS_AUTO_GENERATE = "is_auto_generate";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATE)
  private Long isAutoGenerate = null;

  public QianchuanCreativeGetV10ResponseDataListInnerImageMaterial() {
  }

  public QianchuanCreativeGetV10ResponseDataListInnerImageMaterial imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public QianchuanCreativeGetV10ResponseDataListInnerImageMaterial addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public QianchuanCreativeGetV10ResponseDataListInnerImageMaterial isAutoGenerate(Long isAutoGenerate) {
    
    this.isAutoGenerate = isAutoGenerate;
    return this;
  }

   /**
   * 
   * @return isAutoGenerate
  **/
  @javax.annotation.Nullable
  public Long getIsAutoGenerate() {
    return isAutoGenerate;
  }


  public void setIsAutoGenerate(Long isAutoGenerate) {
    this.isAutoGenerate = isAutoGenerate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCreativeGetV10ResponseDataListInnerImageMaterial qianchuanCreativeGetV10ResponseDataListInnerImageMaterial = (QianchuanCreativeGetV10ResponseDataListInnerImageMaterial) o;
    return Objects.equals(this.imageIds, qianchuanCreativeGetV10ResponseDataListInnerImageMaterial.imageIds) &&
        Objects.equals(this.isAutoGenerate, qianchuanCreativeGetV10ResponseDataListInnerImageMaterial.isAutoGenerate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageIds, isAutoGenerate);
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
    sb.append("class QianchuanCreativeGetV10ResponseDataListInnerImageMaterial {\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    isAutoGenerate: ").append(toIndentedString(isAutoGenerate)).append("\n");
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
    openapiFields.add("image_ids");
    openapiFields.add("is_auto_generate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCreativeGetV10ResponseDataListInnerImageMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCreativeGetV10ResponseDataListInnerImageMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCreativeGetV10ResponseDataListInnerImageMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCreativeGetV10ResponseDataListInnerImageMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCreativeGetV10ResponseDataListInnerImageMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanCreativeGetV10ResponseDataListInnerImageMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCreativeGetV10ResponseDataListInnerImageMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCreativeGetV10ResponseDataListInnerImageMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCreativeGetV10ResponseDataListInnerImageMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanCreativeGetV10ResponseDataListInnerImageMaterial
  */
  public static QianchuanCreativeGetV10ResponseDataListInnerImageMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCreativeGetV10ResponseDataListInnerImageMaterial.class);
  }

 /**
  * Convert an instance of QianchuanCreativeGetV10ResponseDataListInnerImageMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

