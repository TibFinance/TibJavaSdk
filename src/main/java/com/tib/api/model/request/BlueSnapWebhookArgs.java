
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BlueSnapWebhookArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * 
     */
    @JsonProperty("TransactionType")
    private String transactionType;

    /**
     * 
     */
    @JsonProperty("WebhookDatas")
    private Map<String, String> webhookDatas;


    
    public BlueSnapWebhookArgs() {
    }

    
    public BlueSnapWebhookArgs(String transactionType, Map<String, String> webhookDatas) {
        this.transactionType = transactionType;
        this.webhookDatas = webhookDatas;
    }
    
    

    
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Map<String, String> getWebhookDatas() {
        return webhookDatas;
    }

    public void setWebhookDatas(Map<String, String> webhookDatas) {
        this.webhookDatas = webhookDatas;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlueSnapWebhookArgs that = (BlueSnapWebhookArgs) o;
        return Objects.equals(transactionType, that.transactionType) && Objects.equals(webhookDatas, that.webhookDatas) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionType, webhookDatas);
    }

    @Override
    public String toString() {
        return "BlueSnapWebhookArgs{" +
                "transactionType='" + transactionType + '\'' +
                ", webhookDatas='" + webhookDatas + '\'' +

                '}';
    }
}