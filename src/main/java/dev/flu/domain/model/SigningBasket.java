package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.flu.domain.model.ConsentIdList;
import dev.flu.domain.model.PaymentIdList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON Body of a establish signing basket request 
 */
@ApiModel(description = "JSON Body of a establish signing basket request ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class SigningBasket   {
  @JsonProperty("paymentIds")
  private PaymentIdList paymentIds = null;

  @JsonProperty("consentIds")
  private ConsentIdList consentIds = null;

  public SigningBasket paymentIds(PaymentIdList paymentIds) {
    this.paymentIds = paymentIds;
    return this;
  }

  /**
   * Get paymentIds
   * @return paymentIds
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentIdList getPaymentIds() {
    return paymentIds;
  }

  public void setPaymentIds(PaymentIdList paymentIds) {
    this.paymentIds = paymentIds;
  }

  public SigningBasket consentIds(ConsentIdList consentIds) {
    this.consentIds = consentIds;
    return this;
  }

  /**
   * Get consentIds
   * @return consentIds
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ConsentIdList getConsentIds() {
    return consentIds;
  }

  public void setConsentIds(ConsentIdList consentIds) {
    this.consentIds = consentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningBasket signingBasket = (SigningBasket) o;
    return Objects.equals(this.paymentIds, signingBasket.paymentIds) &&
        Objects.equals(this.consentIds, signingBasket.consentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentIds, consentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningBasket {\n");
    
    sb.append("    paymentIds: ").append(toIndentedString(paymentIds)).append("\n");
    sb.append("    consentIds: ").append(toIndentedString(consentIds)).append("\n");
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

