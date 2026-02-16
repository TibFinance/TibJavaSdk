
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


public class BoardingInfoPersonEntity   {

    
    /**
     * 
     */
    @JsonProperty("BoardingInfoPersonId")
    private String boardingInfoPersonId;

    /**
     * 
     */
    @JsonProperty("FirstName")
    private String firstName;

    /**
     * 
     */
    @JsonProperty("LastName")
    private String lastName;

    /**
     * Gets or sets the address associated with the entity.
     */
    @JsonProperty("Address")
    private String address;

    /**
     * 
     */
    @JsonProperty("Country")
    private String country;

    /**
     * 
     */
    @JsonProperty("State")
    private String state;

    /**
     * 
     */
    @JsonProperty("City")
    private String city;

    /**
     * 
     */
    @JsonProperty("Zip")
    private String zip;

    /**
     * 
     */
    @JsonProperty("Phone")
    private String phone;

    /**
     * 
     */
    @JsonProperty("BirthDate")
    private String birthDate;

    /**
     * 
     */
    @JsonProperty("GovId")
    private String govId;

    /**
     * 
     */
    @JsonProperty("SharePercentage")
    private Integer sharePercentage;

    /**
     * 
     */
    @JsonProperty("IsRepresentant")
    private boolean isRepresentant;


    
    public BoardingInfoPersonEntity() {
    }

    
    public BoardingInfoPersonEntity(String boardingInfoPersonId, String firstName, String lastName, String address, String country, String state, String city, String zip, String phone, String birthDate, String govId, Integer sharePercentage, boolean isRepresentant) {
        this.boardingInfoPersonId = boardingInfoPersonId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
        this.birthDate = birthDate;
        this.govId = govId;
        this.sharePercentage = sharePercentage;
        this.isRepresentant = isRepresentant;
    }
    
    

    
    public String getBoardingInfoPersonId() {
        return boardingInfoPersonId;
    }

    public void setBoardingInfoPersonId(String boardingInfoPersonId) {
        this.boardingInfoPersonId = boardingInfoPersonId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGovId() {
        return govId;
    }

    public void setGovId(String govId) {
        this.govId = govId;
    }

    public Integer getSharePercentage() {
        return sharePercentage;
    }

    public void setSharePercentage(Integer sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    public boolean getIsRepresentant() {
        return isRepresentant;
    }

    public void setIsRepresentant(boolean isRepresentant) {
        this.isRepresentant = isRepresentant;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingInfoPersonEntity that = (BoardingInfoPersonEntity) o;
        return Objects.equals(boardingInfoPersonId, that.boardingInfoPersonId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(country, that.country) && Objects.equals(state, that.state) && Objects.equals(city, that.city) && Objects.equals(zip, that.zip) && Objects.equals(phone, that.phone) && Objects.equals(birthDate, that.birthDate) && Objects.equals(govId, that.govId) && Objects.equals(sharePercentage, that.sharePercentage) && Objects.equals(isRepresentant, that.isRepresentant) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInfoPersonId, firstName, lastName, address, country, state, city, zip, phone, birthDate, govId, sharePercentage, isRepresentant);
    }

    @Override
    public String toString() {
        return "BoardingInfoPersonEntity{" +
                "boardingInfoPersonId='" + boardingInfoPersonId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", govId='" + govId + '\'' +
                ", sharePercentage='" + sharePercentage + '\'' +
                ", isRepresentant='" + isRepresentant + '\'' +

                '}';
    }
}