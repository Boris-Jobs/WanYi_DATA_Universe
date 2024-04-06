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
@JsonAdapter(ClueFormListV2DataListEnableLayer.Adapter.class)
public enum ClueFormListV2DataListEnableLayer {
  
  Enum_0("0"),
  
  Enum_1("1");

  private String value;

  ClueFormListV2DataListEnableLayer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormListV2DataListEnableLayer fromValue(String value) {
    for (ClueFormListV2DataListEnableLayer b : ClueFormListV2DataListEnableLayer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormListV2DataListEnableLayer> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormListV2DataListEnableLayer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormListV2DataListEnableLayer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormListV2DataListEnableLayer.fromValue(value);
    }
  }
}
