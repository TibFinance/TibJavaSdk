
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.LoginType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AdminLoggedInformation  extends BaseLoggedSession  {

    
    /**
     * Gets or sets the admin identifier.
     */
    @JsonProperty("AdminID")
    private String adminID;


    
    public AdminLoggedInformation() {
    }

    
    public AdminLoggedInformation(String adminID) {
        this.adminID = adminID;
    }
    
    
    public AdminLoggedInformation(LocalDateTime lastActivityDate, LocalDateTime creationDate, String loginsUserRelationsId, LoginType permissionType, String adminID) {
        super(lastActivityDate, creationDate, loginsUserRelationsId, permissionType);
        this.adminID = adminID;
    }

    
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminLoggedInformation that = (AdminLoggedInformation) o;
        return Objects.equals(adminID, that.adminID) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(adminID);
    }

    @Override
    public String toString() {
        return "AdminLoggedInformation{" +
                "adminID='" + adminID + '\'' +

                '}';
    }
}