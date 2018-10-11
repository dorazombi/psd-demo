package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets messageCodeTextPisSpecific
 */
public enum MessageCodeTextPisSpecific {
  
  PRODUCT_INVALID("PRODUCT_INVALID"),
  
  PRODUCT_UNKNOWN("PRODUCT_UNKNOWN"),
  
  PAYMENT_FAILED("PAYMENT_FAILED"),
  
  REQUIRED_KID_MISSING("REQUIRED_KID_MISSING"),
  
  EXECUTION_DATE_INVALID("EXECUTION_DATE_INVALID");

  private String value;

  MessageCodeTextPisSpecific(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCodeTextPisSpecific fromValue(String text) {
    for (MessageCodeTextPisSpecific b : MessageCodeTextPisSpecific.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

