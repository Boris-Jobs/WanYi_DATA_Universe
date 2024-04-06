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
@JsonAdapter(ClueFormCreateV2EnableLayer.Adapter.class)
public enum ClueFormCreateV2EnableLayer {
  
  Enum_1("1"),
  
  Enum_0("0");

  private String value;

  ClueFormCreateV2EnableLayer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormCreateV2EnableLayer fromValue(String value) {
    for (ClueFormCreateV2EnableLayer b : ClueFormCreateV2EnableLayer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormCreateV2EnableLayer> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormCreateV2EnableLayer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormCreateV2EnableLayer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormCreateV2EnableLayer.fromValue(value);
    }
  }
}
