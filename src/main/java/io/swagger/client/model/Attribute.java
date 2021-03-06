/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AttributeOptions;
import io.swagger.client.model.I18n;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Attribute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-21T13:53:33.030Z")
public class Attribute {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("position")
  private Long position = null;

  @SerializedName("is_searchable")
  private Boolean isSearchable = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("options")
  private AttributeOptions options = null;

  @SerializedName("i18n")
  private I18n i18n = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public Attribute id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Attribute position(Long position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  public Attribute isSearchable(Boolean isSearchable) {
    this.isSearchable = isSearchable;
    return this;
  }

   /**
   * Get isSearchable
   * @return isSearchable
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsSearchable() {
    return isSearchable;
  }

  public void setIsSearchable(Boolean isSearchable) {
    this.isSearchable = isSearchable;
  }

  public Attribute active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Attribute options(AttributeOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public AttributeOptions getOptions() {
    return options;
  }

  public void setOptions(AttributeOptions options) {
    this.options = options;
  }

  public Attribute i18n(I18n i18n) {
    this.i18n = i18n;
    return this;
  }

   /**
   * Get i18n
   * @return i18n
  **/
  @ApiModelProperty(value = "")
  public I18n getI18n() {
    return i18n;
  }

  public void setI18n(I18n i18n) {
    this.i18n = i18n;
  }

  public Attribute createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Attribute updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.id, attribute.id) &&
        Objects.equals(this.position, attribute.position) &&
        Objects.equals(this.isSearchable, attribute.isSearchable) &&
        Objects.equals(this.active, attribute.active) &&
        Objects.equals(this.options, attribute.options) &&
        Objects.equals(this.i18n, attribute.i18n) &&
        Objects.equals(this.createdAt, attribute.createdAt) &&
        Objects.equals(this.updatedAt, attribute.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, position, isSearchable, active, options, i18n, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    isSearchable: ").append(toIndentedString(isSearchable)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    i18n: ").append(toIndentedString(i18n)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

