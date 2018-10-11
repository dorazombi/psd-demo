package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.flu.domain.model.AccountAccess;
import dev.flu.domain.model.ConsentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body of the JSON response for a successfull get consent request.
 */
@ApiModel(description = "Body of the JSON response for a successfull get consent request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class ConsentInformationResponse200Json   {
  @JsonProperty("access")
  private AccountAccess access = null;

  @JsonProperty("recurringIndicator")
  private Boolean recurringIndicator = null;

  @JsonProperty("validUntil")
  private LocalDate validUntil = null;

  @JsonProperty("frequencyPerDay")
  private Integer frequencyPerDay = null;

  @JsonProperty("lastActionDate")
  private LocalDate lastActionDate = null;

  @JsonProperty("consentStatus")
  private ConsentStatus consentStatus = null;

  public ConsentInformationResponse200Json access(AccountAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountAccess getAccess() {
    return access;
  }

  public void setAccess(AccountAccess access) {
    this.access = access;
  }

  public ConsentInformationResponse200Json recurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
    return this;
  }

  /**
   * \"true\", if the consent is for recurring access to the account data.  \"false\", if the consent is for one access to the account data. 
   * @return recurringIndicator
  **/
  @ApiModelProperty(required = true, value = "\"true\", if the consent is for recurring access to the account data.  \"false\", if the consent is for one access to the account data. ")
  @NotNull


  public Boolean getRecurringIndicator() {
    return recurringIndicator;
  }

  public void setRecurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
  }

  public ConsentInformationResponse200Json validUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * This parameter is requesting a valid until date for the requested consent.  The content is the local ASPSP date in ISO-Date Format, e.g. 2017-10-30.   If a maximal available date is requested, a date in far future is to be used: \"9999-12-31\".  The consent object to be retrieved by the GET Consent Request will contain the adjusted date. 
   * @return validUntil
  **/
  @ApiModelProperty(required = true, value = "This parameter is requesting a valid until date for the requested consent.  The content is the local ASPSP date in ISO-Date Format, e.g. 2017-10-30.   If a maximal available date is requested, a date in far future is to be used: \"9999-12-31\".  The consent object to be retrieved by the GET Consent Request will contain the adjusted date. ")
  @NotNull

  @Valid

  public LocalDate getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }

  public ConsentInformationResponse200Json frequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
    return this;
  }

  /**
   * This field indicates the requested maximum frequency for an access per day. For a one-off access, this attribute is set to \"1\". 
   * @return frequencyPerDay
  **/
  @ApiModelProperty(example = "4", required = true, value = "This field indicates the requested maximum frequency for an access per day. For a one-off access, this attribute is set to \"1\". ")
  @NotNull


  public Integer getFrequencyPerDay() {
    return frequencyPerDay;
  }

  public void setFrequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
  }

  public ConsentInformationResponse200Json lastActionDate(LocalDate lastActionDate) {
    this.lastActionDate = lastActionDate;
    return this;
  }

  /**
   * This date is containing the date of the last action on the consent object either through  the XS2A interface or the PSU/ASPSP interface having an impact on the status. 
   * @return lastActionDate
  **/
  @ApiModelProperty(required = true, value = "This date is containing the date of the last action on the consent object either through  the XS2A interface or the PSU/ASPSP interface having an impact on the status. ")
  @NotNull

  @Valid

  public LocalDate getLastActionDate() {
    return lastActionDate;
  }

  public void setLastActionDate(LocalDate lastActionDate) {
    this.lastActionDate = lastActionDate;
  }

  public ConsentInformationResponse200Json consentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
    return this;
  }

  /**
   * Get consentStatus
   * @return consentStatus
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ConsentStatus getConsentStatus() {
    return consentStatus;
  }

  public void setConsentStatus(ConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentInformationResponse200Json consentInformationResponse200Json = (ConsentInformationResponse200Json) o;
    return Objects.equals(this.access, consentInformationResponse200Json.access) &&
        Objects.equals(this.recurringIndicator, consentInformationResponse200Json.recurringIndicator) &&
        Objects.equals(this.validUntil, consentInformationResponse200Json.validUntil) &&
        Objects.equals(this.frequencyPerDay, consentInformationResponse200Json.frequencyPerDay) &&
        Objects.equals(this.lastActionDate, consentInformationResponse200Json.lastActionDate) &&
        Objects.equals(this.consentStatus, consentInformationResponse200Json.consentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, recurringIndicator, validUntil, frequencyPerDay, lastActionDate, consentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentInformationResponse200Json {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    frequencyPerDay: ").append(toIndentedString(frequencyPerDay)).append("\n");
    sb.append("    lastActionDate: ").append(toIndentedString(lastActionDate)).append("\n");
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
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

