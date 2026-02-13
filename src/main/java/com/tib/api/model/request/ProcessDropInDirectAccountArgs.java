
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
import com.tib.api.model.request.BaseProcessDropInArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProcessDropInDirectAccountArgs  extends BaseProcessDropInArgs  {

    
    /**
 * Contains the necessary details for replacing a merchant's account information within the system.
 */
    @JsonProperty("Account")
    private Account account;


    
    public ProcessDropInDirectAccountArgs() {
    }

    
    public ProcessDropInDirectAccountArgs(Account account) {
        this.account = account;

    }
    
    
    public ProcessDropInDirectAccountArgs(boolean isPPAAuthorized, Account account) {
        super(isPPAAuthorized);
        this.account = account;

    }

    
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessDropInDirectAccountArgs that = (ProcessDropInDirectAccountArgs) o;
        return Objects.equals(account, that.account) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    @Override
    public String toString() {
        return "ProcessDropInDirectAccountArgs{" +
                 "account='" + account + '\'' +

                '}';
    }
}