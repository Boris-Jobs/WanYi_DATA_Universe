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
 * EnterpriseCommentReplyV10ResponseDataSuccessInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class EnterpriseCommentReplyV10ResponseDataSuccessInner {
  public static final String SERIALIZED_NAME_COMMENT_ID = "comment_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private Long commentId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_REPLIED_COMMENT_ID = "replied_comment_id";
  @SerializedName(SERIALIZED_NAME_REPLIED_COMMENT_ID)
  private Long repliedCommentId = null;

  public static final String SERIALIZED_NAME_REPLIED_COMMENT_TEXT = "replied_comment_text";
  @SerializedName(SERIALIZED_NAME_REPLIED_COMMENT_TEXT)
  private String repliedCommentText = null;

  public static final String SERIALIZED_NAME_REPLIED_OPEN_ID = "replied_open_id";
  @SerializedName(SERIALIZED_NAME_REPLIED_OPEN_ID)
  private String repliedOpenId = null;

  public static final String SERIALIZED_NAME_REPLY_ID = "reply_id";
  @SerializedName(SERIALIZED_NAME_REPLY_ID)
  private Long replyId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public EnterpriseCommentReplyV10ResponseDataSuccessInner() {
  }

  public EnterpriseCommentReplyV10ResponseDataSuccessInner commentId(Long commentId) {
    
    this.commentId = commentId;
    return this;
  }

   /**
   * 
   * @return commentId
  **/
  @javax.annotation.Nullable
  public Long getCommentId() {
    return commentId;
  }


  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }


  public EnterpriseCommentReplyV10ResponseDataSuccessInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public EnterpriseCommentReplyV10ResponseDataSuccessInner repliedCommentId(Long repliedCommentId) {
    
    this.repliedCommentId = repliedCommentId;
    return this;
  }

   /**
   * 
   * @return repliedCommentId
  **/
  @javax.annotation.Nullable
  public Long getRepliedCommentId() {
    return repliedCommentId;
  }


  public void setRepliedCommentId(Long repliedCommentId) {
    this.repliedCommentId = repliedCommentId;
  }


  public EnterpriseCommentReplyV10ResponseDataSuccessInner repliedCommentText(String repliedCommentText) {
    
    this.repliedCommentText = repliedCommentText;
    return this;
  }

   /**
   * 
   * @return repliedCommentText
  **/
  @javax.annotation.Nullable
  public String getRepliedCommentText() {
    return repliedCommentText;
  }


  public void setRepliedCommentText(String repliedCommentText) {
    this.repliedCommentText = repliedCommentText;
  }


  public EnterpriseCommentReplyV10ResponseDataSuccessInner repliedOpenId(String repliedOpenId) {
    
    this.repliedOpenId = repliedOpenId;
    return this;
  }

   /**
   * 
   * @return repliedOpenId
  **/
  @javax.annotation.Nullable
  public String getRepliedOpenId() {
    return repliedOpenId;
  }


  public void setRepliedOpenId(String repliedOpenId) {
    this.repliedOpenId = repliedOpenId;
  }


  public EnterpriseCommentReplyV10ResponseDataSuccessInner replyId(Long replyId) {
    
    this.replyId = replyId;
    return this;
  }

   /**
   * 
   * @return replyId
  **/
  @javax.annotation.Nullable
  public Long getReplyId() {
    return replyId;
  }


  public void setReplyId(Long replyId) {
    this.replyId = replyId;
  }


  public EnterpriseCommentReplyV10ResponseDataSuccessInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
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
    EnterpriseCommentReplyV10ResponseDataSuccessInner enterpriseCommentReplyV10ResponseDataSuccessInner = (EnterpriseCommentReplyV10ResponseDataSuccessInner) o;
    return Objects.equals(this.commentId, enterpriseCommentReplyV10ResponseDataSuccessInner.commentId) &&
        Objects.equals(this.createTime, enterpriseCommentReplyV10ResponseDataSuccessInner.createTime) &&
        Objects.equals(this.repliedCommentId, enterpriseCommentReplyV10ResponseDataSuccessInner.repliedCommentId) &&
        Objects.equals(this.repliedCommentText, enterpriseCommentReplyV10ResponseDataSuccessInner.repliedCommentText) &&
        Objects.equals(this.repliedOpenId, enterpriseCommentReplyV10ResponseDataSuccessInner.repliedOpenId) &&
        Objects.equals(this.replyId, enterpriseCommentReplyV10ResponseDataSuccessInner.replyId) &&
        Objects.equals(this.status, enterpriseCommentReplyV10ResponseDataSuccessInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, createTime, repliedCommentId, repliedCommentText, repliedOpenId, replyId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentReplyV10ResponseDataSuccessInner {\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    repliedCommentId: ").append(toIndentedString(repliedCommentId)).append("\n");
    sb.append("    repliedCommentText: ").append(toIndentedString(repliedCommentText)).append("\n");
    sb.append("    repliedOpenId: ").append(toIndentedString(repliedOpenId)).append("\n");
    sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
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
    openapiFields.add("comment_id");
    openapiFields.add("create_time");
    openapiFields.add("replied_comment_id");
    openapiFields.add("replied_comment_text");
    openapiFields.add("replied_open_id");
    openapiFields.add("reply_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentReplyV10ResponseDataSuccessInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentReplyV10ResponseDataSuccessInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentReplyV10ResponseDataSuccessInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentReplyV10ResponseDataSuccessInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentReplyV10ResponseDataSuccessInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentReplyV10ResponseDataSuccessInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentReplyV10ResponseDataSuccessInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentReplyV10ResponseDataSuccessInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentReplyV10ResponseDataSuccessInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentReplyV10ResponseDataSuccessInner
  */
  public static EnterpriseCommentReplyV10ResponseDataSuccessInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentReplyV10ResponseDataSuccessInner.class);
  }

 /**
  * Convert an instance of EnterpriseCommentReplyV10ResponseDataSuccessInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
