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
@JsonAdapter(CreativeAutoGenerateConfigGetV2DataVersion.Adapter.class)
public enum CreativeAutoGenerateConfigGetV2DataVersion {
  
  STRATEGY("Strategy"),
  
  TEMPLATE("Template");

  private String value;

  CreativeAutoGenerateConfigGetV2DataVersion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeAutoGenerateConfigGetV2DataVersion fromValue(String value) {
    for (CreativeAutoGenerateConfigGetV2DataVersion b : CreativeAutoGenerateConfigGetV2DataVersion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeAutoGenerateConfigGetV2DataVersion> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeAutoGenerateConfigGetV2DataVersion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeAutoGenerateConfigGetV2DataVersion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeAutoGenerateConfigGetV2DataVersion.fromValue(value);
    }
  }
}

