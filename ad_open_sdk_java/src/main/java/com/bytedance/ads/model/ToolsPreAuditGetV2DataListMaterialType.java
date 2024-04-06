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
@JsonAdapter(ToolsPreAuditGetV2DataListMaterialType.Adapter.class)
public enum ToolsPreAuditGetV2DataListMaterialType {
  
  IMG("IMG"),
  
  SITE("SITE"),
  
  TITLE("TITLE"),
  
  VIDEO("VIDEO");

  private String value;

  ToolsPreAuditGetV2DataListMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPreAuditGetV2DataListMaterialType fromValue(String value) {
    for (ToolsPreAuditGetV2DataListMaterialType b : ToolsPreAuditGetV2DataListMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPreAuditGetV2DataListMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPreAuditGetV2DataListMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPreAuditGetV2DataListMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPreAuditGetV2DataListMaterialType.fromValue(value);
    }
  }
}
