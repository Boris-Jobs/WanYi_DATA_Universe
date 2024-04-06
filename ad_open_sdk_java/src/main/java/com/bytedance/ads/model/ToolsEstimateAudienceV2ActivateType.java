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
@JsonAdapter(ToolsEstimateAudienceV2ActivateType.Adapter.class)
public enum ToolsEstimateAudienceV2ActivateType {
  
  ONE_MONTH_2_THREE_MONTH("ONE_MONTH_2_THREE_MONTH"),
  
  THREE_MONTH_EAILIER("THREE_MONTH_EAILIER"),
  
  UNLIMITED("UNLIMITED"),
  
  WITH_IN_A_MONTH("WITH_IN_A_MONTH");

  private String value;

  ToolsEstimateAudienceV2ActivateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2ActivateType fromValue(String value) {
    for (ToolsEstimateAudienceV2ActivateType b : ToolsEstimateAudienceV2ActivateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2ActivateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2ActivateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2ActivateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2ActivateType.fromValue(value);
    }
  }
}
