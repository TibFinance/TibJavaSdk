
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.LineBaseWithHeader;
import com.tib.api.model.enums.AcpTransactionType;
import com.tib.api.model.BaseTransaction;
import com.tib.api.model.BaseLastLine;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AcpParsedResult   {

    
    /**
 * Gets or sets the first line.
 */
    @JsonProperty("FirstLine")
    private LineBaseWithHeader firstLine;

    /**
 * Gets or sets all transactions.
 */
    @JsonProperty("AllTransactions")
    private Map<AcpTransactionType, List<BaseTransaction>> allTransactions;

    /**
 * Gets or sets the last line.
 */
    @JsonProperty("LastLine")
    private BaseLastLine lastLine;


    
    public AcpParsedResult() {
    }

    
    public AcpParsedResult(LineBaseWithHeader firstLine, Map<AcpTransactionType, List<BaseTransaction>> allTransactions, BaseLastLine lastLine) {
        this.firstLine = firstLine;
this.allTransactions = allTransactions;
this.lastLine = lastLine;

    }
    
    

    
    public LineBaseWithHeader getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(LineBaseWithHeader firstLine) {
        this.firstLine = firstLine;
    }

    public Map<AcpTransactionType, List<BaseTransaction>> getAllTransactions() {
        return allTransactions;
    }

    public void setAllTransactions(Map<AcpTransactionType, List<BaseTransaction>> allTransactions) {
        this.allTransactions = allTransactions;
    }

    public BaseLastLine getLastLine() {
        return lastLine;
    }

    public void setLastLine(BaseLastLine lastLine) {
        this.lastLine = lastLine;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcpParsedResult that = (AcpParsedResult) o;
        return Objects.equals(firstLine, that.firstLine) && Objects.equals(allTransactions, that.allTransactions) && Objects.equals(lastLine, that.lastLine) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(firstLine, allTransactions, lastLine);
    }

    @Override
    public String toString() {
        return "AcpParsedResult{" +
                 "firstLine='" + firstLine + '\'' +
 ", allTransactions='" + allTransactions + '\'' +
 ", lastLine='" + lastLine + '\'' +

                '}';
    }
}