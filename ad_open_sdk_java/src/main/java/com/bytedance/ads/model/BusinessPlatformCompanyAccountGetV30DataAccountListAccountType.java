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
@JsonAdapter(BusinessPlatformCompanyAccountGetV30DataAccountListAccountType.Adapter.class)
public enum BusinessPlatformCompanyAccountGetV30DataAccountListAccountType {
  
  AD("AD"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  BusinessPlatformCompanyAccountGetV30DataAccountListAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessPlatformCompanyAccountGetV30DataAccountListAccountType fromValue(String value) {
    for (BusinessPlatformCompanyAccountGetV30DataAccountListAccountType b : BusinessPlatformCompanyAccountGetV30DataAccountListAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BusinessPlatformCompanyAccountGetV30DataAccountListAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BusinessPlatformCompanyAccountGetV30DataAccountListAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BusinessPlatformCompanyAccountGetV30DataAccountListAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BusinessPlatformCompanyAccountGetV30DataAccountListAccountType.fromValue(value);
    }
  }
}
