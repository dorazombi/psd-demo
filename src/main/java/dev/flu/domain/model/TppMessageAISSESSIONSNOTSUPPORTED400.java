package dev.flu.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.flu.domain.model.TppMessageCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The combined service flag may not be used with this ASPSP. 
 */
@ApiModel(description = "The combined service flag may not be used with this ASPSP. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-30T21:39:51.315+02:00[Europe/Berlin]")

public class TppMessageAISSESSIONSNOTSUPPORTED400   {
  @JsonProperty("category")
  private TppMessageCategory category = null;

  /**
   * Gets or Sets code
   */
  public enum CodeEnum {
    SESSIONS_NOT_SUPPORTED("SESSIONS_NOT_SUPPORTED");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("text")
  private String text = null;

  public TppMessageAISSESSIONSNOTSUPPORTED400 category(TppMessageCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TppMessageCategory getCategory() {
    return category;
  }

  public void setCategory(TppMessageCategory category) {
    this.category = category;
  }

  public TppMessageAISSESSIONSNOTSUPPORTED400 code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public TppMessageAISSESSIONSNOTSUPPORTED400 path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public TppMessageAISSESSIONSNOTSUPPORTED400 text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Additional explaining text to the TPP.
   * @return text
  **/
  @ApiModelProperty(value = "Additional explaining text to the TPP.")

@Size(max=512) 
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TppMessageAISSESSIONSNOTSUPPORTED400 tppMessageAISSESSIONSNOTSUPPORTED400 = (TppMessageAISSESSIONSNOTSUPPORTED400) o;
    return Objects.equals(this.category, tppMessageAISSESSIONSNOTSUPPORTED400.category) &&
        Objects.equals(this.code, tppMessageAISSESSIONSNOTSUPPORTED400.code) &&
        Objects.equals(this.path, tppMessageAISSESSIONSNOTSUPPORTED400.path) &&
        Objects.equals(this.text, tppMessageAISSESSIONSNOTSUPPORTED400.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, path, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TppMessageAISSESSIONSNOTSUPPORTED400 {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

