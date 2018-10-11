package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.flu.domain.model.AccountAccess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Content of the body of a consent request. 
 */
@ApiModel(description = "Content of the body of a consent request. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class Consents   {
  @JsonProperty("access")
  private AccountAccess access = null;

  @JsonProperty("recurringIndicator")
  private Boolean recurringIndicator = null;

  @JsonProperty("validUntil")
  private LocalDate validUntil = null;

  @JsonProperty("frequencyPerDay")
  private Integer frequencyPerDay = null;

  @JsonProperty("combinedServiceIndicator")
  private Boolean combinedServiceIndicator = null;

  public Consents access(AccountAccess access) {
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

  public Consents recurringIndicator(Boolean recurringIndicator) {
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

  public Consents validUntil(LocalDate validUntil) {
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

  public Consents frequencyPerDay(Integer frequencyPerDay) {
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

  public Consents combinedServiceIndicator(Boolean combinedServiceIndicator) {
    this.combinedServiceIndicator = combinedServiceIndicator;
    return this;
  }

  /**
   * If \"true\" indicates that a payment initiation service will be addressed in the same \"session\". 
   * @return combinedServiceIndicator
  **/
  @ApiModelProperty(required = true, value = "If \"true\" indicates that a payment initiation service will be addressed in the same \"session\". ")
  @NotNull


  public Boolean getCombinedServiceIndicator() {
    return combinedServiceIndicator;
  }

  public void setCombinedServiceIndicator(Boolean combinedServiceIndicator) {
    this.combinedServiceIndicator = combinedServiceIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consents consents = (Consents) o;
    return Objects.equals(this.access, consents.access) &&
        Objects.equals(this.recurringIndicator, consents.recurringIndicator) &&
        Objects.equals(this.validUntil, consents.validUntil) &&
        Objects.equals(this.frequencyPerDay, consents.frequencyPerDay) &&
        Objects.equals(this.combinedServiceIndicator, consents.combinedServiceIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, recurringIndicator, validUntil, frequencyPerDay, combinedServiceIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consents {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    frequencyPerDay: ").append(toIndentedString(frequencyPerDay)).append("\n");
    sb.append("    combinedServiceIndicator: ").append(toIndentedString(combinedServiceIndicator)).append("\n");
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

