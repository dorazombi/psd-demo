package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.flu.domain.model.Amount;
import dev.flu.domain.model.LinksPaymentInitiationMultiLevelSca;
import dev.flu.domain.model.TppMessages;
import dev.flu.domain.model.TransactionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the response for a successful payment initiation request.
 */
@ApiModel(description = "Body of the response for a successful payment initiation request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class PaymentInitationRequestMultiLevelScaResponse201   {
  @JsonProperty("transactionStatus")
  private TransactionStatus transactionStatus = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("transactionFees")
  private Amount transactionFees = null;

  @JsonProperty("transactionFeeIndicator")
  private Boolean transactionFeeIndicator = null;

  @JsonProperty("_links")
  private LinksPaymentInitiationMultiLevelSca links = null;

  @JsonProperty("psuMessage")
  private String psuMessage = null;

  @JsonProperty("tppMessages")
  private TppMessages tppMessages = null;

  public PaymentInitationRequestMultiLevelScaResponse201 transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PaymentInitationRequestMultiLevelScaResponse201 paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Resource identification of the generated payment initiation resource.
   * @return paymentId
  **/
  @ApiModelProperty(example = "1234-wertiq-983", required = true, value = "Resource identification of the generated payment initiation resource.")
  @NotNull


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentInitationRequestMultiLevelScaResponse201 transactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
    return this;
  }

  /**
   * Get transactionFees
   * @return transactionFees
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTransactionFees() {
    return transactionFees;
  }

  public void setTransactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
  }

  public PaymentInitationRequestMultiLevelScaResponse201 transactionFeeIndicator(Boolean transactionFeeIndicator) {
    this.transactionFeeIndicator = transactionFeeIndicator;
    return this;
  }

  /**
   * If equals 'true', the transaction will involve specific transaction cost as shown by the ASPSP in their public price list or as agreed between ASPSP and PSU. If equals 'false', the transaction will not involve additional specific transaction costs to the PSU. 
   * @return transactionFeeIndicator
  **/
  @ApiModelProperty(value = "If equals 'true', the transaction will involve specific transaction cost as shown by the ASPSP in their public price list or as agreed between ASPSP and PSU. If equals 'false', the transaction will not involve additional specific transaction costs to the PSU. ")


  public Boolean getTransactionFeeIndicator() {
    return transactionFeeIndicator;
  }

  public void setTransactionFeeIndicator(Boolean transactionFeeIndicator) {
    this.transactionFeeIndicator = transactionFeeIndicator;
  }

  public PaymentInitationRequestMultiLevelScaResponse201 links(LinksPaymentInitiationMultiLevelSca links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LinksPaymentInitiationMultiLevelSca getLinks() {
    return links;
  }

  public void setLinks(LinksPaymentInitiationMultiLevelSca links) {
    this.links = links;
  }

  public PaymentInitationRequestMultiLevelScaResponse201 psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }

  /**
   * Text to be displayed to the PSU
   * @return psuMessage
  **/
  @ApiModelProperty(value = "Text to be displayed to the PSU")

@Size(max=512) 
  public String getPsuMessage() {
    return psuMessage;
  }

  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }

  public PaymentInitationRequestMultiLevelScaResponse201 tppMessages(TppMessages tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  /**
   * Get tppMessages
   * @return tppMessages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TppMessages getTppMessages() {
    return tppMessages;
  }

  public void setTppMessages(TppMessages tppMessages) {
    this.tppMessages = tppMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitationRequestMultiLevelScaResponse201 paymentInitationRequestMultiLevelScaResponse201 = (PaymentInitationRequestMultiLevelScaResponse201) o;
    return Objects.equals(this.transactionStatus, paymentInitationRequestMultiLevelScaResponse201.transactionStatus) &&
        Objects.equals(this.paymentId, paymentInitationRequestMultiLevelScaResponse201.paymentId) &&
        Objects.equals(this.transactionFees, paymentInitationRequestMultiLevelScaResponse201.transactionFees) &&
        Objects.equals(this.transactionFeeIndicator, paymentInitationRequestMultiLevelScaResponse201.transactionFeeIndicator) &&
        Objects.equals(this.links, paymentInitationRequestMultiLevelScaResponse201.links) &&
        Objects.equals(this.psuMessage, paymentInitationRequestMultiLevelScaResponse201.psuMessage) &&
        Objects.equals(this.tppMessages, paymentInitationRequestMultiLevelScaResponse201.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, paymentId, transactionFees, transactionFeeIndicator, links, psuMessage, tppMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitationRequestMultiLevelScaResponse201 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    transactionFeeIndicator: ").append(toIndentedString(transactionFeeIndicator)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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

