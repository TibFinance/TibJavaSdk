
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.AcpOperationType;
import com.tib.api.model.ContactInfo;
import com.tib.api.model.enums.TransferFrequency;
import com.tib.api.model.enums.PadDirection;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseTransaction  extends LineBase  {

    
    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Gets or sets the date funds available.
     */
    @JsonProperty("DateFundsAvailable")
    private LocalDateTime dateFundsAvailable;

    /**
     * Gets or sets the target institution number.
     */
    @JsonProperty("TargetInstitutionNumber")
    private String targetInstitutionNumber;

    /**
     * Gets or sets the target full account number.
     */
    @JsonProperty("TargetFullAccountNumber")
    private String targetFullAccountNumber;

    /**
     * Gets or sets the name of the target.
     */
    @JsonProperty("TargetName")
    private String targetName;

    /**
     * Gets or sets the reference number.
     */
    @JsonProperty("RefNumber")
    private String refNumber;

    /**
     * Specifies the operation category used throughout the API.
     */
    @JsonProperty("OperationType")
    private AcpOperationType operationType;

    /**
     * 
     */
    @JsonProperty("TargetContactInfo")
    private ContactInfo targetContactInfo;

    /**
     * Defines the frequency at which transfers occur within the TIB Finance API.
     */
    @JsonProperty("TransferFrequency")
    private TransferFrequency transferFrequency;


    
    public BaseTransaction() {
    }

    
    public BaseTransaction(Double amount, LocalDateTime dateFundsAvailable, String targetInstitutionNumber, String targetFullAccountNumber, String targetName, String refNumber, AcpOperationType operationType, ContactInfo targetContactInfo, TransferFrequency transferFrequency) {
        this.amount = amount;
        this.dateFundsAvailable = dateFundsAvailable;
        this.targetInstitutionNumber = targetInstitutionNumber;
        this.targetFullAccountNumber = targetFullAccountNumber;
        this.targetName = targetName;
        this.refNumber = refNumber;
        this.operationType = operationType;
        this.targetContactInfo = targetContactInfo;
        this.transferFrequency = transferFrequency;
    }
    
    
    public BaseTransaction(char defaultPaddingChar, PadDirection defaultPaddingDirection, Double amount, LocalDateTime dateFundsAvailable, String targetInstitutionNumber, String targetFullAccountNumber, String targetName, String refNumber, AcpOperationType operationType, ContactInfo targetContactInfo, TransferFrequency transferFrequency) {
        super(defaultPaddingChar, defaultPaddingDirection);
        this.amount = amount;
        this.dateFundsAvailable = dateFundsAvailable;
        this.targetInstitutionNumber = targetInstitutionNumber;
        this.targetFullAccountNumber = targetFullAccountNumber;
        this.targetName = targetName;
        this.refNumber = refNumber;
        this.operationType = operationType;
        this.targetContactInfo = targetContactInfo;
        this.transferFrequency = transferFrequency;
    }

    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateFundsAvailable() {
        return dateFundsAvailable;
    }

    public void setDateFundsAvailable(LocalDateTime dateFundsAvailable) {
        this.dateFundsAvailable = dateFundsAvailable;
    }

    public String getTargetInstitutionNumber() {
        return targetInstitutionNumber;
    }

    public void setTargetInstitutionNumber(String targetInstitutionNumber) {
        this.targetInstitutionNumber = targetInstitutionNumber;
    }

    public String getTargetFullAccountNumber() {
        return targetFullAccountNumber;
    }

    public void setTargetFullAccountNumber(String targetFullAccountNumber) {
        this.targetFullAccountNumber = targetFullAccountNumber;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public AcpOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(AcpOperationType operationType) {
        this.operationType = operationType;
    }

    public ContactInfo getTargetContactInfo() {
        return targetContactInfo;
    }

    public void setTargetContactInfo(ContactInfo targetContactInfo) {
        this.targetContactInfo = targetContactInfo;
    }

    public TransferFrequency getTransferFrequency() {
        return transferFrequency;
    }

    public void setTransferFrequency(TransferFrequency transferFrequency) {
        this.transferFrequency = transferFrequency;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseTransaction that = (BaseTransaction) o;
        return Objects.equals(amount, that.amount) && Objects.equals(dateFundsAvailable, that.dateFundsAvailable) && Objects.equals(targetInstitutionNumber, that.targetInstitutionNumber) && Objects.equals(targetFullAccountNumber, that.targetFullAccountNumber) && Objects.equals(targetName, that.targetName) && Objects.equals(refNumber, that.refNumber) && Objects.equals(operationType, that.operationType) && Objects.equals(targetContactInfo, that.targetContactInfo) && Objects.equals(transferFrequency, that.transferFrequency) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(amount, dateFundsAvailable, targetInstitutionNumber, targetFullAccountNumber, targetName, refNumber, operationType, targetContactInfo, transferFrequency);
    }

    @Override
    public String toString() {
        return "BaseTransaction{" +
                "amount='" + amount + '\'' +
                ", dateFundsAvailable='" + dateFundsAvailable + '\'' +
                ", targetInstitutionNumber='" + targetInstitutionNumber + '\'' +
                ", targetFullAccountNumber='" + targetFullAccountNumber + '\'' +
                ", targetName='" + targetName + '\'' +
                ", refNumber='" + refNumber + '\'' +
                ", operationType='" + operationType + '\'' +
                ", targetContactInfo='" + targetContactInfo + '\'' +
                ", transferFrequency='" + transferFrequency + '\'' +

                '}';
    }
}