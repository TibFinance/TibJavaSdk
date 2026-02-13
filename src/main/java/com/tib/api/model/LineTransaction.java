
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.AcpOperationType;
import com.tib.api.model.enums.LineType;
import com.tib.api.model.enums.AcpOperationType;
import com.tib.api.model.ContactInfo;
import com.tib.api.model.enums.TransferFrequency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class LineTransaction  extends BaseTransaction  {

    
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
 * Gets or sets the type of the line.
 */
    @JsonProperty("LineType")
    private LineType lineType;


    
    public LineTransaction() {
    }

    
    public LineTransaction(Double amount, LocalDateTime dateFundsAvailable, String targetInstitutionNumber, String targetFullAccountNumber, String targetName, String refNumber, AcpOperationType operationType, LineType lineType) {
        this.amount = amount;
this.dateFundsAvailable = dateFundsAvailable;
this.targetInstitutionNumber = targetInstitutionNumber;
this.targetFullAccountNumber = targetFullAccountNumber;
this.targetName = targetName;
this.refNumber = refNumber;
this.operationType = operationType;
this.lineType = lineType;

    }
    
    
    public LineTransaction(ContactInfo targetContactInfo, TransferFrequency transferFrequency, Double amount, LocalDateTime dateFundsAvailable, String targetInstitutionNumber, String targetFullAccountNumber, String targetName, String refNumber, AcpOperationType operationType, LineType lineType) {
        super(amount, dateFundsAvailable, targetInstitutionNumber, targetFullAccountNumber, targetName, refNumber, operationType, targetContactInfo, transferFrequency);
        this.amount = amount;
this.dateFundsAvailable = dateFundsAvailable;
this.targetInstitutionNumber = targetInstitutionNumber;
this.targetFullAccountNumber = targetFullAccountNumber;
this.targetName = targetName;
this.refNumber = refNumber;
this.operationType = operationType;
this.lineType = lineType;

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

    public LineType getLineType() {
        return lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineTransaction that = (LineTransaction) o;
        return Objects.equals(amount, that.amount) && Objects.equals(dateFundsAvailable, that.dateFundsAvailable) && Objects.equals(targetInstitutionNumber, that.targetInstitutionNumber) && Objects.equals(targetFullAccountNumber, that.targetFullAccountNumber) && Objects.equals(targetName, that.targetName) && Objects.equals(refNumber, that.refNumber) && Objects.equals(operationType, that.operationType) && Objects.equals(lineType, that.lineType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(amount, dateFundsAvailable, targetInstitutionNumber, targetFullAccountNumber, targetName, refNumber, operationType, lineType);
    }

    @Override
    public String toString() {
        return "LineTransaction{" +
                 "amount='" + amount + '\'' +
 ", dateFundsAvailable='" + dateFundsAvailable + '\'' +
 ", targetInstitutionNumber='" + targetInstitutionNumber + '\'' +
 ", targetFullAccountNumber='" + targetFullAccountNumber + '\'' +
 ", targetName='" + targetName + '\'' +
 ", refNumber='" + refNumber + '\'' +
 ", operationType='" + operationType + '\'' +
 ", lineType='" + lineType + '\'' +

                '}';
    }
}