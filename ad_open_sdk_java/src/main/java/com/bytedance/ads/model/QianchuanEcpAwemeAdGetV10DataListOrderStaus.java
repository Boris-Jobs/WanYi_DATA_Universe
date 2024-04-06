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
@JsonAdapter(QianchuanEcpAwemeAdGetV10DataListOrderStaus.Adapter.class)
public enum QianchuanEcpAwemeAdGetV10DataListOrderStaus {
  
  AUDITING("AUDITING"),
  
  BOOK("BOOK"),
  
  CREATING("CREATING"),
  
  DELIVERING("DELIVERING"),
  
  FAILED("FAILED"),
  
  FINISHED("FINISHED"),
  
  OVER("OVER"),
  
  REJECT("REJECT"),
  
  UNDELIVERING("UNDELIVERING"),
  
  UNPAID("UNPAID");

  private String value;

  QianchuanEcpAwemeAdGetV10DataListOrderStaus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanEcpAwemeAdGetV10DataListOrderStaus fromValue(String value) {
    for (QianchuanEcpAwemeAdGetV10DataListOrderStaus b : QianchuanEcpAwemeAdGetV10DataListOrderStaus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanEcpAwemeAdGetV10DataListOrderStaus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanEcpAwemeAdGetV10DataListOrderStaus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanEcpAwemeAdGetV10DataListOrderStaus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanEcpAwemeAdGetV10DataListOrderStaus.fromValue(value);
    }
  }
}

