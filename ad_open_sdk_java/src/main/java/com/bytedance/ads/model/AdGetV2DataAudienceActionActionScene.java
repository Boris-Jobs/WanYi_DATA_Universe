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
@JsonAdapter(AdGetV2DataAudienceActionActionScene.Adapter.class)
public enum AdGetV2DataAudienceActionActionScene {
  
  APP("APP"),
  
  NEWS("NEWS"),
  
  SEARCH("SEARCH"),
  
  E_COMMERCE("E-COMMERCE"),
  
  AD("AD");

  private String value;

  AdGetV2DataAudienceActionActionScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceActionActionScene fromValue(String value) {
    for (AdGetV2DataAudienceActionActionScene b : AdGetV2DataAudienceActionActionScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceActionActionScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceActionActionScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceActionActionScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceActionActionScene.fromValue(value);
    }
  }
}

