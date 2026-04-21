
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class ChangeInteracPaymentMethodQuestionAndAnswerArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identity of the Interac Payment Method
     */
    @JsonProperty("InteracPaymentMethodId")
    private String interacPaymentMethodId;

    /**
     * The security question presented to the payer for an Interac e‑Transfer payment.
     */
    @JsonProperty("InteracQuestion")
    private String interacQuestion;

    /**
     * The answer to the security question required for creating an Interac payment method.
     */
    @JsonProperty("InteracAnswer")
    private String interacAnswer;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public ChangeInteracPaymentMethodQuestionAndAnswerArgs() {
    }

    
    public ChangeInteracPaymentMethodQuestionAndAnswerArgs(String interacPaymentMethodId, String interacQuestion, String interacAnswer, String merchantId) {
        this.interacPaymentMethodId = interacPaymentMethodId;
        this.interacQuestion = interacQuestion;
        this.interacAnswer = interacAnswer;
        this.merchantId = merchantId;
    }
    
    
    public ChangeInteracPaymentMethodQuestionAndAnswerArgs(String sessionToken, String interacPaymentMethodId, String interacQuestion, String interacAnswer, String merchantId) {
        super(sessionToken);
        this.interacPaymentMethodId = interacPaymentMethodId;
        this.interacQuestion = interacQuestion;
        this.interacAnswer = interacAnswer;
        this.merchantId = merchantId;
    }

    
    public String getInteracPaymentMethodId() {
        return interacPaymentMethodId;
    }

    public void setInteracPaymentMethodId(String interacPaymentMethodId) {
        this.interacPaymentMethodId = interacPaymentMethodId;
    }

    public String getInteracQuestion() {
        return interacQuestion;
    }

    public void setInteracQuestion(String interacQuestion) {
        this.interacQuestion = interacQuestion;
    }

    public String getInteracAnswer() {
        return interacAnswer;
    }

    public void setInteracAnswer(String interacAnswer) {
        this.interacAnswer = interacAnswer;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChangeInteracPaymentMethodQuestionAndAnswerArgs that = (ChangeInteracPaymentMethodQuestionAndAnswerArgs) o;
        return Objects.equals(interacPaymentMethodId, that.interacPaymentMethodId) && Objects.equals(interacQuestion, that.interacQuestion) && Objects.equals(interacAnswer, that.interacAnswer) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(interacPaymentMethodId, interacQuestion, interacAnswer, merchantId);
    }

    @Override
    public String toString() {
        return "ChangeInteracPaymentMethodQuestionAndAnswerArgs{" +
                "interacPaymentMethodId='" + interacPaymentMethodId + '\'' +
                ", interacQuestion='" + interacQuestion + '\'' +
                ", interacAnswer='" + interacAnswer + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}