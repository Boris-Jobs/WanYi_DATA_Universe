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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType.Adapter.class)
public enum NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType {
  
  GENERAL("GENERAL"),
  
  MICRO_APP("MICRO_APP"),
  
  QUICK_APP("QUICK_APP"),
  
  WECHAT_PACKAGE("WECHAT_PACKAGE"),
  
  WECOM_PACKAGE("WECOM_PACKAGE");

  private String value;

  NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType fromValue(String value) {
    for (NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType b : NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType.fromValue(value);
    }
  }
}

