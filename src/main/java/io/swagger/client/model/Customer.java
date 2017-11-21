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
import java.io.IOException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Customer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-21T13:53:33.030Z")
public class Customer {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("birhday")
  private LocalDate birhday = null;

  @SerializedName("vat")
  private Long vat = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("received_newsletter")
  private Boolean receivedNewsletter = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public Customer id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Customer firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "John", value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Customer lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "Doe", value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Customer active(Boolean active) {
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

  public Customer birhday(LocalDate birhday) {
    this.birhday = birhday;
    return this;
  }

   /**
   * Get birhday
   * @return birhday
  **/
  @ApiModelProperty(example = "2", value = "")
  public LocalDate getBirhday() {
    return birhday;
  }

  public void setBirhday(LocalDate birhday) {
    this.birhday = birhday;
  }

  public Customer vat(Long vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @ApiModelProperty(example = "1234567890", value = "")
  public Long getVat() {
    return vat;
  }

  public void setVat(Long vat) {
    this.vat = vat;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "foobar@foo.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "912345678", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Customer gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Customer receivedNewsletter(Boolean receivedNewsletter) {
    this.receivedNewsletter = receivedNewsletter;
    return this;
  }

   /**
   * Get receivedNewsletter
   * @return receivedNewsletter
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isReceivedNewsletter() {
    return receivedNewsletter;
  }

  public void setReceivedNewsletter(Boolean receivedNewsletter) {
    this.receivedNewsletter = receivedNewsletter;
  }

  public Customer createdAt(OffsetDateTime createdAt) {
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

  public Customer updatedAt(OffsetDateTime updatedAt) {
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
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.firstname, customer.firstname) &&
        Objects.equals(this.lastname, customer.lastname) &&
        Objects.equals(this.active, customer.active) &&
        Objects.equals(this.birhday, customer.birhday) &&
        Objects.equals(this.vat, customer.vat) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.company, customer.company) &&
        Objects.equals(this.gender, customer.gender) &&
        Objects.equals(this.receivedNewsletter, customer.receivedNewsletter) &&
        Objects.equals(this.createdAt, customer.createdAt) &&
        Objects.equals(this.updatedAt, customer.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstname, lastname, active, birhday, vat, email, phone, company, gender, receivedNewsletter, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    birhday: ").append(toIndentedString(birhday)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    receivedNewsletter: ").append(toIndentedString(receivedNewsletter)).append("\n");
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

