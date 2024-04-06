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
@JsonAdapter(QianchuanAdPivativewordsUpdateV10DataStatus.Adapter.class)
public enum QianchuanAdPivativewordsUpdateV10DataStatus {
  
  UNKNOWN("UNKNOWN"),
  
  SUCCESS("SUCCESS"),
  
  FAIL("FAIL");

  private String value;

  QianchuanAdPivativewordsUpdateV10DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdPivativewordsUpdateV10DataStatus fromValue(String value) {
    for (QianchuanAdPivativewordsUpdateV10DataStatus b : QianchuanAdPivativewordsUpdateV10DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdPivativewordsUpdateV10DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdPivativewordsUpdateV10DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdPivativewordsUpdateV10DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdPivativewordsUpdateV10DataStatus.fromValue(value);
    }
  }
}
