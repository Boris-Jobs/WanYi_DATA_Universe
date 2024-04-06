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
@JsonAdapter(ToolsEstimateAudienceV2DeviceBrand.Adapter.class)
public enum ToolsEstimateAudienceV2DeviceBrand {
  
  PEPPER("PEPPER"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  APPLE("APPLE"),
  
  NOKIA("NOKIA"),
  
  LENOVO("LENOVO"),
  
  HISENSE("HISENSE"),
  
  SMARTISAN("SMARTISAN"),
  
  LETV("LETV"),
  
  LG("LG"),
  
  NUBIA("NUBIA"),
  
  ONEPLUS("ONEPLUS"),
  
  Enum_360("360"),
  
  QIKU("QIKU"),
  
  SONY("SONY"),
  
  HONOR("HONOR"),
  
  GOOGLE("GOOGLE"),
  
  COOLPAD("COOLPAD"),
  
  HTC("HTC"),
  
  TCL("TCL"),
  
  OPPO("OPPO"),
  
  SAMSUNG("SAMSUNG"),
  
  HUAWEI("HUAWEI"),
  
  GIONEE("GIONEE"),
  
  MOTO("MOTO"),
  
  ZTE("ZTE"),
  
  MEIZU("MEIZU"),
  
  XIAOMI("XIAOMI"),
  
  VIVO("VIVO");

  private String value;

  ToolsEstimateAudienceV2DeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2DeviceBrand fromValue(String value) {
    for (ToolsEstimateAudienceV2DeviceBrand b : ToolsEstimateAudienceV2DeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2DeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2DeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2DeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2DeviceBrand.fromValue(value);
    }
  }
}
