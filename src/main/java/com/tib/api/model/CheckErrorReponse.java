
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CheckResult;
import com.tib.api.model.CheckResultDetail;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CheckErrorReponse   {

    
    /**
 * Gets or sets the check result.
 */
    @JsonProperty("CheckResult")
    private CheckResult checkResult;

    /**
 * Gets or sets the result.
 */
    @JsonProperty("Result")
    private List<CheckResultDetail> result;


    
    public CheckErrorReponse() {
    }

    
    public CheckErrorReponse(CheckResult checkResult, List<CheckResultDetail> result) {
        this.checkResult = checkResult;
this.result = result;

    }
    
    

    
    public CheckResult getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(CheckResult checkResult) {
        this.checkResult = checkResult;
    }

    public List<CheckResultDetail> getResult() {
        return result;
    }

    public void setResult(List<CheckResultDetail> result) {
        this.result = result;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckErrorReponse that = (CheckErrorReponse) o;
        return Objects.equals(checkResult, that.checkResult) && Objects.equals(result, that.result) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(checkResult, result);
    }

    @Override
    public String toString() {
        return "CheckErrorReponse{" +
                 "checkResult='" + checkResult + '\'' +
 ", result='" + result + '\'' +

                '}';
    }
}