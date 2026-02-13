
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BillLineEntity   {

    
    /**
 * Unique identifier for the line item (optional on creation, will be assigned by system)
 */
    @JsonProperty("BillLineId")
    private String billLineId;

    /**
 * Line number for ordering (1-based)
 */
    @JsonProperty("LineNumber")
    private Integer lineNumber;

    /**
 * Product SKUcode (optional)
 */
    @JsonProperty("ProductSku")
    private String productSku;

    /**
 * Product name (required)
 */
    @JsonProperty("ProductName")
    private String productName;

    /**
 * Product description (optional)
 */
    @JsonProperty("ProductDescription")
    private String productDescription;

    /**
 * Quantity (default: 1)
 */
    @JsonProperty("Quantity")
    private Double quantity;

    /**
 * Unit of measure (e.g., "unit", "hour", "kg")
 */
    @JsonProperty("UnitOfMeasure")
    private String unitOfMeasure;

    /**
 * Unit price
 */
    @JsonProperty("UnitPrice")
    private Double unitPrice;

    /**
 * Discount percentage for this line (0-100)
 */
    @JsonProperty("DiscountPercent")
    private Double discountPercent;

    /**
 * Discount amount for this line (alternative to percentage)
 */
    @JsonProperty("DiscountAmount")
    private Double discountAmount;

    /**
 * Tax code (e.g., "TX" for taxable, "NT" for non-taxable)
 */
    @JsonProperty("TaxCode")
    private String taxCode;

    /**
 * Whether this line is taxable
 */
    @JsonProperty("IsTaxable")
    private boolean isTaxable;

    /**
 * Calculated line subtotal (Quantity * UnitPrice - Discount) Read-only on response, calculated by system
 */
    @JsonProperty("LineSubtotal")
    private Double lineSubtotal;

    /**
 * Calculated tax amount for this line Read-only on response, calculated by system
 */
    @JsonProperty("LineTaxAmount")
    private Double lineTaxAmount;

    /**
 * Calculated line total (Subtotal + Tax) Read-only on response, calculated by system
 */
    @JsonProperty("LineTotal")
    private Double lineTotal;


    
    public BillLineEntity() {
    }

    
    public BillLineEntity(String billLineId, Integer lineNumber, String productSku, String productName, String productDescription, Double quantity, String unitOfMeasure, Double unitPrice, Double discountPercent, Double discountAmount, String taxCode, boolean isTaxable, Double lineSubtotal, Double lineTaxAmount, Double lineTotal) {
        this.billLineId = billLineId;
this.lineNumber = lineNumber;
this.productSku = productSku;
this.productName = productName;
this.productDescription = productDescription;
this.quantity = quantity;
this.unitOfMeasure = unitOfMeasure;
this.unitPrice = unitPrice;
this.discountPercent = discountPercent;
this.discountAmount = discountAmount;
this.taxCode = taxCode;
this.isTaxable = isTaxable;
this.lineSubtotal = lineSubtotal;
this.lineTaxAmount = lineTaxAmount;
this.lineTotal = lineTotal;

    }
    
    

    
    public String getBillLineId() {
        return billLineId;
    }

    public void setBillLineId(String billLineId) {
        this.billLineId = billLineId;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public boolean getIsTaxable() {
        return isTaxable;
    }

    public void setIsTaxable(boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public Double getLineSubtotal() {
        return lineSubtotal;
    }

    public void setLineSubtotal(Double lineSubtotal) {
        this.lineSubtotal = lineSubtotal;
    }

    public Double getLineTaxAmount() {
        return lineTaxAmount;
    }

    public void setLineTaxAmount(Double lineTaxAmount) {
        this.lineTaxAmount = lineTaxAmount;
    }

    public Double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Double lineTotal) {
        this.lineTotal = lineTotal;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillLineEntity that = (BillLineEntity) o;
        return Objects.equals(billLineId, that.billLineId) && Objects.equals(lineNumber, that.lineNumber) && Objects.equals(productSku, that.productSku) && Objects.equals(productName, that.productName) && Objects.equals(productDescription, that.productDescription) && Objects.equals(quantity, that.quantity) && Objects.equals(unitOfMeasure, that.unitOfMeasure) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(discountPercent, that.discountPercent) && Objects.equals(discountAmount, that.discountAmount) && Objects.equals(taxCode, that.taxCode) && Objects.equals(isTaxable, that.isTaxable) && Objects.equals(lineSubtotal, that.lineSubtotal) && Objects.equals(lineTaxAmount, that.lineTaxAmount) && Objects.equals(lineTotal, that.lineTotal) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billLineId, lineNumber, productSku, productName, productDescription, quantity, unitOfMeasure, unitPrice, discountPercent, discountAmount, taxCode, isTaxable, lineSubtotal, lineTaxAmount, lineTotal);
    }

    @Override
    public String toString() {
        return "BillLineEntity{" +
                 "billLineId='" + billLineId + '\'' +
 ", lineNumber='" + lineNumber + '\'' +
 ", productSku='" + productSku + '\'' +
 ", productName='" + productName + '\'' +
 ", productDescription='" + productDescription + '\'' +
 ", quantity='" + quantity + '\'' +
 ", unitOfMeasure='" + unitOfMeasure + '\'' +
 ", unitPrice='" + unitPrice + '\'' +
 ", discountPercent='" + discountPercent + '\'' +
 ", discountAmount='" + discountAmount + '\'' +
 ", taxCode='" + taxCode + '\'' +
 ", isTaxable='" + isTaxable + '\'' +
 ", lineSubtotal='" + lineSubtotal + '\'' +
 ", lineTaxAmount='" + lineTaxAmount + '\'' +
 ", lineTotal='" + lineTotal + '\'' +

                '}';
    }
}