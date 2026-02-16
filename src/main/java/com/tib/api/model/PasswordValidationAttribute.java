
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


public class PasswordValidationAttribute   {

    
    /**
     * 
     */
    @JsonProperty("MinLength")
    private Integer minLength;

    /**
     * 
     */
    @JsonProperty("MaxLength")
    private Integer maxLength;

    /**
     * 
     */
    @JsonProperty("RequireUppercase")
    private boolean requireUppercase;

    /**
     * 
     */
    @JsonProperty("RequireLowercase")
    private boolean requireLowercase;

    /**
     * 
     */
    @JsonProperty("RequireDigit")
    private boolean requireDigit;

    /**
     * 
     */
    @JsonProperty("RequireSpecialChar")
    private boolean requireSpecialChar;

    /**
     * 
     */
    @JsonProperty("SpecialCharacters")
    private String specialCharacters;


    
    public PasswordValidationAttribute() {
    }

    
    public PasswordValidationAttribute(Integer minLength, Integer maxLength, boolean requireUppercase, boolean requireLowercase, boolean requireDigit, boolean requireSpecialChar, String specialCharacters) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.requireUppercase = requireUppercase;
        this.requireLowercase = requireLowercase;
        this.requireDigit = requireDigit;
        this.requireSpecialChar = requireSpecialChar;
        this.specialCharacters = specialCharacters;
    }
    
    

    
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public boolean getRequireUppercase() {
        return requireUppercase;
    }

    public void setRequireUppercase(boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
    }

    public boolean getRequireLowercase() {
        return requireLowercase;
    }

    public void setRequireLowercase(boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
    }

    public boolean getRequireDigit() {
        return requireDigit;
    }

    public void setRequireDigit(boolean requireDigit) {
        this.requireDigit = requireDigit;
    }

    public boolean getRequireSpecialChar() {
        return requireSpecialChar;
    }

    public void setRequireSpecialChar(boolean requireSpecialChar) {
        this.requireSpecialChar = requireSpecialChar;
    }

    public String getSpecialCharacters() {
        return specialCharacters;
    }

    public void setSpecialCharacters(String specialCharacters) {
        this.specialCharacters = specialCharacters;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordValidationAttribute that = (PasswordValidationAttribute) o;
        return Objects.equals(minLength, that.minLength) && Objects.equals(maxLength, that.maxLength) && Objects.equals(requireUppercase, that.requireUppercase) && Objects.equals(requireLowercase, that.requireLowercase) && Objects.equals(requireDigit, that.requireDigit) && Objects.equals(requireSpecialChar, that.requireSpecialChar) && Objects.equals(specialCharacters, that.specialCharacters) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(minLength, maxLength, requireUppercase, requireLowercase, requireDigit, requireSpecialChar, specialCharacters);
    }

    @Override
    public String toString() {
        return "PasswordValidationAttribute{" +
                "minLength='" + minLength + '\'' +
                ", maxLength='" + maxLength + '\'' +
                ", requireUppercase='" + requireUppercase + '\'' +
                ", requireLowercase='" + requireLowercase + '\'' +
                ", requireDigit='" + requireDigit + '\'' +
                ", requireSpecialChar='" + requireSpecialChar + '\'' +
                ", specialCharacters='" + specialCharacters + '\'' +

                '}';
    }
}