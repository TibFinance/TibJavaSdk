package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.PaymentFlow;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class PaymentInfo {

    @JsonProperty("PaymentFlow")
    private PaymentFlow paymentFlow;

    @JsonProperty("RelatedCustomerID")
    private String relatedCustomerID;

    @JsonProperty("DueDate")
    private LocalDateTime dueDate;

    @JsonProperty("Language")
    private Language language;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("ForcedCustomerPaymentMethodID")
    private String forcedCustomerPaymentMethodID;

    @JsonProperty("TransferFrequency")
    private String transferFrequency;

    @JsonProperty("GroupID")
    private String groupID;

    public PaymentInfo() {
    }

    public PaymentFlow getPaymentFlow() {
        return paymentFlow;
    }

    public void setPaymentFlow(PaymentFlow paymentFlow) {
        this.paymentFlow = paymentFlow;
    }

    public String getRelatedCustomerID() {
        return relatedCustomerID;
    }

    public void setRelatedCustomerID(String relatedCustomerID) {
        this.relatedCustomerID = relatedCustomerID;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PaymentInfo that = (PaymentInfo) o;
        return Objects.equals(paymentFlow, that.paymentFlow) &&
                Objects.equals(relatedCustomerID, that.relatedCustomerID) &&
                Objects.equals(dueDate, that.dueDate) &&
                language == that.language &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentFlow, relatedCustomerID, dueDate, language, amount);
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "paymentFlow=" + paymentFlow +
                ", relatedCustomerID='" + relatedCustomerID + '\'' +
                ", dueDate=" + dueDate +
                ", language=" + language +
                ", amount=" + amount +
                '}';
    }
}
