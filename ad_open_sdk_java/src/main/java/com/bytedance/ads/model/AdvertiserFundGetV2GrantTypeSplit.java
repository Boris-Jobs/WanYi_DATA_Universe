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
@JsonAdapter(AdvertiserFundGetV2GrantTypeSplit.Adapter.class)
public enum AdvertiserFundGetV2GrantTypeSplit {
  
  OFF("OFF"),
  
  ON("ON");

  private String value;

  AdvertiserFundGetV2GrantTypeSplit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserFundGetV2GrantTypeSplit fromValue(String value) {
    for (AdvertiserFundGetV2GrantTypeSplit b : AdvertiserFundGetV2GrantTypeSplit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserFundGetV2GrantTypeSplit> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserFundGetV2GrantTypeSplit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserFundGetV2GrantTypeSplit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserFundGetV2GrantTypeSplit.fromValue(value);
    }
  }
}

