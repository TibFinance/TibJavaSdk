
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.Language;
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


public class RequestDataResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("MerchantId")
    private String merchantId;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("CustomerId")
    private String customerId;

    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    @JsonProperty("TransferType")
    private TransferType transferType;

    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    @JsonProperty("Language")
    private Language language;

    @JsonProperty("TransactionDueDate")
    private LocalDateTime transactionDueDate;


    public RequestDataResponse(Error[] errors, boolean hasError, String messages, String merchantId, Double amount, String customerId, String paymentMethodId, TransferType transferType, String referenceNumber, Language language, LocalDateTime transactionDueDate) {
        super(errors, hasError, messages);
        this.merchantId = merchantId;
this.amount = amount;
this.customerId = customerId;
this.paymentMethodId = paymentMethodId;
this.transferType = transferType;
this.referenceNumber = referenceNumber;
this.language = language;
this.transactionDueDate = transactionDueDate;

    }

    public RequestDataResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.transferType = objectMapper.readValue(json, TransferType.class);
this.language = objectMapper.readValue(json, Language.class);

        }
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LocalDateTime getTransactionDueDate() {
        return transactionDueDate;
    }

    public void setTransactionDueDate(LocalDateTime transactionDueDate) {
        this.transactionDueDate = transactionDueDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestDataResponse that = (RequestDataResponse) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(amount, that.amount) && Objects.equals(customerId, that.customerId) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(transferType, that.transferType) && Objects.equals(referenceNumber, that.referenceNumber) && Objects.equals(language, that.language) && Objects.equals(transactionDueDate, that.transactionDueDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, amount, customerId, paymentMethodId, transferType, referenceNumber, language, transactionDueDate);
    }

    @Override
    public String toString() {
        return "RequestDataResponse{" +
                 "merchantId='" + merchantId + '\'' +
 ", amount='" + amount + '\'' +
 ", customerId='" + customerId + '\'' +
 ", paymentMethodId='" + paymentMethodId + '\'' +
 ", transferType='" + transferType + '\'' +
 ", referenceNumber='" + referenceNumber + '\'' +
 ", language='" + language + '\'' +
 ", transactionDueDate='" + transactionDueDate + '\'' +

                '}';
    }
}