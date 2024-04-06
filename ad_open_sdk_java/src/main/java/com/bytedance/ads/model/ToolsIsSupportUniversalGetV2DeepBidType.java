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
@JsonAdapter(ToolsIsSupportUniversalGetV2DeepBidType.Adapter.class)
public enum ToolsIsSupportUniversalGetV2DeepBidType {
  
  AUTO_MIN_SECOND_STAGE("AUTO_MIN_SECOND_STAGE"),
  
  BID_PER_ACTION("BID_PER_ACTION"),
  
  DEEP_BID_DEFAULT("DEEP_BID_DEFAULT"),
  
  DEEP_BID_MIN("DEEP_BID_MIN"),
  
  DEEP_BID_PACING("DEEP_BID_PACING"),
  
  MIN_SECOND_STAGE("MIN_SECOND_STAGE"),
  
  PACING_SECOND_STAGE("PACING_SECOND_STAGE"),
  
  ROI_COEFFICIENT("ROI_COEFFICIENT"),
  
  ROI_PACING("ROI_PACING"),
  
  SMARTBID("SMARTBID");

  private String value;

  ToolsIsSupportUniversalGetV2DeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsIsSupportUniversalGetV2DeepBidType fromValue(String value) {
    for (ToolsIsSupportUniversalGetV2DeepBidType b : ToolsIsSupportUniversalGetV2DeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsIsSupportUniversalGetV2DeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsIsSupportUniversalGetV2DeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsIsSupportUniversalGetV2DeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsIsSupportUniversalGetV2DeepBidType.fromValue(value);
    }
  }
}
