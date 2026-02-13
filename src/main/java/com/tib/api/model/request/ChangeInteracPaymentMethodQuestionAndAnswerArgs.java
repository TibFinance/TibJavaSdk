
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class ChangeInteracPaymentMethodQuestionAndAnswerArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Represents the unique identifier for an Interac payment method associated with a customer account.
 */
    @JsonProperty("InteracPaymentMethodId")
    private String interacPaymentMethodId;

    /**
 * The question displayed to the Interac recipient to request acceptance of a deposit.
 */
    @JsonProperty("InteracQuestion")
    private String interacQuestion;

    /**
 * InteracAnswer is the response string that the target must provide to accept an Interac deposit.
 */
    @JsonProperty("InteracAnswer")
    private String interacAnswer;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
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