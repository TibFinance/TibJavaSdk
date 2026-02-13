
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PaymentEntity;
import com.tib.api.model.enums.AutorizedPaymentMethodFlags;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreatePaymentArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Retrieves or assigns the unique identifier for a bill.
 */
    @JsonProperty("BillId")
    private String billId;

    /**
 * Automatically assigns the customer linked to a payment from the customer associated with the specified bill. The method takes no action if the bill has no customer or if the payment already has a customer assigned.
 */
    @JsonProperty("SetPaymentCustomerFromBill")
    private boolean setPaymentCustomerFromBill;

    /**
 * Handles the acquisition and assignment of a customer's email address.
 */
    @JsonProperty("CustomerEmail")
    private String customerEmail;

    /**
 * Contains metadata for a payment operation.
 */
    @JsonProperty("PaymentInfo")
    private PaymentEntity paymentInfo;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Gets or sets the external reference identifier used to correlate this entity with an external system.
 */
    @JsonProperty("ExternalReferenceId")
    private String externalReferenceId;

    /**
 * Indicates whether the system aborts a payment when the amount exceeds the remaining bill balance.
 */
    @JsonProperty("SafetyToBreakIfOverRemainingBillAmount")
    private boolean safetyToBreakIfOverRemainingBillAmount;

    /**
 * 
 */
    @JsonProperty("AutorizedPaymentMethod")
    private AutorizedPaymentMethodFlags autorizedPaymentMethod;

    /**
 * Indicates if the system must request the customer's consent prior to executing the payment.
 */
    @JsonProperty("AskForCustomerConsent")
    private boolean askForCustomerConsent;

    /**
 * Specifies whether the payment creation request should omit sending the confirmation email.
 */
    @JsonProperty("DoNotSendEmail")
    private boolean doNotSendEmail;

    /**
 * Indicates whether the transfer should be executed immediately within the TIB Finance API.
 */
    @JsonProperty("ImmediateTransfer")
    private boolean immediateTransfer;

    /**
 * Represents a brief description used in statements to identify or clarify the transaction.
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