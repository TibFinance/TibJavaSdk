
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.AcpOperationType;
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


public class LineDefTransactionSegment  extends BaseTransaction  {

    
    /**
 * Gets the start position.
 */
    @JsonProperty("StartPosition")
    private Integer startPosition;

    /**
 * Specifies the operation category used throughout the API.
 */
    @JsonProperty("OperationType")
    private AcpOperationType operationType;

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
 * Gets or sets the short name of the organization.
 */
    @JsonProperty("ShortOrganizationName")
    private String shortOrganizationName;

    /**
 * Gets or sets the name of the target.
 */
    @JsonProperty("TargetName")
    private String targetName;

    /**
 * Gets or sets the name of the organization.
 */
    @JsonProperty("OrganizationName")
    private String organizationName;

    /**
 * Gets or sets the organization number.
 */
    @JsonProperty("OrganizationNumber")
    private String organizationNumber;

    /**
 * Gets or sets the reference number.
 */
    @JsonProperty("RefNumber")
    private String refNumber;

    /**
 * Gets or sets the return institution.
 */
    @JsonProperty("ReturnInstitution")
    private String returnInstitution;

    /**
 * Gets or sets the return account.
 */
    @JsonProperty("ReturnAccount")
    private String returnAccount;

    /**
 * Gets or sets the free organization field.
 */
    @JsonProperty("FreeOrganizationField")
    private String freeOrganizationField;


    
    public LineDefTransactionSegment() {
    }

    
    public LineDefTransactionSegment(Integer startPosition, AcpOperationType operationType, Double amount, LocalDateTime dateFundsAvailable, String targetInstitutionNumber, String targetFullAccountNumber, String shortOrganizationName, String targetName, String organizationName, String organizationNumber, String refNumber, String returnInstitution, String returnAccount, String freeOrganizationField) {
        this.startPosition = startPosition;
this.operationType = operationType;
this.amount = amount;
this.dateFundsAvailable = dateFundsAvailable;
this.targetInstitutionNumber = targetInstitutionNumber;
this.targetFullAccountNumber = targetFullAccountNumber;
this.shortOrganizationName = shortOrganizationName;
this.targetName = targetName;
this.organizationName = organizationName;
this.organizationNumber = organizationNumber;
this.refNumber = refNumber;
this.returnInstitution = returnInstitution;
this.returnAccount = returnAccount;
this.freeOrganizationField = freeOrganizationField;

    }
    
    
    public LineDefTransactionSegment(ContactInfo targetContactInfo, TransferFrequency transferFrequency, Integer startPosition, AcpOperationType operationType, Double amount, LocalDateTime dateFundsAvailable, String targetInstitutionNumber, String targetFullAccountNumber, String shortOrganizationName, String targetName, String organizationName, String organizationNumber, String refNumber, String returnInstitution, String returnAccount, String freeOrganizationField) {
        super(amount, dateFundsAvailable, targetInstitutionNumber, targetFullAccountNumber, targetName, refNumber, operationType, targetContactInfo, transferFrequency);
        this.startPosition = startPosition;
this.operationType = operationType;
this.amount = amount;
this.dateFundsAvailable = dateFundsAvailable;
this.targetInstitutionNumber = targetInstitutionNumber;
this.targetFullAccountNumber = targetFullAccountNumber;
this.shortOrganizationName = shortOrganizationName;
this.targetName = targetName;
this.organizationName = organizationName;
this.organizationNumber = organizationNumber;
this.refNumber = refNumber;
this.returnInstitution = returnInstitution;
this.returnAccount = returnAccount;
this.freeOrganizationField = freeOrganizationField;

    }

    
    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    public AcpOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(AcpOperationType operationType) {
        this.operationType = operationType;
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

    public String getShortOrganizationName() {
        return shortOrganizationName;
    }

    public void setShortOrganizationName(String shortOrganizationName) {
        this.shortOrganizationName = shortOrganizationName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getReturnInstitution() {
        return returnInstitution;
    }

    public void setReturnInstitution(String returnInstitution) {
        this.returnInstitution = returnInstitution;
    }

    public String getReturnAccount() {
        return returnAccount;
    }

    public void setReturnAccount(String returnAccount) {
        this.returnAccount = returnAccount;
    }

    public String getFreeOrganizationField() {
        return freeOrganizationField;
    }

    public void setFreeOrganizationField(String freeOrganizationField) {
        this.freeOrganizationField = freeOrganizationField;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineDefTransactionSegment that = (LineDefTransactionSegment) o;
        return Objects.equals(startPosition, that.startPosition) && Objects.equals(operationType, that.operationType) && Objects.equals(amount, that.amount) && Objects.equals(dateFundsAvailable, that.dateFundsAvailable) && Objects.equals(targetInstitutionNumber, that.targetInstitutionNumber) && Objects.equals(targetFullAccountNumber, that.targetFullAccountNumber) && Objects.equals(shortOrganizationName, that.shortOrganizationName) && Objects.equals(targetName, that.targetName) && Objects.equals(organizationName, that.organizationName) && Objects.equals(organizationNumber, that.organizationNumber) && Objects.equals(refNumber, that.refNumber) && Objects.equals(returnInstitution, that.returnInstitution) && Objects.equals(returnAccount, that.returnAccount) && Objects.equals(freeOrganizationField, that.freeOrganizationField) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(startPosition, operationType, amount, dateFundsAvailable, targetInstitutionNumber, targetFullAccountNumber, shortOrganizationName, targetName, organizationName, organizationNumber, refNumber, returnInstitution, returnAccount, freeOrganizationField);
    }

    @Override
    public String toString() {
        return "LineDefTransactionSegment{" +
                 "startPosition='" + startPosition + '\'' +
 ", operationType='" + operationType + '\'' +
 ", amount='" + amount + '\'' +
 ", dateFundsAvailable='" + dateFundsAvailable + '\'' +
 ", targetInstitutionNumber='" + targetInstitutionNumber + '\'' +
 ", targetFullAccountNumber='" + targetFullAccountNumber + '\'' +
 ", shortOrganizationName='" + shortOrganizationName + '\'' +
 ", targetName='" + targetName + '\'' +
 ", organizationName='" + organizationName + '\'' +
 ", organizationNumber='" + organizationNumber + '\'' +
 ", refNumber='" + refNumber + '\'' +
 ", returnInstitution='" + returnInstitution + '\'' +
 ", returnAccount='" + returnAccount + '\'' +
 ", freeOrganizationField='" + freeOrganizationField + '\'' +

                '}';
    }
}