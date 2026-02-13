
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.FeeMode;
import com.tib.api.model.enums.FeeMode;
import com.tib.api.model.enums.FeeMode;
import com.tib.api.model.enums.ConvenientFeeMode;
import com.tib.api.model.enums.ConvenientFeeMode;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ServiceFeeSettings   {

    
    /**
 * Gets or sets the credit card fee mode applied to transactions.
 */
    @JsonProperty("CreditCardFeeMode")
    private FeeMode creditCardFeeMode;

    /**
 * Gets or sets the percentage fee applied to credit‑card transactions. The value is expressed as a decimal (e.g., 0.025 for 2.5%).
 */
    @JsonProperty("CreditCardPercentageFee")
    private Double creditCardPercentageFee;

    /**
 * Gets or sets the fixed absolute fee applied to credit‑card transactions. The fee is added to the transaction amount before calculating percentage fees.
 */
    @JsonProperty("CreditCardAbsoluteFee")
    private Double creditCardAbsoluteFee;

    /**
 * Gets or sets the mode used to calculate debit fees for a service.
 */
    @JsonProperty("DebitFeeMode")
    private FeeMode debitFeeMode;

    /**
 * Gets or sets the fee applied to debit transactions, expressed as a decimal percentage of the transaction amount. The value must be between 0 and 0.1 (up to 10%).
 */
    @JsonProperty("DebitPercentageFee")
    private Double debitPercentageFee;

    /**
 * Gets or sets the absolute fee applied to debit transactions. The fee must be within the permitted range.
 */
    @JsonProperty("DebitAbsoluteFee")
    private Double debitAbsoluteFee;

    /**
 * Gets or sets the fee mode applied to instant transfers.
 */
    @JsonProperty("InstantTransferFeeMode")
    private FeeMode instantTransferFeeMode;

    /**
 * Gets or sets the percentage fee applied to instant transfers. The value is expressed as a decimal fraction (e.g., 0.05 for 5%). Must be within the range 0 to 0.1 inclusive.
 */
    @JsonProperty("InstantTransferPercentageFee")
    private Double instantTransferPercentageFee;

    /**
 * Gets or sets the absolute fee applied to an instant transfer.
 */
    @JsonProperty("InstantTransferAbsoluteFee")
    private Double instantTransferAbsoluteFee;

    /**
 * Gets or sets the convenient fee credit mode used to determine the credit‑fee calculation for a service.
 */
    @JsonProperty("ConvenientFeeCreditMode")
    private ConvenientFeeMode convenientFeeCreditMode;

    /**
 * Gets or sets the percentage fee applied to convenient credit transactions.
 */
    @JsonProperty("ConvenientFeeCreditPercentageFee")
    private Double convenientFeeCreditPercentageFee;

    /**
 * Gets or sets the absolute fee for credit convenient fee transactions.
 */
    @JsonProperty("ConvenientFeeCreditAbsoluteFee")
    private Double convenientFeeCreditAbsoluteFee;

    /**
 * Gets or sets the amount used to round up a convenient fee credit.
 */
    @JsonProperty("ConvenientFeeCreditRoundUpValue")
    private Double convenientFeeCreditRoundUpValue;

    /**
 * Gets or sets the mode used to debit the convenient fee.
 */
    @JsonProperty("ConvenientFeeDebitMode")
    private ConvenientFeeMode convenientFeeDebitMode;

    /**
 * Gets or sets the percentage fee applied to convenient debit transactions.
 */
    @JsonProperty("ConvenientFeeDebitPercentageFee")
    private Double convenientFeeDebitPercentageFee;

    /**
 * Gets or sets the absolute fee applied to a convenient fee debit operation.
 */
    @JsonProperty("ConvenientFeeDebitAbsoluteFee")
    private Double convenientFeeDebitAbsoluteFee;

    /**
 * Gets or sets the monetary value used to round up a convenient fee debit.
 */
    @JsonProperty("ConvenientFeeDebitRoundUpValue")
    private Double convenientFeeDebitRoundUpValue;

    /**
 * The round-up amount applied to debit fees, expressed as a decimal value.
 */
    @JsonProperty("DebitFeeRoundUpValue")
    private Double debitFeeRoundUpValue;

    /**
 * Retrieves or assigns the rounding increment applied to credit‑card fees.
 */
    @JsonProperty("CreditCardFeeRoundUpValue")
    private Double creditCardFeeRoundUpValue;

    /**
 * Retrieves the round‑up value applied to the instant transfer fee.
 */
    @JsonProperty("InstantTransferFeeRoundUpValue")
    private Double instantTransferFeeRoundUpValue;

    /**
 * Gets the absolute fee amount that can be reverted for credit‑card transactions.
 */
    @JsonProperty("RevertCreditCardAbsoluteFees")
    private Double revertCreditCardAbsoluteFees;

    /**
 * Retrieves the percentage fee that is applied when a credit‑card transaction is reverted.
 */
    @JsonProperty("RevertCreditCardPercentageFees")
    private Double revertCreditCardPercentageFees;

    /**
 * Gets or sets the absolute fee amount that is reverted from a debit operation.
 */
    @JsonProperty("RevertDebitAbsoluteFees")
    private Double revertDebitAbsoluteFees;

    /**
 * Gets the percentage fee applied when a debit transaction is reverted.
 */
    @JsonProperty("RevertDebitPercentageFees")
    private Double revertDebitPercentageFees;

    /**
 * Retrieves the absolute fee charged for Interac transactions.
 */
    @JsonProperty("InteracFeeAbsolute")
    private Double interacFeeAbsolute;

    /**
 * Represents the fee percentage applied to Interac transactions.
 */
    @JsonProperty("InteracFeePercentage")
    private Double interacFeePercentage;

    /**
 * Gets the absolute Interac fee collected for a transaction.
 */
    @JsonProperty("InteracFeeCollectAbsolute")
    private Double interacFeeCollectAbsolute;

    /**
 * Specifies the percentage of the transaction amount that TIB Finance collects as a fee for Interac payments.
 */
    @JsonProperty("InteracFeeCollectPercentage")
    private Double interacFeeCollectPercentage;

    /**
 * Gets the fee amount charged for a debit transaction that fails due to non‑sufficient funds (NFS).
 */
    @JsonProperty("DebitNFSFees")
    private Double debitNFSFees;

    /**
 * Gets the fee amount applied to an NFS file transaction.
 */
    @JsonProperty("NFSFileFees")
    private Double nFSFileFees;

    /**
 * 
 */
    @JsonProperty("DataContext")
    private Integer dataContext;


    
    public ServiceFeeSettings() {
    }

    
    public ServiceFeeSettings(FeeMode creditCardFeeMode, Double creditCardPercentageFee, Double creditCardAbsoluteFee, FeeMode debitFeeMode, Double debitPercentageFee, Double debitAbsoluteFee, FeeMode instantTransferFeeMode, Double instantTransferPercentageFee, Double instantTransferAbsoluteFee, ConvenientFeeMode convenientFeeCreditMode, Double convenientFeeCreditPercentageFee, Double convenientFeeCreditAbsoluteFee, Double convenientFeeCreditRoundUpValue, ConvenientFeeMode convenientFeeDebitMode, Double convenientFeeDebitPercentageFee, Double convenientFeeDebitAbsoluteFee, Double convenientFeeDebitRoundUpValue, Double debitFeeRoundUpValue, Double creditCardFeeRoundUpValue, Double instantTransferFeeRoundUpValue, Double revertCreditCardAbsoluteFees, Double revertCreditCardPercentageFees, Double revertDebitAbsoluteFees, Double revertDebitPercentageFees, Double interacFeeAbsolute, Double interacFeePercentage, Double interacFeeCollectAbsolute, Double interacFeeCollectPercentage, Double debitNFSFees, Double nFSFileFees, Integer dataContext) {
        this.creditCardFeeMode = creditCardFeeMode;
this.creditCardPercentageFee = creditCardPercentageFee;
this.creditCardAbsoluteFee = creditCardAbsoluteFee;
this.debitFeeMode = debitFeeMode;
this.debitPercentageFee = debitPercentageFee;
this.debitAbsoluteFee = debitAbsoluteFee;
this.instantTransferFeeMode = instantTransferFeeMode;
this.instantTransferPercentageFee = instantTransferPercentageFee;
this.instantTransferAbsoluteFee = instantTransferAbsoluteFee;
this.convenientFeeCreditMode = convenientFeeCreditMode;
this.convenientFeeCreditPercentageFee = convenientFeeCreditPercentageFee;
this.convenientFeeCreditAbsoluteFee = convenientFeeCreditAbsoluteFee;
this.convenientFeeCreditRoundUpValue = convenientFeeCreditRoundUpValue;
this.convenientFeeDebitMode = convenientFeeDebitMode;
this.convenientFeeDebitPercentageFee = convenientFeeDebitPercentageFee;
this.convenientFeeDebitAbsoluteFee = convenientFeeDebitAbsoluteFee;
this.convenientFeeDebitRoundUpValue = convenientFeeDebitRoundUpValue;
this.debitFeeRoundUpValue = debitFeeRoundUpValue;
this.creditCardFeeRoundUpValue = creditCardFeeRoundUpValue;
this.instantTransferFeeRoundUpValue = instantTransferFeeRoundUpValue;
this.revertCreditCardAbsoluteFees = revertCreditCardAbsoluteFees;
this.revertCreditCardPercentageFees = revertCreditCardPercentageFees;
this.revertDebitAbsoluteFees = revertDebitAbsoluteFees;
this.revertDebitPercentageFees = revertDebitPercentageFees;
this.interacFeeAbsolute = interacFeeAbsolute;
this.interacFeePercentage = interacFeePercentage;
this.interacFeeCollectAbsolute = interacFeeCollectAbsolute;
this.interacFeeCollectPercentage = interacFeeCollectPercentage;
this.debitNFSFees = debitNFSFees;
this.nFSFileFees = nFSFileFees;
this.dataContext = dataContext;

    }
    
    

    
    public FeeMode getCreditCardFeeMode() {
        return creditCardFeeMode;
    }

    public void setCreditCardFeeMode(FeeMode creditCardFeeMode) {
        this.creditCardFeeMode = creditCardFeeMode;
    }

    public Double getCreditCardPercentageFee() {
        return creditCardPercentageFee;
    }

    public void setCreditCardPercentageFee(Double creditCardPercentageFee) {
        this.creditCardPercentageFee = creditCardPercentageFee;
    }

    public Double getCreditCardAbsoluteFee() {
        return creditCardAbsoluteFee;
    }

    public void setCreditCardAbsoluteFee(Double creditCardAbsoluteFee) {
        this.creditCardAbsoluteFee = creditCardAbsoluteFee;
    }

    public FeeMode getDebitFeeMode() {
        return debitFeeMode;
    }

    public void setDebitFeeMode(FeeMode debitFeeMode) {
        this.debitFeeMode = debitFeeMode;
    }

    public Double getDebitPercentageFee() {
        return debitPercentageFee;
    }

    public void setDebitPercentageFee(Double debitPercentageFee) {
        this.debitPercentageFee = debitPercentageFee;
    }

    public Double getDebitAbsoluteFee() {
        return debitAbsoluteFee;
    }

    public void setDebitAbsoluteFee(Double debitAbsoluteFee) {
        this.debitAbsoluteFee = debitAbsoluteFee;
    }

    public FeeMode getInstantTransferFeeMode() {
        return instantTransferFeeMode;
    }

    public void setInstantTransferFeeMode(FeeMode instantTransferFeeMode) {
        this.instantTransferFeeMode = instantTransferFeeMode;
    }

    public Double getInstantTransferPercentageFee() {
        return instantTransferPercentageFee;
    }

    public void setInstantTransferPercentageFee(Double instantTransferPercentageFee) {
        this.instantTransferPercentageFee = instantTransferPercentageFee;
    }

    public Double getInstantTransferAbsoluteFee() {
        return instantTransferAbsoluteFee;
    }

    public void setInstantTransferAbsoluteFee(Double instantTransferAbsoluteFee) {
        this.instantTransferAbsoluteFee = instantTransferAbsoluteFee;
    }

    public ConvenientFeeMode getConvenientFeeCreditMode() {
        return convenientFeeCreditMode;
    }

    public void setConvenientFeeCreditMode(ConvenientFeeMode convenientFeeCreditMode) {
        this.convenientFeeCreditMode = convenientFeeCreditMode;
    }

    public Double getConvenientFeeCreditPercentageFee() {
        return convenientFeeCreditPercentageFee;
    }

    public void setConvenientFeeCreditPercentageFee(Double convenientFeeCreditPercentageFee) {
        this.convenientFeeCreditPercentageFee = convenientFeeCreditPercentageFee;
    }

    public Double getConvenientFeeCreditAbsoluteFee() {
        return convenientFeeCreditAbsoluteFee;
    }

    public void setConvenientFeeCreditAbsoluteFee(Double convenientFeeCreditAbsoluteFee) {
        this.convenientFeeCreditAbsoluteFee = convenientFeeCreditAbsoluteFee;
    }

    public Double getConvenientFeeCreditRoundUpValue() {
        return convenientFeeCreditRoundUpValue;
    }

    public void setConvenientFeeCreditRoundUpValue(Double convenientFeeCreditRoundUpValue) {
        this.convenientFeeCreditRoundUpValue = convenientFeeCreditRoundUpValue;
    }

    public ConvenientFeeMode getConvenientFeeDebitMode() {
        return convenientFeeDebitMode;
    }

    public void setConvenientFeeDebitMode(ConvenientFeeMode convenientFeeDebitMode) {
        this.convenientFeeDebitMode = convenientFeeDebitMode;
    }

    public Double getConvenientFeeDebitPercentageFee() {
        return convenientFeeDebitPercentageFee;
    }

    public void setConvenientFeeDebitPercentageFee(Double convenientFeeDebitPercentageFee) {
        this.convenientFeeDebitPercentageFee = convenientFeeDebitPercentageFee;
    }

    public Double getConvenientFeeDebitAbsoluteFee() {
        return convenientFeeDebitAbsoluteFee;
    }

    public void setConvenientFeeDebitAbsoluteFee(Double convenientFeeDebitAbsoluteFee) {
        this.convenientFeeDebitAbsoluteFee = convenientFeeDebitAbsoluteFee;
    }

    public Double getConvenientFeeDebitRoundUpValue() {
        return convenientFeeDebitRoundUpValue;
    }

    public void setConvenientFeeDebitRoundUpValue(Double convenientFeeDebitRoundUpValue) {
        this.convenientFeeDebitRoundUpValue = convenientFeeDebitRoundUpValue;
    }

    public Double getDebitFeeRoundUpValue() {
        return debitFeeRoundUpValue;
    }

    public void setDebitFeeRoundUpValue(Double debitFeeRoundUpValue) {
        this.debitFeeRoundUpValue = debitFeeRoundUpValue;
    }

    public Double getCreditCardFeeRoundUpValue() {
        return creditCardFeeRoundUpValue;
    }

    public void setCreditCardFeeRoundUpValue(Double creditCardFeeRoundUpValue) {
        this.creditCardFeeRoundUpValue = creditCardFeeRoundUpValue;
    }

    public Double getInstantTransferFeeRoundUpValue() {
        return instantTransferFeeRoundUpValue;
    }

    public void setInstantTransferFeeRoundUpValue(Double instantTransferFeeRoundUpValue) {
        this.instantTransferFeeRoundUpValue = instantTransferFeeRoundUpValue;
    }

    public Double getRevertCreditCardAbsoluteFees() {
        return revertCreditCardAbsoluteFees;
    }

    public void setRevertCreditCardAbsoluteFees(Double revertCreditCardAbsoluteFees) {
        this.revertCreditCardAbsoluteFees = revertCreditCardAbsoluteFees;
    }

    public Double getRevertCreditCardPercentageFees() {
        return revertCreditCardPercentageFees;
    }

    public void setRevertCreditCardPercentageFees(Double revertCreditCardPercentageFees) {
        this.revertCreditCardPercentageFees = revertCreditCardPercentageFees;
    }

    public Double getRevertDebitAbsoluteFees() {
        return revertDebitAbsoluteFees;
    }

    public void setRevertDebitAbsoluteFees(Double revertDebitAbsoluteFees) {
        this.revertDebitAbsoluteFees = revertDebitAbsoluteFees;
    }

    public Double getRevertDebitPercentageFees() {
        return revertDebitPercentageFees;
    }

    public void setRevertDebitPercentageFees(Double revertDebitPercentageFees) {
        this.revertDebitPercentageFees = revertDebitPercentageFees;
    }

    public Double getInteracFeeAbsolute() {
        return interacFeeAbsolute;
    }

    public void setInteracFeeAbsolute(Double interacFeeAbsolute) {
        this.interacFeeAbsolute = interacFeeAbsolute;
    }

    public Double getInteracFeePercentage() {
        return interacFeePercentage;
    }

    public void setInteracFeePercentage(Double interacFeePercentage) {
        this.interacFeePercentage = interacFeePercentage;
    }

    public Double getInteracFeeCollectAbsolute() {
        return interacFeeCollectAbsolute;
    }

    public void setInteracFeeCollectAbsolute(Double interacFeeCollectAbsolute) {
        this.interacFeeCollectAbsolute = interacFeeCollectAbsolute;
    }

    public Double getInteracFeeCollectPercentage() {
        return interacFeeCollectPercentage;
    }

    public void setInteracFeeCollectPercentage(Double interacFeeCollectPercentage) {
        this.interacFeeCollectPercentage = interacFeeCollectPercentage;
    }

    public Double getDebitNFSFees() {
        return debitNFSFees;
    }

    public void setDebitNFSFees(Double debitNFSFees) {
        this.debitNFSFees = debitNFSFees;
    }

    public Double getNFSFileFees() {
        return nFSFileFees;
    }

    public void setNFSFileFees(Double nFSFileFees) {
        this.nFSFileFees = nFSFileFees;
    }

    public Integer getDataContext() {
        return dataContext;
    }

    public void setDataContext(Integer dataContext) {
        this.dataContext = dataContext;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceFeeSettings that = (ServiceFeeSettings) o;
        return Objects.equals(creditCardFeeMode, that.creditCardFeeMode) && Objects.equals(creditCardPercentageFee, that.creditCardPercentageFee) && Objects.equals(creditCardAbsoluteFee, that.creditCardAbsoluteFee) && Objects.equals(debitFeeMode, that.debitFeeMode) && Objects.equals(debitPercentageFee, that.debitPercentageFee) && Objects.equals(debitAbsoluteFee, that.debitAbsoluteFee) && Objects.equals(instantTransferFeeMode, that.instantTransferFeeMode) && Objects.equals(instantTransferPercentageFee, that.instantTransferPercentageFee) && Objects.equals(instantTransferAbsoluteFee, that.instantTransferAbsoluteFee) && Objects.equals(convenientFeeCreditMode, that.convenientFeeCreditMode) && Objects.equals(convenientFeeCreditPercentageFee, that.convenientFeeCreditPercentageFee) && Objects.equals(convenientFeeCreditAbsoluteFee, that.convenientFeeCreditAbsoluteFee) && Objects.equals(convenientFeeCreditRoundUpValue, that.convenientFeeCreditRoundUpValue) && Objects.equals(convenientFeeDebitMode, that.convenientFeeDebitMode) && Objects.equals(convenientFeeDebitPercentageFee, that.convenientFeeDebitPercentageFee) && Objects.equals(convenientFeeDebitAbsoluteFee, that.convenientFeeDebitAbsoluteFee) && Objects.equals(convenientFeeDebitRoundUpValue, that.convenientFeeDebitRoundUpValue) && Objects.equals(debitFeeRoundUpValue, that.debitFeeRoundUpValue) && Objects.equals(creditCardFeeRoundUpValue, that.creditCardFeeRoundUpValue) && Objects.equals(instantTransferFeeRoundUpValue, that.instantTransferFeeRoundUpValue) && Objects.equals(revertCreditCardAbsoluteFees, that.revertCreditCardAbsoluteFees) && Objects.equals(revertCreditCardPercentageFees, that.revertCreditCardPercentageFees) && Objects.equals(revertDebitAbsoluteFees, that.revertDebitAbsoluteFees) && Objects.equals(revertDebitPercentageFees, that.revertDebitPercentageFees) && Objects.equals(interacFeeAbsolute, that.interacFeeAbsolute) && Objects.equals(interacFeePercentage, that.interacFeePercentage) && Objects.equals(interacFeeCollectAbsolute, that.interacFeeCollectAbsolute) && Objects.equals(interacFeeCollectPercentage, that.interacFeeCollectPercentage) && Objects.equals(debitNFSFees, that.debitNFSFees) && Objects.equals(nFSFileFees, that.nFSFileFees) && Objects.equals(dataContext, that.dataContext) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(creditCardFeeMode, creditCardPercentageFee, creditCardAbsoluteFee, debitFeeMode, debitPercentageFee, debitAbsoluteFee, instantTransferFeeMode, instantTransferPercentageFee, instantTransferAbsoluteFee, convenientFeeCreditMode, convenientFeeCreditPercentageFee, convenientFeeCreditAbsoluteFee, convenientFeeCreditRoundUpValue, convenientFeeDebitMode, convenientFeeDebitPercentageFee, convenientFeeDebitAbsoluteFee, convenientFeeDebitRoundUpValue, debitFeeRoundUpValue, creditCardFeeRoundUpValue, instantTransferFeeRoundUpValue, revertCreditCardAbsoluteFees, revertCreditCardPercentageFees, revertDebitAbsoluteFees, revertDebitPercentageFees, interacFeeAbsolute, interacFeePercentage, interacFeeCollectAbsolute, interacFeeCollectPercentage, debitNFSFees, nFSFileFees, dataContext);
    }

    @Override
    public String toString() {
        return "ServiceFeeSettings{" +
                 "creditCardFeeMode='" + creditCardFeeMode + '\'' +
 ", creditCardPercentageFee='" + creditCardPercentageFee + '\'' +
 ", creditCardAbsoluteFee='" + creditCardAbsoluteFee + '\'' +
 ", debitFeeMode='" + debitFeeMode + '\'' +
 ", debitPercentageFee='" + debitPercentageFee + '\'' +
 ", debitAbsoluteFee='" + debitAbsoluteFee + '\'' +
 ", instantTransferFeeMode='" + instantTransferFeeMode + '\'' +
 ", instantTransferPercentageFee='" + instantTransferPercentageFee + '\'' +
 ", instantTransferAbsoluteFee='" + instantTransferAbsoluteFee + '\'' +
 ", convenientFeeCreditMode='" + convenientFeeCreditMode + '\'' +
 ", convenientFeeCreditPercentageFee='" + convenientFeeCreditPercentageFee + '\'' +
 ", convenientFeeCreditAbsoluteFee='" + convenientFeeCreditAbsoluteFee + '\'' +
 ", convenientFeeCreditRoundUpValue='" + convenientFeeCreditRoundUpValue + '\'' +
 ", convenientFeeDebitMode='" + convenientFeeDebitMode + '\'' +
 ", convenientFeeDebitPercentageFee='" + convenientFeeDebitPercentageFee + '\'' +
 ", convenientFeeDebitAbsoluteFee='" + convenientFeeDebitAbsoluteFee + '\'' +
 ", convenientFeeDebitRoundUpValue='" + convenientFeeDebitRoundUpValue + '\'' +
 ", debitFeeRoundUpValue='" + debitFeeRoundUpValue + '\'' +
 ", creditCardFeeRoundUpValue='" + creditCardFeeRoundUpValue + '\'' +
 ", instantTransferFeeRoundUpValue='" + instantTransferFeeRoundUpValue + '\'' +
 ", revertCreditCardAbsoluteFees='" + revertCreditCardAbsoluteFees + '\'' +
 ", revertCreditCardPercentageFees='" + revertCreditCardPercentageFees + '\'' +
 ", revertDebitAbsoluteFees='" + revertDebitAbsoluteFees + '\'' +
 ", revertDebitPercentageFees='" + revertDebitPercentageFees + '\'' +
 ", interacFeeAbsolute='" + interacFeeAbsolute + '\'' +
 ", interacFeePercentage='" + interacFeePercentage + '\'' +
 ", interacFeeCollectAbsolute='" + interacFeeCollectAbsolute + '\'' +
 ", interacFeeCollectPercentage='" + interacFeeCollectPercentage + '\'' +
 ", debitNFSFees='" + debitNFSFees + '\'' +
 ", nFSFileFees='" + nFSFileFees + '\'' +
 ", dataContext='" + dataContext + '\'' +

                '}';
    }
}