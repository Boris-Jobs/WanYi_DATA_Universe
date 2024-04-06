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
 * 达人信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_AVATAR_URI = "avatar_uri";
  @SerializedName(SERIALIZED_NAME_AVATAR_URI)
  private String avatarUri = null;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone = null;

  public StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 达人ID
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 达人名称
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo avatarUri(String avatarUri) {
    
    this.avatarUri = avatarUri;
    return this;
  }

   /**
   * 头像地址
   * @return avatarUri
  **/
  @javax.annotation.Nullable
  public String getAvatarUri() {
    return avatarUri;
  }


  public void setAvatarUri(String avatarUri) {
    this.avatarUri = avatarUri;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 联系电话
   * @return contactPhone
  **/
  @javax.annotation.Nullable
  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo starOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo = (StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo) o;
    return Objects.equals(this.authorId, starOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo.authorId) &&
        Objects.equals(this.authorName, starOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo.authorName) &&
        Objects.equals(this.avatarUri, starOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo.avatarUri) &&
        Objects.equals(this.contactPhone, starOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo.contactPhone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorName, avatarUri, contactPhone);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    avatarUri: ").append(toIndentedString(avatarUri)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("author_name");
    openapiFields.add("avatar_uri");
    openapiFields.add("contact_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerAuthorInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
