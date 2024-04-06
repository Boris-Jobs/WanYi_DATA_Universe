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
@JsonAdapter(QianchuanFileVideoAwemeGetV10DataPageInfoHasMore.Adapter.class)
public enum QianchuanFileVideoAwemeGetV10DataPageInfoHasMore {
  
  NUMBER_1(1l),
  
  NUMBER_0(0l);

  private Long value;

  QianchuanFileVideoAwemeGetV10DataPageInfoHasMore(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanFileVideoAwemeGetV10DataPageInfoHasMore fromValue(Long value) {
    for (QianchuanFileVideoAwemeGetV10DataPageInfoHasMore b : QianchuanFileVideoAwemeGetV10DataPageInfoHasMore.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanFileVideoAwemeGetV10DataPageInfoHasMore> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanFileVideoAwemeGetV10DataPageInfoHasMore enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanFileVideoAwemeGetV10DataPageInfoHasMore read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanFileVideoAwemeGetV10DataPageInfoHasMore.fromValue(value);
    }
  }
}
