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
@JsonAdapter(ToolsAdConvertDeepbidReadV2SmartBidType.Adapter.class)
public enum ToolsAdConvertDeepbidReadV2SmartBidType {
  
  NO_BID("SMART_BID_NO_BID"),
  
  RADICAL("SMART_BID_RADICAL"),
  
  CUSTOM("SMART_BID_CUSTOM"),
  
  CONSERVATIVE("SMART_BID_CONSERVATIVE");

  private String value;

  ToolsAdConvertDeepbidReadV2SmartBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertDeepbidReadV2SmartBidType fromValue(String value) {
    for (ToolsAdConvertDeepbidReadV2SmartBidType b : ToolsAdConvertDeepbidReadV2SmartBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertDeepbidReadV2SmartBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertDeepbidReadV2SmartBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertDeepbidReadV2SmartBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertDeepbidReadV2SmartBidType.fromValue(value);
    }
  }
}

