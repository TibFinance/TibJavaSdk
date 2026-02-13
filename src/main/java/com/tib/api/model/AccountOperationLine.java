
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.AccountOperationDirection;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AccountOperationLine   {

    
    /**
 * Gets or sets the operation date.
 */
    @JsonProperty("OperationDate")
    private LocalDateTime operationDate;

    /**
 * Gets or sets the operation description.
 */
    @JsonProperty("OperationDescription")
    private String operationDescription;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Gets or sets the account operation direction.
 */
    @JsonProperty("AccountOperationDirection")
    private AccountOperationDirection accountOperationDirection;


    
    public AccountOperationLine() {
    }

    
    public AccountOperationLine(LocalDateTime operationDate, String operationDescription, Double amount, AccountOperationDirection accountOperationDirection) {
        this.operationDate = operationDate;
this.operationDescription = operationDescription;
this.amount = amount;
this.accountOperationDirection = accountOperationDirection;

    }
    
    

    
    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AccountOperationDirection getAccountOperationDirection() {
        return accountOperationDirection;
    }

    public void setAccountOperationDirection(AccountOperationDirection accountOperationDirection) {
        this.accountOperationDirection = accountOperationDirection;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountOperationLine that = (AccountOperationLine) o;
        return Objects.equals(operationDate, that.operationDate) && Objects.equals(operationDescription, that.operationDescription) && Objects.equals(amount, that.amount) && Objects.equals(accountOperationDirection, that.accountOperationDirection) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationDate, operationDescription, amount, accountOperationDirection);
    }

    @Override
    public String toString() {
        return "AccountOperationLine{" +
                 "operationDate='" + operationDate + '\'' +
 ", operationDescription='" + operationDescription + '\'' +
 ", amount='" + amount + '\'' +
 ", accountOperationDirection='" + accountOperationDirection + '\'' +

                '}';
    }
}