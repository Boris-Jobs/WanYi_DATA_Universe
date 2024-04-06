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
@JsonAdapter(QianchuanAwemeEstimateProfitV10AudienceAge.Adapter.class)
public enum QianchuanAwemeEstimateProfitV10AudienceAge {
  
  Enum_18_23("AGE_BETWEEN_18_23"),
  
  Enum_24_30("AGE_BETWEEN_24_30"),
  
  Enum_31_40("AGE_BETWEEN_31_40"),
  
  Enum_41_50("AGE_BETWEEN_41_50");

  private String value;

  QianchuanAwemeEstimateProfitV10AudienceAge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeEstimateProfitV10AudienceAge fromValue(String value) {
    for (QianchuanAwemeEstimateProfitV10AudienceAge b : QianchuanAwemeEstimateProfitV10AudienceAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeEstimateProfitV10AudienceAge> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeEstimateProfitV10AudienceAge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeEstimateProfitV10AudienceAge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeEstimateProfitV10AudienceAge.fromValue(value);
    }
  }
}

