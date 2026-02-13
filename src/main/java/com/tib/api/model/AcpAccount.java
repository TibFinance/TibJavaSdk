
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


public class AcpAccount   {

    
    /**
 * Gets or sets the organization number.
 */
    @JsonProperty("OrganizationNumber")
    private String organizationNumber;

    /**
 * Gets or sets the name of the organization.
 */
    @JsonProperty("OrganizationName")
    private String organizationName;

    /**
 * Gets or sets the organization account.
 */
    @JsonProperty("OrganizationAccount")
    private String organizationAccount;

    /**
 * Gets or sets the organization bank.
 */
    @JsonProperty("OrganizationBank")
    private Integer organizationBank;

    /**
 * Gets or sets the short name of the organization.
 */
    @JsonProperty("OrganizationShortName")
    private String organizationShortName;

    /**
 * Gets or sets the routing information.
 */
    @JsonProperty("RoutingInformation")
    private String routingInformation;


    
    public AcpAccount() {
    }

    
    public AcpAccount(String organizationNumber, String organizationName, String organizationAccount, Integer organizationBank, String organizationShortName, String routingInformation) {
        this.organizationNumber = organizationNumber;
this.organizationName = organizationName;
this.organizationAccount = organizationAccount;
this.organizationBank = organizationBank;
this.organizationShortName = organizationShortName;
this.routingInformation = routingInformation;

    }
    
    

    
    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAccount() {
        return organizationAccount;
    }

    public void setOrganizationAccount(String organizationAccount) {
        this.organizationAccount = organizationAccount;
    }

    public Integer getOrganizationBank() {
        return organizationBank;
    }

    public void setOrganizationBank(Integer organizationBank) {
        this.organizationBank = organizationBank;
    }

    public String getOrganizationShortName() {
        return organizationShortName;
    }

    public void setOrganizationShortName(String organizationShortName) {
        this.organizationShortName = organizationShortName;
    }

    public String getRoutingInformation() {
        return routingInformation;
    }

    public void setRoutingInformation(String routingInformation) {
        this.routingInformation = routingInformation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcpAccount that = (AcpAccount) o;
        return Objects.equals(organizationNumber, that.organizationNumber) && Objects.equals(organizationName, that.organizationName) && Objects.equals(organizationAccount, that.organizationAccount) && Objects.equals(organizationBank, that.organizationBank) && Objects.equals(organizationShortName, that.organizationShortName) && Objects.equals(routingInformation, that.routingInformation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(organizationNumber, organizationName, organizationAccount, organizationBank, organizationShortName, routingInformation);
    }

    @Override
    public String toString() {
        return "AcpAccount{" +
                 "organizationNumber='" + organizationNumber + '\'' +
 ", organizationName='" + organizationName + '\'' +
 ", organizationAccount='" + organizationAccount + '\'' +
 ", organizationBank='" + organizationBank + '\'' +
 ", organizationShortName='" + organizationShortName + '\'' +
 ", routingInformation='" + routingInformation + '\'' +

                '}';
    }
}