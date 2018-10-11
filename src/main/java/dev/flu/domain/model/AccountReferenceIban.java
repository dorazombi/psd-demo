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
@ApiModel(description = "Reference to an account by the Primary Account Number (PAN) of a card,  can be tokenised by the ASPSP due to PCI DSS requirements. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class AccountReferenceIban   {
  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("currency")
  private String currency = null;

  public AccountReferenceIban iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * IBAN of an account
   * @return iban
  **/
  @ApiModelProperty(example = "FR7612345987650123456789014", required = true, value = "IBAN of an account")
  @NotNull

@Pattern(regexp="[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}") 
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountReferenceIban currency(String currency) {
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
    AccountReferenceIban accountReferenceIban = (AccountReferenceIban) o;
    return Objects.equals(this.iban, accountReferenceIban.iban) &&
        Objects.equals(this.currency, accountReferenceIban.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReferenceIban {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

