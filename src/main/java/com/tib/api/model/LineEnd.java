
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


public class LineEnd  extends BaseLastLine  {

    
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

    /**
 * Gets the start position.
 */
    @JsonProperty("StartPosition")
    private Integer startPosition;


    
    public LineEnd() {
    }

    
    public LineEnd(Double totalAmountCollected, Integer numberOfTransactionCollected, Double totalAmountDeposit, Integer numberOfTransactionDeposit, Integer startPosition) {
        this.totalAmountCollected = totalAmountCollected;
this.numberOfTransactionCollected = numberOfTransactionCollected;
this.totalAmountDeposit = totalAmountDeposit;
this.numberOfTransactionDeposit = numberOfTransactionDeposit;
this.startPosition = startPosition;

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

    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineEnd that = (LineEnd) o;
        return Objects.equals(totalAmountCollected, that.totalAmountCollected) && Objects.equals(numberOfTransactionCollected, that.numberOfTransactionCollected) && Objects.equals(totalAmountDeposit, that.totalAmountDeposit) && Objects.equals(numberOfTransactionDeposit, that.numberOfTransactionDeposit) && Objects.equals(startPosition, that.startPosition) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(totalAmountCollected, numberOfTransactionCollected, totalAmountDeposit, numberOfTransactionDeposit, startPosition);
    }

    @Override
    public String toString() {
        return "LineEnd{" +
                 "totalAmountCollected='" + totalAmountCollected + '\'' +
 ", numberOfTransactionCollected='" + numberOfTransactionCollected + '\'' +
 ", totalAmountDeposit='" + totalAmountDeposit + '\'' +
 ", numberOfTransactionDeposit='" + numberOfTransactionDeposit + '\'' +
 ", startPosition='" + startPosition + '\'' +

                '}';
    }
}