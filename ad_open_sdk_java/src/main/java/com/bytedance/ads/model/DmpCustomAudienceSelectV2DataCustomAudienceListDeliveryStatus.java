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
@JsonAdapter(DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus.Adapter.class)
public enum DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus {
  
  NEED_PUBLISH("CUSTOM_AUDIENCE_DELIVERY_STATUS_NEED_PUBLISH"),
  
  AVAILABLE("CUSTOM_AUDIENCE_DELIVERY_STATUS_AVAILABLE"),
  
  UNAVAILABLE("CUSTOM_AUDIENCE_DELIVERY_STATUS_UNAVAILABLE"),
  
  NEED_PUSH("CUSTOM_AUDIENCE_DELIVERY_STATUS_NEED_PUSH");

  private String value;

  DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus fromValue(String value) {
    for (DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus b : DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus.fromValue(value);
    }
  }
}

