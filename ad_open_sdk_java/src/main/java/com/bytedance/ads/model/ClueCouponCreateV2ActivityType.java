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
@JsonAdapter(ClueCouponCreateV2ActivityType.Adapter.class)
public enum ClueCouponCreateV2ActivityType {
  
  NEED_PHONE("DIRECT_NEED_PHONE"),
  
  NOT_NEED_PHONE("DIRECT_NOT_NEED_PHONE");

  private String value;

  ClueCouponCreateV2ActivityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponCreateV2ActivityType fromValue(String value) {
    for (ClueCouponCreateV2ActivityType b : ClueCouponCreateV2ActivityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponCreateV2ActivityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponCreateV2ActivityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponCreateV2ActivityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponCreateV2ActivityType.fromValue(value);
    }
  }
}
