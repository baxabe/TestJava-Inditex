/*
 * Java Test
 * API-REST End point to get price by data range
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baxabe.inditex.controller.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Price
 */
@JsonPropertyOrder({
  Price.JSON_PROPERTY_PRODUCT_ID,
  Price.JSON_PROPERTY_BRAND_ID,
  Price.JSON_PROPERTY_PRICE_LIST_ID,
  Price.JSON_PROPERTY_START_DATE,
  Price.JSON_PROPERTY_END_DATE,
  Price.JSON_PROPERTY_PRICE
})
@.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:42:05.742187229+02:00[Europe/Madrid]")
public class Price {
  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private Long productId;

  public static final String JSON_PROPERTY_BRAND_ID = "brandId";
  private Long brandId;

  public static final String JSON_PROPERTY_PRICE_LIST_ID = "priceListId";
  private Long priceListId;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Long price;

  public Price() { 
  }

  public Price productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Product id
   * @return productId
  **/
  @.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public Price brandId(Long brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Brand id
   * @return brandId
  **/
  @.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getBrandId() {
    return brandId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public Price priceListId(Long priceListId) {
    this.priceListId = priceListId;
    return this;
  }

   /**
   * Price list id
   * @return priceListId
  **/
  @.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPriceListId() {
    return priceListId;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPriceListId(Long priceListId) {
    this.priceListId = priceListId;
  }


  public Price startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date formatted as example
   * @return startDate
  **/
  @.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Price endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date formatted as example
   * @return endDate
  **/
  @.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Price price(Long price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(Long price) {
    this.price = price;
  }


  /**
   * Return true if this Price object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.productId, price.productId) &&
        Objects.equals(this.brandId, price.brandId) &&
        Objects.equals(this.priceListId, price.priceListId) &&
        Objects.equals(this.startDate, price.startDate) &&
        Objects.equals(this.endDate, price.endDate) &&
        Objects.equals(this.price, price.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, brandId, priceListId, startDate, endDate, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    priceListId: ").append(toIndentedString(priceListId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

