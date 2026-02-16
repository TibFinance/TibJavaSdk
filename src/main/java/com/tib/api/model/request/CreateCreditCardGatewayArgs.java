
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.CreditCard;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.PublicAccessTokenRoutingType;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateCreditCardGatewayArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Determines if the customer's payment method is set as the default for automatic transactions.
     */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
     * 
     */
    @JsonProperty("Provider")
    private String provider;

    /**
     * Manages all operations associated with credit card data.
     */
    @JsonProperty("CreditCard")
    private CreditCard creditCard;

    /**
     * 
     */
    @JsonProperty("IsCustomerPreAutorized")
    private boolean isCustomerPreAutorized;

    /**
     * 
     */
    @JsonProperty("IsGatewayCall")
    private boolean isGatewayCall;

    /**
     * 
     */
    @JsonProperty("SkipValidation")
    private boolean skipValidation;

    /**
     * 
     */
    @JsonProperty("IsImmediate")
    private boolean isImmediate;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * 
     */
    @JsonProperty("BinCategory")
    private String binCategory;

    /**
     * 
     */
    @JsonProperty("CardCategory")
    private String cardCategory;

    /**
     * 
     */
    @JsonProperty("CardSubType")
    private String cardSubType;

    /**
     * 
     */
    @JsonProperty("CcBin")
    private String ccBin;

    /**
     * 
     */
    @JsonProperty("CcType")
    private String ccType;

    /**
     * 
     */
    @JsonProperty("IsRegulatedCard")
    private String isRegulatedCard;

    /**
     * 
     */
    @JsonProperty("IssuingCountry")
    private String issuingCountry;

    /**
     * 
     */
    @JsonProperty("Token")
    private String token;

    /**
     * 
     */
    @JsonProperty("Exp")
    private String exp;

    /**
     * 
     */
    @JsonProperty("Last4Digits")
    private String last4Digits;

    /**
     * Specifies the name of the card owner.
     */
    @JsonProperty("CardOwner")
    private String cardOwner;

    /**
     * For ZipCode only situation, not full address
     */
    @JsonProperty("ZipCode")
    private String zipCode;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * 
     */
    @JsonProperty("RoutingType")
    private PublicAccessTokenRoutingType routingType;


    
    public CreateCreditCardGatewayArgs() {
    }

    
    public CreateCreditCardGatewayArgs(Currency currency, boolean isCustomerAutomaticPaymentMethod, String provider, CreditCard creditCard, boolean isCustomerPreAutorized, boolean isGatewayCall, boolean skipValidation, boolean isImmediate, String merchantId, String binCategory, String cardCategory, String cardSubType, String ccBin, String ccType, String isRegulatedCard, String issuingCountry, String token, String exp, String last4Digits, String cardOwner, String zipCode, Language language, PublicAccessTokenRoutingType routingType) {
        this.currency = currency;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.provider = provider;
        this.creditCard = creditCard;
        this.isCustomerPreAutorized = isCustomerPreAutorized;
        this.isGatewayCall = isGatewayCall;
        this.skipValidation = skipValidation;
        this.isImmediate = isImmediate;
        this.merchantId = merchantId;
        this.binCategory = binCategory;
        this.cardCategory = cardCategory;
        this.cardSubType = cardSubType;
        this.ccBin = ccBin;
        this.ccType = ccType;
        this.isRegulatedCard = isRegulatedCard;
        this.issuingCountry = issuingCountry;
        this.token = token;
        this.exp = exp;
        this.last4Digits = last4Digits;
        this.cardOwner = cardOwner;
        this.zipCode = zipCode;
        this.language = language;
        this.routingType = routingType;
    }
    
    
    public CreateCreditCardGatewayArgs(String publicTokenId, Currency currency, boolean isCustomerAutomaticPaymentMethod, String provider, CreditCard creditCard, boolean isCustomerPreAutorized, boolean isGatewayCall, boolean skipValidation, boolean isImmediate, String merchantId, String binCategory, String cardCategory, String cardSubType, String ccBin, String ccType, String isRegulatedCard, String issuingCountry, String token, String exp, String last4Digits, String cardOwner, String zipCode, Language language, PublicAccessTokenRoutingType routingType) {
        super(publicTokenId);
        this.currency = currency;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.provider = provider;
        this.creditCard = creditCard;
        this.isCustomerPreAutorized = isCustomerPreAutorized;
        this.isGatewayCall = isGatewayCall;
        this.skipValidation = skipValidation;
        this.isImmediate = isImmediate;
        this.merchantId = merchantId;
        this.binCategory = binCategory;
        this.cardCategory = cardCategory;
        this.cardSubType = cardSubType;
        this.ccBin = ccBin;
        this.ccType = ccType;
        this.isRegulatedCard = isRegulatedCard;
        this.issuingCountry = issuingCountry;
        this.token = token;
        this.exp = exp;
        this.last4Digits = last4Digits;
        this.cardOwner = cardOwner;
        this.zipCode = zipCode;
        this.language = language;
        this.routingType = routingType;
    }

    
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public boolean getIsCustomerAutomaticPaymentMethod() {
        return isCustomerAutomaticPaymentMethod;
    }

    public void setIsCustomerAutomaticPaymentMethod(boolean isCustomerAutomaticPaymentMethod) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public boolean getIsCustomerPreAutorized() {
        return isCustomerPreAutorized;
    }

    public void setIsCustomerPreAutorized(boolean isCustomerPreAutorized) {
        this.isCustomerPreAutorized = isCustomerPreAutorized;
    }

    public boolean getIsGatewayCall() {
        return isGatewayCall;
    }

    public void setIsGatewayCall(boolean isGatewayCall) {
        this.isGatewayCall = isGatewayCall;
    }

    public boolean getSkipValidation() {
        return skipValidation;
    }

    public void setSkipValidation(boolean skipValidation) {
        this.skipValidation = skipValidation;
    }

    public boolean getIsImmediate() {
        return isImmediate;
    }

    public void setIsImmediate(boolean isImmediate) {
        this.isImmediate = isImmediate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBinCategory() {
        return binCategory;
    }

    public void setBinCategory(String binCategory) {
        this.binCategory = binCategory;
    }

    public String getCardCategory() {
        return cardCategory;
    }

    public void setCardCategory(String cardCategory) {
        this.cardCategory = cardCategory;
    }

    public String getCardSubType() {
        return cardSubType;
    }

    public void setCardSubType(String cardSubType) {
        this.cardSubType = cardSubType;
    }

    public String getCcBin() {
        return ccBin;
    }

    public void setCcBin(String ccBin) {
        this.ccBin = ccBin;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

    public String getIsRegulatedCard() {
        return isRegulatedCard;
    }

    public void setIsRegulatedCard(String isRegulatedCard) {
        this.isRegulatedCard = isRegulatedCard;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getLast4Digits() {
        return last4Digits;
    }

    public void setLast4Digits(String last4Digits) {
        this.last4Digits = last4Digits;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public PublicAccessTokenRoutingType getRoutingType() {
        return routingType;
    }

    public void setRoutingType(PublicAccessTokenRoutingType routingType) {
        this.routingType = routingType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCreditCardGatewayArgs that = (CreateCreditCardGatewayArgs) o;
        return Objects.equals(currency, that.currency) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(provider, that.provider) && Objects.equals(creditCard, that.creditCard) && Objects.equals(isCustomerPreAutorized, that.isCustomerPreAutorized) && Objects.equals(isGatewayCall, that.isGatewayCall) && Objects.equals(skipValidation, that.skipValidation) && Objects.equals(isImmediate, that.isImmediate) && Objects.equals(merchantId, that.merchantId) && Objects.equals(binCategory, that.binCategory) && Objects.equals(cardCategory, that.cardCategory) && Objects.equals(cardSubType, that.cardSubType) && Objects.equals(ccBin, that.ccBin) && Objects.equals(ccType, that.ccType) && Objects.equals(isRegulatedCard, that.isRegulatedCard) && Objects.equals(issuingCountry, that.issuingCountry) && Objects.equals(token, that.token) && Objects.equals(exp, that.exp) && Objects.equals(last4Digits, that.last4Digits) && Objects.equals(cardOwner, that.cardOwner) && Objects.equals(zipCode, that.zipCode) && Objects.equals(language, that.language) && Objects.equals(routingType, that.routingType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(currency, isCustomerAutomaticPaymentMethod, provider, creditCard, isCustomerPreAutorized, isGatewayCall, skipValidation, isImmediate, merchantId, binCategory, cardCategory, cardSubType, ccBin, ccType, isRegulatedCard, issuingCountry, token, exp, last4Digits, cardOwner, zipCode, language, routingType);
    }

    @Override
    public String toString() {
        return "CreateCreditCardGatewayArgs{" +
                "currency='" + currency + '\'' +
                ", isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
                ", provider='" + provider + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", isCustomerPreAutorized='" + isCustomerPreAutorized + '\'' +
                ", isGatewayCall='" + isGatewayCall + '\'' +
                ", skipValidation='" + skipValidation + '\'' +
                ", isImmediate='" + isImmediate + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", binCategory='" + binCategory + '\'' +
                ", cardCategory='" + cardCategory + '\'' +
                ", cardSubType='" + cardSubType + '\'' +
                ", ccBin='" + ccBin + '\'' +
                ", ccType='" + ccType + '\'' +
                ", isRegulatedCard='" + isRegulatedCard + '\'' +
                ", issuingCountry='" + issuingCountry + '\'' +
                ", token='" + token + '\'' +
                ", exp='" + exp + '\'' +
                ", last4Digits='" + last4Digits + '\'' +
                ", cardOwner='" + cardOwner + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", language='" + language + '\'' +
                ", routingType='" + routingType + '\'' +

                '}';
    }
}