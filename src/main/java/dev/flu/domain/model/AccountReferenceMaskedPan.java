package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference to an account by the Primary Account Number (PAN) of a card in a masked form. 
 */
@ApiModel(description = "Reference to an account by the Primary Account Number (PAN) of a card in a masked form. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class AccountReferenceMaskedPan   {
  @JsonProperty("maskedPan")
  private String maskedPan = null;

  @JsonProperty("currency")
  private String currency = null;

  public AccountReferenceMaskedPan maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

  /**
   * Masked Primary Account Number 
   * @return maskedPan
  **/
  @ApiModelProperty(example = "123456xxxxxx1234", required = true, value = "Masked Primary Account Number ")
  @NotNull

@Size(max=35) 
  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }

  public AccountReferenceMaskedPan currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217 Alpha 3 currency code 
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", value = "ISO 4217 Alpha 3 currency code ")

@Pattern(regexp="[A-Z]{3}") 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountReferenceMaskedPan accountReferenceMaskedPan = (AccountReferenceMaskedPan) o;
    return Objects.equals(this.maskedPan, accountReferenceMaskedPan.maskedPan) &&
        Objects.equals(this.currency, accountReferenceMaskedPan.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskedPan, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReferenceMaskedPan {\n");
    
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

