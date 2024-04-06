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
@JsonAdapter(ClueSmartphoneGetV2DataListValidateType.Adapter.class)
public enum ClueSmartphoneGetV2DataListValidateType {
  
  ALL_VERIFICATION("ALL_VERIFICATION"),
  
  CLUE_PRIORITY("CLUE_PRIORITY"),
  
  VALIDITY_PRIORITY("VALIDITY_PRIORITY"),
  
  AUTO_VERIFICATION("AUTO_VERIFICATION"),
  
  NONE_VERIFICATION("NONE_VERIFICATION");

  private String value;

  ClueSmartphoneGetV2DataListValidateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueSmartphoneGetV2DataListValidateType fromValue(String value) {
    for (ClueSmartphoneGetV2DataListValidateType b : ClueSmartphoneGetV2DataListValidateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueSmartphoneGetV2DataListValidateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueSmartphoneGetV2DataListValidateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueSmartphoneGetV2DataListValidateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueSmartphoneGetV2DataListValidateType.fromValue(value);
    }
  }
}

