
package com.tib.api.model;

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


public class LineDefEndOfFile  extends BaseLastLine  {

    
    /**
     * Gets or sets the total amount collected.
     */
    @JsonProperty("TotalAmountCollected")
    private Double totalAmountCollected;

    /**
     * Gets or sets the number of transaction collected.
     */
    @JsonProperty("NumberOfTransactionCollected")
    private Integer numberOfTransactionCollected;

    /**
     * Gets or sets the total amount deposit.
     */
    @JsonProperty("TotalAmountDeposit")
    private Double totalAmountDeposit;

    /**
     * Gets or sets the number of transaction deposit.
     */
    @JsonProperty("NumberOfTransactionDeposit")
    private Integer numberOfTransactionDeposit;


    
    public LineDefEndOfFile() {
    }

    
    public LineDefEndOfFile(Double totalAmountCollected, Integer numberOfTransactionCollected, Double totalAmountDeposit, Integer numberOfTransactionDeposit) {
        this.totalAmountCollected = totalAmountCollected;
        this.numberOfTransactionCollected = numberOfTransactionCollected;
        this.totalAmountDeposit = totalAmountDeposit;
        this.numberOfTransactionDeposit = numberOfTransactionDeposit;
    }
    
    

    
    public Double getTotalAmountCollected() {
        return totalAmountCollected;
    }

    public void setTotalAmountCollected(Double totalAmountCollected) {
        this.totalAmountCollected = totalAmountCollected;
    }

    public Integer getNumberOfTransactionCollected() {
        return numberOfTransactionCollected;
    }

    public void setNumberOfTransactionCollected(Integer numberOfTransactionCollected) {
        this.numberOfTransactionCollected = numberOfTransactionCollected;
    }

    public Double getTotalAmountDeposit() {
        return totalAmountDeposit;
    }

    public void setTotalAmountDeposit(Double totalAmountDeposit) {
        this.totalAmountDeposit = totalAmountDeposit;
    }

    public Integer getNumberOfTransactionDeposit() {
        return numberOfTransactionDeposit;
    }

    public void setNumberOfTransactionDeposit(Integer numberOfTransactionDeposit) {
        this.numberOfTransactionDeposit = numberOfTransactionDeposit;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineDefEndOfFile that = (LineDefEndOfFile) o;
        return Objects.equals(totalAmountCollected, that.totalAmountCollected) && Objects.equals(numberOfTransactionCollected, that.numberOfTransactionCollected) && Objects.equals(totalAmountDeposit, that.totalAmountDeposit) && Objects.equals(numberOfTransactionDeposit, that.numberOfTransactionDeposit) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(totalAmountCollected, numberOfTransactionCollected, totalAmountDeposit, numberOfTransactionDeposit);
    }

    @Override
    public String toString() {
        return "LineDefEndOfFile{" +
                "totalAmountCollected='" + totalAmountCollected + '\'' +
                ", numberOfTransactionCollected='" + numberOfTransactionCollected + '\'' +
                ", totalAmountDeposit='" + totalAmountDeposit + '\'' +
                ", numberOfTransactionDeposit='" + numberOfTransactionDeposit + '\'' +

                '}';
    }
}