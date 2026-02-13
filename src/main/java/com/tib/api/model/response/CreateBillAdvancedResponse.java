
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.BillLineEntity;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateBillAdvancedResponse extends CustomAPIResponse {

    
    @JsonProperty("BillId")
    private String billId;

    @JsonProperty("InvoiceNumber")
    private String invoiceNumber;

    @JsonProperty("FullInvoiceNumber")
    private String fullInvoiceNumber;

    @JsonProperty("Subtotal")
    private Double subtotal;

    @JsonProperty("DiscountTotal")
    private Double discountTotal;

    @JsonProperty("TaxAmount1")
    private Double taxAmount1;

    @JsonProperty("TaxAmount2")
    private Double taxAmount2;

    @JsonProperty("TotalAmount")
    private Double totalAmount;

    @JsonProperty("Lines")
    private List<BillLineEntity> lines;

    @JsonProperty("PaymentUrl")
    private String paymentUrl;

    @JsonProperty("PdfUrl")
    private String pdfUrl;


    public CreateBillAdvancedResponse(Error[] errors, boolean hasError, String messages, String billId, String invoiceNumber, String fullInvoiceNumber, Double subtotal, Double discountTotal, Double taxAmount1, Double taxAmount2, Double totalAmount, List<BillLineEntity> lines, String paymentUrl, String pdfUrl) {
        super(errors, hasError, messages);
        this.billId = billId;
this.invoiceNumber = invoiceNumber;
this.fullInvoiceNumber = fullInvoiceNumber;
this.subtotal = subtotal;
this.discountTotal = discountTotal;
this.taxAmount1 = taxAmount1;
this.taxAmount2 = taxAmount2;
this.totalAmount = totalAmount;
this.lines = lines;
this.paymentUrl = paymentUrl;
this.pdfUrl = pdfUrl;

    }

    public CreateBillAdvancedResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.billId = apiResponse.getResponse().toString();
this.invoiceNumber = apiResponse.getResponse().toString();
this.fullInvoiceNumber = apiResponse.getResponse().toString();
this.subtotal = Double.parseDouble(apiResponse.getResponse().toString());
this.discountTotal = Double.parseDouble(apiResponse.getResponse().toString());
this.taxAmount1 = Double.parseDouble(apiResponse.getResponse().toString());
this.taxAmount2 = Double.parseDouble(apiResponse.getResponse().toString());
this.totalAmount = Double.parseDouble(apiResponse.getResponse().toString());
this.lines = (List<BillLineEntity>) apiResponse.getResponse();
this.paymentUrl = apiResponse.getResponse().toString();
this.pdfUrl = apiResponse.getResponse().toString();

        }
    }

    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getFullInvoiceNumber() {
        return fullInvoiceNumber;
    }

    public void setFullInvoiceNumber(String fullInvoiceNumber) {
        this.fullInvoiceNumber = fullInvoiceNumber;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(Double discountTotal) {
        this.discountTotal = discountTotal;
    }

    public Double getTaxAmount1() {
        return taxAmount1;
    }

    public void setTaxAmount1(Double taxAmount1) {
        this.taxAmount1 = taxAmount1;
    }

    public Double getTaxAmount2() {
        return taxAmount2;
    }

    public void setTaxAmount2(Double taxAmount2) {
        this.taxAmount2 = taxAmount2;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<BillLineEntity> getLines() {
        return lines;
    }

    public void setLines(List<BillLineEntity> lines) {
        this.lines = lines;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBillAdvancedResponse that = (CreateBillAdvancedResponse) o;
        return Objects.equals(billId, that.billId) && Objects.equals(invoiceNumber, that.invoiceNumber) && Objects.equals(fullInvoiceNumber, that.fullInvoiceNumber) && Objects.equals(subtotal, that.subtotal) && Objects.equals(discountTotal, that.discountTotal) && Objects.equals(taxAmount1, that.taxAmount1) && Objects.equals(taxAmount2, that.taxAmount2) && Objects.equals(totalAmount, that.totalAmount) && Objects.equals(lines, that.lines) && Objects.equals(paymentUrl, that.paymentUrl) && Objects.equals(pdfUrl, that.pdfUrl) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billId, invoiceNumber, fullInvoiceNumber, subtotal, discountTotal, taxAmount1, taxAmount2, totalAmount, lines, paymentUrl, pdfUrl);
    }

    @Override
    public String toString() {
        return "CreateBillAdvancedResponse{" +
                 "billId='" + billId + '\'' +
 ", invoiceNumber='" + invoiceNumber + '\'' +
 ", fullInvoiceNumber='" + fullInvoiceNumber + '\'' +
 ", subtotal='" + subtotal + '\'' +
 ", discountTotal='" + discountTotal + '\'' +
 ", taxAmount1='" + taxAmount1 + '\'' +
 ", taxAmount2='" + taxAmount2 + '\'' +
 ", totalAmount='" + totalAmount + '\'' +
 ", lines='" + lines + '\'' +
 ", paymentUrl='" + paymentUrl + '\'' +
 ", pdfUrl='" + pdfUrl + '\'' +

                '}';
    }
}