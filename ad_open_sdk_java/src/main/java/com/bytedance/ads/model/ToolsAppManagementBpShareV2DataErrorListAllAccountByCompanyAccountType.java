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
@JsonAdapter(ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType.Adapter.class)
public enum ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType {
  
  STAR("STAR"),
  
  AD("AD"),
  
  BP("BP");

  private String value;

  ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType fromValue(String value) {
    for (ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType b : ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementBpShareV2DataErrorListAllAccountByCompanyAccountType.fromValue(value);
    }
  }
}

