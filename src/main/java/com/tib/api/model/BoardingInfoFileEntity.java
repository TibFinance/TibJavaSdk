
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.BoardingIdFileSides;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingInfoFileEntity   {

    
    /**
     * 
     */
    @JsonProperty("Base64")
    private String base64;

    /**
     * 
     */
    @JsonProperty("Side")
    private BoardingIdFileSides side;

    /**
     * 
     */
    @JsonProperty("IsAdministrator")
    private boolean isAdministrator;


    
    public BoardingInfoFileEntity() {
    }

    
    public BoardingInfoFileEntity(String base64, BoardingIdFileSides side, boolean isAdministrator) {
        this.base64 = base64;
        this.side = side;
        this.isAdministrator = isAdministrator;
    }
    
    

    
    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public BoardingIdFileSides getSide() {
        return side;
    }

    public void setSide(BoardingIdFileSides side) {
        this.side = side;
    }

    public boolean getIsAdministrator() {
        return isAdministrator;
    }

    public void setIsAdministrator(boolean isAdministrator) {
        this.isAdministrator = isAdministrator;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingInfoFileEntity that = (BoardingInfoFileEntity) o;
        return Objects.equals(base64, that.base64) && Objects.equals(side, that.side) && Objects.equals(isAdministrator, that.isAdministrator) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(base64, side, isAdministrator);
    }

    @Override
    public String toString() {
        return "BoardingInfoFileEntity{" +
                "base64='" + base64 + '\'' +
                ", side='" + side + '\'' +
                ", isAdministrator='" + isAdministrator + '\'' +

                '}';
    }
}