
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.FeeMode;
import com.tib.api.model.enums.ConvenientFeeMode;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ServiceFeeSettings   {

    
    /**
     * Specifies the fee calculation mode used for credit‑card transactions.
     */
    @JsonProperty("CreditCardFeeMode")
    private FeeMode creditCardFeeMode;

    /**
     * The percentage fee applied to credit‑card transactions for the service.
     */
    @JsonProperty("CreditCardPercentageFee")
    private Double creditCardPercentageFee;

    /**
     * The fixed monetary fee applied to a credit‑card transaction.
     */
    @JsonProperty("CreditCardAbsoluteFee")
    private Double creditCardAbsoluteFee;

    /**
     * Specifies the fee calculation mode applied to debit transactions for the service.
     */
    @JsonProperty("DebitFeeMode")
    private FeeMode debitFeeMode;

    /**
     * The percentage fee applied to debit transactions for the requested service.
     */
    @JsonProperty("DebitPercentageFee")
    private Double debitPercentageFee;

    /**
     * The fixed absolute fee applied to a debit transaction.
     */
    @JsonProperty("DebitAbsoluteFee")
    private Double debitAbsoluteFee;

    /**
     * Indicates the fee calculation mode applied to an instant transfer.
     */
    @JsonProperty("InstantTransferFeeMode")
    private FeeMode instantTransferFeeMode;

    /**
     * The percentage fee applied to an instant transfer, expressed as a decimal.
     */
    @JsonProperty("InstantTransferPercentageFee")
    private Double instantTransferPercentageFee;

    /**
     * The fixed absolute fee applied to an instant transfer.
     */
    @JsonProperty("InstantTransferAbsoluteFee")
    private Double instantTransferAbsoluteFee;

    /**
     * Specifies the fee‑crediting mode applied to the service request.
     */
    @JsonProperty("ConvenientFeeCreditMode")
    private ConvenientFeeMode convenientFeeCreditMode;

    /**
     * The percentage fee charged on credit transactions for the Convenient Fee service.
     */
    @JsonProperty("ConvenientFeeCreditPercentageFee")
    private Double convenientFeeCreditPercentageFee;

    /**
     * The absolute fee amount charged for a convenient credit service.
     */
    @JsonProperty("ConvenientFeeCreditAbsoluteFee")
    private Double convenientFeeCreditAbsoluteFee;

    /**
     * The rounded‑up amount of the convenience fee credit applied to the transaction.
     */
    @JsonProperty("ConvenientFeeCreditRoundUpValue")
    private Double convenientFeeCreditRoundUpValue;

    /**
     * Specifies the mode used to debit the convenient fee for the transaction.
     */
    @JsonProperty("ConvenientFeeDebitMode")
    private ConvenientFeeMode convenientFeeDebitMode;

    /**
     * The percentage fee applied to debit transactions for the convenient fee service.
     */
    @JsonProperty("ConvenientFeeDebitPercentageFee")
    private Double convenientFeeDebitPercentageFee;

    /**
     * The absolute amount of the convenient fee charged for a debit transaction.
     */
    @JsonProperty("ConvenientFeeDebitAbsoluteFee")
    private Double convenientFeeDebitAbsoluteFee;

    /**
     * The amount (decimal) to which a convenient fee debit is rounded up.
     */
    @JsonProperty("ConvenientFeeDebitRoundUpValue")
    private Double convenientFeeDebitRoundUpValue;

    /**
     * The amount (in the account currency) to which debit fees are rounded up.
     */
    @JsonProperty("DebitFeeRoundUpValue")
    private Double debitFeeRoundUpValue;

    /**
     * The amount (in the transaction currency) to which credit‑card fees are rounded up.
     */
    @JsonProperty("CreditCardFeeRoundUpValue")
    private Double creditCardFeeRoundUpValue;

    /**
     * The rounded‑up fee amount applied to an instant transfer.
     */
    @JsonProperty("InstantTransferFeeRoundUpValue")
    private Double instantTransferFeeRoundUpValue;

    /**
     * The absolute fee amount charged for reverting a credit‑card transaction.
     */
    @JsonProperty("RevertCreditCardAbsoluteFees")
    private Double revertCreditCardAbsoluteFees;

    /**
     * The percentage fee applied when a credit‑card transaction is reverted.
     */
    @JsonProperty("RevertCreditCardPercentageFees")
    private Double revertCreditCardPercentageFees;

    /**
     * The absolute fee amount charged when a debit transaction is reverted.
     */
    @JsonProperty("RevertDebitAbsoluteFees")
    private Double revertDebitAbsoluteFees;

    /**
     * The percentage fee charged when a debit transaction is reverted.
     */
    @JsonProperty("RevertDebitPercentageFees")
    private Double revertDebitPercentageFees;

    /**
     * The absolute Interac transaction fee charged, expressed as a decimal amount.
     */
    @JsonProperty("InteracFeeAbsolute")
    private Double interacFeeAbsolute;

    /**
     * The percentage fee applied to Interac transactions.
     */
    @JsonProperty("InteracFeePercentage")
    private Double interacFeePercentage;

    /**
     * The absolute Interac fee collected for the transaction, expressed as a decimal amount in CAD.
     */
    @JsonProperty("InteracFeeCollectAbsolute")
    private Double interacFeeCollectAbsolute;

    /**
     * The percentage of the Interac transaction fee that the platform collects.
     */
    @JsonProperty("InteracFeeCollectPercentage")
    private Double interacFeeCollectPercentage;

    /**
     * The total amount of NFS debit fees applied to the transaction.
     */
    @JsonProperty("DebitNFSFees")
    private Double debitNFSFees;

    /**
     * The total fee amount charged for NFS file services in the response.
     */
    @JsonProperty("NFSFileFees")
    private Double nFSFileFees;

    /**
     * Fee charged when a credit card charge attempt fails.
     */
    @JsonProperty("CreditCardFailedChargeFee")
    private Double creditCardFailedChargeFee;

    /**
     * Fee charged when a transaction is returned due to an opposition (chargeback).
     */
    @JsonProperty("OppositionReturnFees")
    private Double oppositionReturnFees;

    /**
     * Fee charged when an Interac transaction is returned.
     */
    @JsonProperty("InteracReturnFee")
    private Double interacReturnFee;

    /**
     * Identifier of the data context used for the service response
     */
    @JsonProperty("DataContext")
    private Integer dataContext;


    
    public ServiceFeeSettings() {
    }

    
    public ServiceFeeSettings(FeeMode creditCardFeeMode, Double creditCardPercentageFee, Double creditCardAbsoluteFee, FeeMode debitFeeMode, Double debitPercentageFee, Double debitAbsoluteFee, FeeMode instantTransferFeeMode, Double instantTransferPercentageFee, Double instantTransferAbsoluteFee, ConvenientFeeMode convenientFeeCreditMode, Double convenientFeeCreditPercentageFee, Double convenientFeeCreditAbsoluteFee, Double convenientFeeCreditRoundUpValue, ConvenientFeeMode convenientFeeDebitMode, Double convenientFeeDebitPercentageFee, Double convenientFeeDebitAbsoluteFee, Double convenientFeeDebitRoundUpValue, Double debitFeeRoundUpValue, Double creditCardFeeRoundUpValue, Double instantTransferFeeRoundUpValue, Double revertCreditCardAbsoluteFees, Double revertCreditCardPercentageFees, Double revertDebitAbsoluteFees, Double revertDebitPercentageFees, Double interacFeeAbsolute, Double interacFeePercentage, Double interacFeeCollectAbsolute, Double interacFeeCollectPercentage, Double debitNFSFees, Double nFSFileFees, Double creditCardFailedChargeFee, Double oppositionReturnFees, Double interacReturnFee, Integer dataContext) {
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
        this.creditCardFailedChargeFee = creditCardFailedChargeFee;
        this.oppositionReturnFees = oppositionReturnFees;
        this.interacReturnFee = interacReturnFee;
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

    public Double getCreditCardFailedChargeFee() {
        return creditCardFailedChargeFee;
    }

    public void setCreditCardFailedChargeFee(Double creditCardFailedChargeFee) {
        this.creditCardFailedChargeFee = creditCardFailedChargeFee;
    }

    public Double getOppositionReturnFees() {
        return oppositionReturnFees;
    }

    public void setOppositionReturnFees(Double oppositionReturnFees) {
        this.oppositionReturnFees = oppositionReturnFees;
    }

    public Double getInteracReturnFee() {
        return interacReturnFee;
    }

    public void setInteracReturnFee(Double interacReturnFee) {
        this.interacReturnFee = interacReturnFee;
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
        return Objects.equals(creditCardFeeMode, that.creditCardFeeMode) && Objects.equals(creditCardPercentageFee, that.creditCardPercentageFee) && Objects.equals(creditCardAbsoluteFee, that.creditCardAbsoluteFee) && Objects.equals(debitFeeMode, that.debitFeeMode) && Objects.equals(debitPercentageFee, that.debitPercentageFee) && Objects.equals(debitAbsoluteFee, that.debitAbsoluteFee) && Objects.equals(instantTransferFeeMode, that.instantTransferFeeMode) && Objects.equals(instantTransferPercentageFee, that.instantTransferPercentageFee) && Objects.equals(instantTransferAbsoluteFee, that.instantTransferAbsoluteFee) && Objects.equals(convenientFeeCreditMode, that.convenientFeeCreditMode) && Objects.equals(convenientFeeCreditPercentageFee, that.convenientFeeCreditPercentageFee) && Objects.equals(convenientFeeCreditAbsoluteFee, that.convenientFeeCreditAbsoluteFee) && Objects.equals(convenientFeeCreditRoundUpValue, that.convenientFeeCreditRoundUpValue) && Objects.equals(convenientFeeDebitMode, that.convenientFeeDebitMode) && Objects.equals(convenientFeeDebitPercentageFee, that.convenientFeeDebitPercentageFee) && Objects.equals(convenientFeeDebitAbsoluteFee, that.convenientFeeDebitAbsoluteFee) && Objects.equals(convenientFeeDebitRoundUpValue, that.convenientFeeDebitRoundUpValue) && Objects.equals(debitFeeRoundUpValue, that.debitFeeRoundUpValue) && Objects.equals(creditCardFeeRoundUpValue, that.creditCardFeeRoundUpValue) && Objects.equals(instantTransferFeeRoundUpValue, that.instantTransferFeeRoundUpValue) && Objects.equals(revertCreditCardAbsoluteFees, that.revertCreditCardAbsoluteFees) && Objects.equals(revertCreditCardPercentageFees, that.revertCreditCardPercentageFees) && Objects.equals(revertDebitAbsoluteFees, that.revertDebitAbsoluteFees) && Objects.equals(revertDebitPercentageFees, that.revertDebitPercentageFees) && Objects.equals(interacFeeAbsolute, that.interacFeeAbsolute) && Objects.equals(interacFeePercentage, that.interacFeePercentage) && Objects.equals(interacFeeCollectAbsolute, that.interacFeeCollectAbsolute) && Objects.equals(interacFeeCollectPercentage, that.interacFeeCollectPercentage) && Objects.equals(debitNFSFees, that.debitNFSFees) && Objects.equals(nFSFileFees, that.nFSFileFees) && Objects.equals(creditCardFailedChargeFee, that.creditCardFailedChargeFee) && Objects.equals(oppositionReturnFees, that.oppositionReturnFees) && Objects.equals(interacReturnFee, that.interacReturnFee) && Objects.equals(dataContext, that.dataContext) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(creditCardFeeMode, creditCardPercentageFee, creditCardAbsoluteFee, debitFeeMode, debitPercentageFee, debitAbsoluteFee, instantTransferFeeMode, instantTransferPercentageFee, instantTransferAbsoluteFee, convenientFeeCreditMode, convenientFeeCreditPercentageFee, convenientFeeCreditAbsoluteFee, convenientFeeCreditRoundUpValue, convenientFeeDebitMode, convenientFeeDebitPercentageFee, convenientFeeDebitAbsoluteFee, convenientFeeDebitRoundUpValue, debitFeeRoundUpValue, creditCardFeeRoundUpValue, instantTransferFeeRoundUpValue, revertCreditCardAbsoluteFees, revertCreditCardPercentageFees, revertDebitAbsoluteFees, revertDebitPercentageFees, interacFeeAbsolute, interacFeePercentage, interacFeeCollectAbsolute, interacFeeCollectPercentage, debitNFSFees, nFSFileFees, creditCardFailedChargeFee, oppositionReturnFees, interacReturnFee, dataContext);
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
                ", creditCardFailedChargeFee='" + creditCardFailedChargeFee + '\'' +
                ", oppositionReturnFees='" + oppositionReturnFees + '\'' +
                ", interacReturnFee='" + interacReturnFee + '\'' +
                ", dataContext='" + dataContext + '\'' +

                '}';
    }
}