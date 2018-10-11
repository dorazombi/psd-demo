package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference to an account by the Primary Account Number (PAN) of a card,  can be tokenised by the ASPSP due to PCI DSS requirements.  
 */
@ApiModel(description = "Reference to an account by the Primary Account Number (PAN) of a card,  can be tokenised by the ASPSP due to PCI DSS requirements.  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class AccountReferencePan   {
  @JsonProperty("pan")
  private String pan = null;

  @JsonProperty("currency")
  private String currency = null;

  public AccountReferencePan pan(String pan) {
    this.pan = pan;
    return this;
  }

  /**
   * Primary Account Number according to ISO/IEC 7812. 
   * @return pan
  **/
  @ApiModelProperty(example = "5409050000000000", required = true, value = "Primary Account Number according to ISO/IEC 7812. ")
  @NotNull

@Size(max=35) 
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public AccountReferencePan currency(String currency) {
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
    AccountReferencePan accountReferencePan = (AccountReferencePan) o;
    return Objects.equals(this.pan, accountReferencePan.pan) &&
        Objects.equals(this.currency, accountReferencePan.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pan, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReferencePan {\n");
    
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
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

