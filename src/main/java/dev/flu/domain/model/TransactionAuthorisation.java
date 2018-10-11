package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Content of the body of a Transaction Authorisation Request 
 */
@ApiModel(description = "Content of the body of a Transaction Authorisation Request ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class TransactionAuthorisation   {
  @JsonProperty("scaAuthenticationData")
  private String scaAuthenticationData = null;

  public TransactionAuthorisation scaAuthenticationData(String scaAuthenticationData) {
    this.scaAuthenticationData = scaAuthenticationData;
    return this;
  }

  /**
   * SCA authentication data, depending on the chosen authentication method.  If the data is binary, then it is base64 encoded. 
   * @return scaAuthenticationData
  **/
  @ApiModelProperty(required = true, value = "SCA authentication data, depending on the chosen authentication method.  If the data is binary, then it is base64 encoded. ")
  @NotNull


  public String getScaAuthenticationData() {
    return scaAuthenticationData;
  }

  public void setScaAuthenticationData(String scaAuthenticationData) {
    this.scaAuthenticationData = scaAuthenticationData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionAuthorisation transactionAuthorisation = (TransactionAuthorisation) o;
    return Objects.equals(this.scaAuthenticationData, transactionAuthorisation.scaAuthenticationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaAuthenticationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionAuthorisation {\n");
    
    sb.append("    scaAuthenticationData: ").append(toIndentedString(scaAuthenticationData)).append("\n");
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

