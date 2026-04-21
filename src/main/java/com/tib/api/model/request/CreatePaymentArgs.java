
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PaymentEntity;
import com.tib.api.model.enums.AutorizedPaymentMethodFlags;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreatePaymentArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Unique identifier of the bill to be paid
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * Indicates whether the payment’s customer should be automatically taken from the associated bill.
     */
    @JsonProperty("SetPaymentCustomerFromBill")
    private boolean setPaymentCustomerFromBill;

    /**
     * The email address of the customer initiating the payment.
     */
    @JsonProperty("CustomerEmail")
    private String customerEmail;

    /**
     * PaymentInfo provides the full set of data required to create a new payment.
     */
    @JsonProperty("PaymentInfo")
    private PaymentEntity paymentInfo;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * A client‑provided unique identifier for the payment request
     */
    @JsonProperty("ExternalReferenceId")
    private String externalReferenceId;

    /**
     * Indicates whether the payment should be split when its amount exceeds the remaining bill balance.
     */
    @JsonProperty("SafetyToBreakIfOverRemainingBillAmount")
    private boolean safetyToBreakIfOverRemainingBillAmount;

    /**
     * Flags indicating which payment methods are authorized for the created payment
     */
    @JsonProperty("AutorizedPaymentMethod")
    private AutorizedPaymentMethodFlags autorizedPaymentMethod;

    /**
     * Indicates whether the platform must request the customer's consent before processing the payment.
     */
    @JsonProperty("AskForCustomerConsent")
    private boolean askForCustomerConsent;

    /**
     * Controls whether a payment confirmation email is sent
     */
    @JsonProperty("DoNotSendEmail")
    private boolean doNotSendEmail;

    /**
     * Indicates whether the payment should be executed as an immediate transfer.
     */
    @JsonProperty("ImmediateTransfer")
    private boolean immediateTransfer;

    /**
     * The text that will appear on the payer’s bank statement for this payment.
     */
    @JsonProperty("StatementDescription")
    private String statementDescription;


    
    public CreatePaymentArgs() {
    }

    
    public CreatePaymentArgs(String billId, boolean setPaymentCustomerFromBill, String customerEmail, PaymentEntity paymentInfo, String merchantId, String externalReferenceId, boolean safetyToBreakIfOverRemainingBillAmount, AutorizedPaymentMethodFlags autorizedPaymentMethod, boolean askForCustomerConsent, boolean doNotSendEmail, boolean immediateTransfer, String statementDescription) {
        this.billId = billId;
        this.setPaymentCustomerFromBill = setPaymentCustomerFromBill;
        this.customerEmail = customerEmail;
        this.paymentInfo = paymentInfo;
        this.merchantId = merchantId;
        this.externalReferenceId = externalReferenceId;
        this.safetyToBreakIfOverRemainingBillAmount = safetyToBreakIfOverRemainingBillAmount;
        this.autorizedPaymentMethod = autorizedPaymentMethod;
        this.askForCustomerConsent = askForCustomerConsent;
        this.doNotSendEmail = doNotSendEmail;
        this.immediateTransfer = immediateTransfer;
        this.statementDescription = statementDescription;
    }
    
    
    public CreatePaymentArgs(String sessionToken, String billId, boolean setPaymentCustomerFromBill, String customerEmail, PaymentEntity paymentInfo, String merchantId, String externalReferenceId, boolean safetyToBreakIfOverRemainingBillAmount, AutorizedPaymentMethodFlags autorizedPaymentMethod, boolean askForCustomerConsent, boolean doNotSendEmail, boolean immediateTransfer, String statementDescription) {
        super(sessionToken);
        this.billId = billId;
        this.setPaymentCustomerFromBill = setPaymentCustomerFromBill;
        this.customerEmail = customerEmail;
        this.paymentInfo = paymentInfo;
        this.merchantId = merchantId;
        this.externalReferenceId = externalReferenceId;
        this.safetyToBreakIfOverRemainingBillAmount = safetyToBreakIfOverRemainingBillAmount;
        this.autorizedPaymentMethod = autorizedPaymentMethod;
        this.askForCustomerConsent = askForCustomerConsent;
        this.doNotSendEmail = doNotSendEmail;
        this.immediateTransfer = immediateTransfer;
        this.statementDescription = statementDescription;
    }

    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public boolean getSetPaymentCustomerFromBill() {
        return setPaymentCustomerFromBill;
    }

    public void setSetPaymentCustomerFromBill(boolean setPaymentCustomerFromBill) {
        this.setPaymentCustomerFromBill = setPaymentCustomerFromBill;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public PaymentEntity getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentEntity paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    public void setExternalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
    }

    public boolean getSafetyToBreakIfOverRemainingBillAmount() {
        return safetyToBreakIfOverRemainingBillAmount;
    }

    public void setSafetyToBreakIfOverRemainingBillAmount(boolean safetyToBreakIfOverRemainingBillAmount) {
        this.safetyToBreakIfOverRemainingBillAmount = safetyToBreakIfOverRemainingBillAmount;
    }

    public AutorizedPaymentMethodFlags getAutorizedPaymentMethod() {
        return autorizedPaymentMethod;
    }

    public void setAutorizedPaymentMethod(AutorizedPaymentMethodFlags autorizedPaymentMethod) {
        this.autorizedPaymentMethod = autorizedPaymentMethod;
    }

    public boolean getAskForCustomerConsent() {
        return askForCustomerConsent;
    }

    public void setAskForCustomerConsent(boolean askForCustomerConsent) {
        this.askForCustomerConsent = askForCustomerConsent;
    }

    public boolean getDoNotSendEmail() {
        return doNotSendEmail;
    }

    public void setDoNotSendEmail(boolean doNotSendEmail) {
        this.doNotSendEmail = doNotSendEmail;
    }

    public boolean getImmediateTransfer() {
        return immediateTransfer;
    }

    public void setImmediateTransfer(boolean immediateTransfer) {
        this.immediateTransfer = immediateTransfer;
    }

    public String getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(String statementDescription) {
        this.statementDescription = statementDescription;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatePaymentArgs that = (CreatePaymentArgs) o;
        return Objects.equals(billId, that.billId) && Objects.equals(setPaymentCustomerFromBill, that.setPaymentCustomerFromBill) && Objects.equals(customerEmail, that.customerEmail) && Objects.equals(paymentInfo, that.paymentInfo) && Objects.equals(merchantId, that.merchantId) && Objects.equals(externalReferenceId, that.externalReferenceId) && Objects.equals(safetyToBreakIfOverRemainingBillAmount, that.safetyToBreakIfOverRemainingBillAmount) && Objects.equals(autorizedPaymentMethod, that.autorizedPaymentMethod) && Objects.equals(askForCustomerConsent, that.askForCustomerConsent) && Objects.equals(doNotSendEmail, that.doNotSendEmail) && Objects.equals(immediateTransfer, that.immediateTransfer) && Objects.equals(statementDescription, that.statementDescription) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billId, setPaymentCustomerFromBill, customerEmail, paymentInfo, merchantId, externalReferenceId, safetyToBreakIfOverRemainingBillAmount, autorizedPaymentMethod, askForCustomerConsent, doNotSendEmail, immediateTransfer, statementDescription);
    }

    @Override
    public String toString() {
        return "CreatePaymentArgs{" +
                "billId='" + billId + '\'' +
                ", setPaymentCustomerFromBill='" + setPaymentCustomerFromBill + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", paymentInfo='" + paymentInfo + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", externalReferenceId='" + externalReferenceId + '\'' +
                ", safetyToBreakIfOverRemainingBillAmount='" + safetyToBreakIfOverRemainingBillAmount + '\'' +
                ", autorizedPaymentMethod='" + autorizedPaymentMethod + '\'' +
                ", askForCustomerConsent='" + askForCustomerConsent + '\'' +
                ", doNotSendEmail='" + doNotSendEmail + '\'' +
                ", immediateTransfer='" + immediateTransfer + '\'' +
                ", statementDescription='" + statementDescription + '\'' +

                '}';
    }
}