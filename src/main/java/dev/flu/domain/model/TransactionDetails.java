package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.flu.domain.model.Amount;
import dev.flu.domain.model.ExchangeRateList;
import dev.flu.domain.model.LinksTransactionDetails;
import dev.flu.domain.model.PurposeCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction details
 */
@ApiModel(description = "Transaction details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class TransactionDetails   {
  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("entryReference")
  private String entryReference = null;

  @JsonProperty("endToEndId")
  private String endToEndId = null;

  @JsonProperty("mandateId")
  private String mandateId = null;

  @JsonProperty("checkId")
  private String checkId = null;

  @JsonProperty("creditorId")
  private String creditorId = null;

  @JsonProperty("bookingDate")
  private LocalDate bookingDate = null;

  @JsonProperty("valueDate")
  private LocalDate valueDate = null;

  @JsonProperty("transactionAmount")
  private Amount transactionAmount = null;

  @JsonProperty("exchangeRate")
  private ExchangeRateList exchangeRate = null;

  @JsonProperty("creditorName")
  private String creditorName = null;

  @JsonProperty("creditorAccount")
  private Object creditorAccount = null;

  @JsonProperty("ultimateCreditor")
  private String ultimateCreditor = null;

  @JsonProperty("debtorName")
  private String debtorName = null;

  @JsonProperty("debtorAccount")
  private Object debtorAccount = null;

  @JsonProperty("ultimateDebtor")
  private String ultimateDebtor = null;

  @JsonProperty("remittanceInformationUnstructured")
  private String remittanceInformationUnstructured = null;

  @JsonProperty("remittanceInformationStructured")
  private String remittanceInformationStructured = null;

  @JsonProperty("purposeCode")
  private PurposeCode purposeCode = null;

  @JsonProperty("bankTransactionCode")
  private String bankTransactionCode = null;

  @JsonProperty("proprietaryBankTransactionCode")
  private String proprietaryBankTransactionCode = null;

  @JsonProperty("_links")
  private LinksTransactionDetails links = null;

  public TransactionDetails transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * the Transaction Id can be used as access-ID in the API, where more details on an transaction is offered.  If this data attribute is provided this shows that the AIS can get access on more details about this  transaction using the GET Transaction Details Request  
   * @return transactionId
  **/
  @ApiModelProperty(value = "the Transaction Id can be used as access-ID in the API, where more details on an transaction is offered.  If this data attribute is provided this shows that the AIS can get access on more details about this  transaction using the GET Transaction Details Request  ")


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public TransactionDetails entryReference(String entryReference) {
    this.entryReference = entryReference;
    return this;
  }

  /**
   * Is the identification of the transaction as used e.g. for reference for deltafunction on application level.  The same identification as for example used within camt.05x messages. 
   * @return entryReference
  **/
  @ApiModelProperty(value = "Is the identification of the transaction as used e.g. for reference for deltafunction on application level.  The same identification as for example used within camt.05x messages. ")

@Size(max=35) 
  public String getEntryReference() {
    return entryReference;
  }

  public void setEntryReference(String entryReference) {
    this.entryReference = entryReference;
  }

  public TransactionDetails endToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  /**
   * Unique end to end identity.
   * @return endToEndId
  **/
  @ApiModelProperty(value = "Unique end to end identity.")

@Size(max=35) 
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }

  public TransactionDetails mandateId(String mandateId) {
    this.mandateId = mandateId;
    return this;
  }

  /**
   * Identification of Mandates, e.g. a SEPA Mandate ID.
   * @return mandateId
  **/
  @ApiModelProperty(value = "Identification of Mandates, e.g. a SEPA Mandate ID.")

@Size(max=35) 
  public String getMandateId() {
    return mandateId;
  }

  public void setMandateId(String mandateId) {
    this.mandateId = mandateId;
  }

  public TransactionDetails checkId(String checkId) {
    this.checkId = checkId;
    return this;
  }

  /**
   * Identification of a Cheque.
   * @return checkId
  **/
  @ApiModelProperty(value = "Identification of a Cheque.")

@Size(max=35) 
  public String getCheckId() {
    return checkId;
  }

  public void setCheckId(String checkId) {
    this.checkId = checkId;
  }

  public TransactionDetails creditorId(String creditorId) {
    this.creditorId = creditorId;
    return this;
  }

  /**
   * Identification of Creditors, e.g. a SEPA Creditor ID.
   * @return creditorId
  **/
  @ApiModelProperty(value = "Identification of Creditors, e.g. a SEPA Creditor ID.")

@Size(max=35) 
  public String getCreditorId() {
    return creditorId;
  }

  public void setCreditorId(String creditorId) {
    this.creditorId = creditorId;
  }

  public TransactionDetails bookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * The Date when an entry is posted to an account on the ASPSPs books. 
   * @return bookingDate
  **/
  @ApiModelProperty(value = "The Date when an entry is posted to an account on the ASPSPs books. ")

  @Valid

  public LocalDate getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
  }

  public TransactionDetails valueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * The Date at which assets become available to the account owner in case of a credit.
   * @return valueDate
  **/
  @ApiModelProperty(value = "The Date at which assets become available to the account owner in case of a credit.")

  @Valid

  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  public TransactionDetails transactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Amount getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public TransactionDetails exchangeRate(ExchangeRateList exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Get exchangeRate
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ExchangeRateList getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(ExchangeRateList exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public TransactionDetails creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  /**
   * Creditor Name
   * @return creditorName
  **/
  @ApiModelProperty(example = "Creditor Name", value = "Creditor Name")

@Size(max=70) 
  public String getCreditorName() {
    return creditorName;
  }

  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  public TransactionDetails creditorAccount(Object creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(value = "")


  public Object getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(Object creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public TransactionDetails ultimateCreditor(String ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
    return this;
  }

  /**
   * Ultimate Creditor
   * @return ultimateCreditor
  **/
  @ApiModelProperty(example = "Ultimate Creditor", value = "Ultimate Creditor")

@Size(max=70) 
  public String getUltimateCreditor() {
    return ultimateCreditor;
  }

  public void setUltimateCreditor(String ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
  }

  public TransactionDetails debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

  /**
   * Debtor Name
   * @return debtorName
  **/
  @ApiModelProperty(example = "Debtor Name", value = "Debtor Name")

@Size(max=70) 
  public String getDebtorName() {
    return debtorName;
  }

  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  public TransactionDetails debtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")


  public Object getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public TransactionDetails ultimateDebtor(String ultimateDebtor) {
    this.ultimateDebtor = ultimateDebtor;
    return this;
  }

  /**
   * Ultimate Debtor
   * @return ultimateDebtor
  **/
  @ApiModelProperty(example = "Ultimate Debtor", value = "Ultimate Debtor")

@Size(max=70) 
  public String getUltimateDebtor() {
    return ultimateDebtor;
  }

  public void setUltimateDebtor(String ultimateDebtor) {
    this.ultimateDebtor = ultimateDebtor;
  }

  public TransactionDetails remittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    return this;
  }

  /**
   * Get remittanceInformationUnstructured
   * @return remittanceInformationUnstructured
  **/
  @ApiModelProperty(value = "")

@Size(max=140) 
  public String getRemittanceInformationUnstructured() {
    return remittanceInformationUnstructured;
  }

  public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
  }

  public TransactionDetails remittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
    return this;
  }

  /**
   * Reference as contained in the structured remittance reference structure (without the surrounding XML structure).  Different from other places the content is containt in plain form not in form of a structered field. 
   * @return remittanceInformationStructured
  **/
  @ApiModelProperty(value = "Reference as contained in the structured remittance reference structure (without the surrounding XML structure).  Different from other places the content is containt in plain form not in form of a structered field. ")

@Size(max=140) 
  public String getRemittanceInformationStructured() {
    return remittanceInformationStructured;
  }

  public void setRemittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
  }

  public TransactionDetails purposeCode(PurposeCode purposeCode) {
    this.purposeCode = purposeCode;
    return this;
  }

  /**
   * Get purposeCode
   * @return purposeCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PurposeCode getPurposeCode() {
    return purposeCode;
  }

  public void setPurposeCode(PurposeCode purposeCode) {
    this.purposeCode = purposeCode;
  }

  public TransactionDetails bankTransactionCode(String bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  /**
   * Bank transaction code as used by the ASPSP and using the sub elements of this structured code defined by ISO 20022.   This code type is concatenating the three ISO20022 Codes    * Domain Code,    * Family Code, and    * SubFamiliy Code  by hyphens, resulting in “DomainCode”-“FamilyCode”-“SubFamilyCode”. 
   * @return bankTransactionCode
  **/
  @ApiModelProperty(example = "PMNT-RCDT-ESCT", value = "Bank transaction code as used by the ASPSP and using the sub elements of this structured code defined by ISO 20022.   This code type is concatenating the three ISO20022 Codes    * Domain Code,    * Family Code, and    * SubFamiliy Code  by hyphens, resulting in “DomainCode”-“FamilyCode”-“SubFamilyCode”. ")


  public String getBankTransactionCode() {
    return bankTransactionCode;
  }

  public void setBankTransactionCode(String bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  public TransactionDetails proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Proprietary bank transaction code as used within a community or within an ASPSP e.g.  for MT94x based transaction reports. 
   * @return proprietaryBankTransactionCode
  **/
  @ApiModelProperty(value = "Proprietary bank transaction code as used within a community or within an ASPSP e.g.  for MT94x based transaction reports. ")

@Size(max=35) 
  public String getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public TransactionDetails links(LinksTransactionDetails links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LinksTransactionDetails getLinks() {
    return links;
  }

  public void setLinks(LinksTransactionDetails links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetails transactionDetails = (TransactionDetails) o;
    return Objects.equals(this.transactionId, transactionDetails.transactionId) &&
        Objects.equals(this.entryReference, transactionDetails.entryReference) &&
        Objects.equals(this.endToEndId, transactionDetails.endToEndId) &&
        Objects.equals(this.mandateId, transactionDetails.mandateId) &&
        Objects.equals(this.checkId, transactionDetails.checkId) &&
        Objects.equals(this.creditorId, transactionDetails.creditorId) &&
        Objects.equals(this.bookingDate, transactionDetails.bookingDate) &&
        Objects.equals(this.valueDate, transactionDetails.valueDate) &&
        Objects.equals(this.transactionAmount, transactionDetails.transactionAmount) &&
        Objects.equals(this.exchangeRate, transactionDetails.exchangeRate) &&
        Objects.equals(this.creditorName, transactionDetails.creditorName) &&
        Objects.equals(this.creditorAccount, transactionDetails.creditorAccount) &&
        Objects.equals(this.ultimateCreditor, transactionDetails.ultimateCreditor) &&
        Objects.equals(this.debtorName, transactionDetails.debtorName) &&
        Objects.equals(this.debtorAccount, transactionDetails.debtorAccount) &&
        Objects.equals(this.ultimateDebtor, transactionDetails.ultimateDebtor) &&
        Objects.equals(this.remittanceInformationUnstructured, transactionDetails.remittanceInformationUnstructured) &&
        Objects.equals(this.remittanceInformationStructured, transactionDetails.remittanceInformationStructured) &&
        Objects.equals(this.purposeCode, transactionDetails.purposeCode) &&
        Objects.equals(this.bankTransactionCode, transactionDetails.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, transactionDetails.proprietaryBankTransactionCode) &&
        Objects.equals(this.links, transactionDetails.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, entryReference, endToEndId, mandateId, checkId, creditorId, bookingDate, valueDate, transactionAmount, exchangeRate, creditorName, creditorAccount, ultimateCreditor, debtorName, debtorAccount, ultimateDebtor, remittanceInformationUnstructured, remittanceInformationStructured, purposeCode, bankTransactionCode, proprietaryBankTransactionCode, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetails {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    entryReference: ").append(toIndentedString(entryReference)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

