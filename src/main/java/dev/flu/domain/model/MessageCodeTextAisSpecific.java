package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets messageCodeTextAisSpecific
 */
public enum MessageCodeTextAisSpecific {
  
  CONSENT_INVALID("CONSENT_INVALID"),
  
  SESSIONS_NOT_SUPPORTED("SESSIONS_NOT_SUPPORTED"),
  
  ACCESS_EXCEEDED("ACCESS_EXCEEDED"),
  
  REQUESTED_FORMATS_INVALID("REQUESTED_FORMATS_INVALID");

  private String value;

  MessageCodeTextAisSpecific(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCodeTextAisSpecific fromValue(String text) {
    for (MessageCodeTextAisSpecific b : MessageCodeTextAisSpecific.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

