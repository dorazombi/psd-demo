package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets messageCodeTextPiisSpecific
 */
public enum MessageCodeTextPiisSpecific {
  
  CARD_INVALID("CARD_INVALID"),
  
  NO_PIIS_ACTIVATION("NO_PIIS_ACTIVATION");

  private String value;

  MessageCodeTextPiisSpecific(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageCodeTextPiisSpecific fromValue(String text) {
    for (MessageCodeTextPiisSpecific b : MessageCodeTextPiisSpecific.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

