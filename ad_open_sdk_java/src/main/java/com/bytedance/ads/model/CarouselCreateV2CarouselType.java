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
@JsonAdapter(CarouselCreateV2CarouselType.Adapter.class)
public enum CarouselCreateV2CarouselType {
  
  INFORMATION_FLOW_IMAGE("INFORMATION_FLOW_IMAGE"),
  
  SEARCH_DISPLAY_WINDOW_IMAGE("SEARCH_DISPLAY_WINDOW_IMAGE"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE"),
  
  UNSET("UNSET");

  private String value;

  CarouselCreateV2CarouselType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CarouselCreateV2CarouselType fromValue(String value) {
    for (CarouselCreateV2CarouselType b : CarouselCreateV2CarouselType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CarouselCreateV2CarouselType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CarouselCreateV2CarouselType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CarouselCreateV2CarouselType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CarouselCreateV2CarouselType.fromValue(value);
    }
  }
}
