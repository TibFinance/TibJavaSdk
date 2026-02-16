
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ClientEntity;
import com.tib.api.model.ClientLogin;
import com.tib.api.model.ServiceEntity;
import com.tib.api.model.Merchant;
import com.tib.api.model.ServiceFeeSettings;
import com.tib.api.model.ServiceSettings;
import com.tib.api.model.ClientSettings;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateClientNewAdminArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Identifies the TIB client (account) using its unique GUID.
     */
    @JsonProperty("Client")
    private ClientEntity client;

    /**
     * The 'Password' property is a critical component in user authentication, safeguarding individualized user data.
     */
    @JsonProperty("Password")
    private String password;

    /**
     * 
     */
    @JsonProperty("ClientLogin")
    private ClientLogin clientLogin;

    /**
     * 
     */
    @JsonProperty("ServiceInfo")
    private ServiceEntity serviceInfo;

    /**
     * 
     */
    @JsonProperty("CreateInnactive")
    private boolean createInnactive;

    /**
     * This property holds the basic information necessary for creating or updating a merchant's account within the TIB Finance API system.
     */
    @JsonProperty("MerchantInfo")
    private Merchant merchantInfo;

    /**
     * Gets or sets the ServiceFeeSettings model that defines the fee configuration for a specific service contract.
     */
    @JsonProperty("ServiceFeeSettings")
    private ServiceFeeSettings serviceFeeSettings;

    /**
     * 
     */
    @JsonProperty("Settings")
    private ServiceSettings settings;

    /**
     * 
     */
    @JsonProperty("ClientSettings")
    private ClientSettings clientSettings;


    
    public CreateClientNewAdminArgs() {
    }

    
    public CreateClientNewAdminArgs(ClientEntity client, String password, ClientLogin clientLogin, ServiceEntity serviceInfo, boolean createInnactive, Merchant merchantInfo, ServiceFeeSettings serviceFeeSettings, ServiceSettings settings, ClientSettings clientSettings) {
        this.client = client;
        this.password = password;
        this.clientLogin = clientLogin;
        this.serviceInfo = serviceInfo;
        this.createInnactive = createInnactive;
        this.merchantInfo = merchantInfo;
        this.serviceFeeSettings = serviceFeeSettings;
        this.settings = settings;
        this.clientSettings = clientSettings;
    }
    
    
    public CreateClientNewAdminArgs(String adminSessionToken, ClientEntity client, String password, ClientLogin clientLogin, ServiceEntity serviceInfo, boolean createInnactive, Merchant merchantInfo, ServiceFeeSettings serviceFeeSettings, ServiceSettings settings, ClientSettings clientSettings) {
        super(adminSessionToken);
        this.client = client;
        this.password = password;
        this.clientLogin = clientLogin;
        this.serviceInfo = serviceInfo;
        this.createInnactive = createInnactive;
        this.merchantInfo = merchantInfo;
        this.serviceFeeSettings = serviceFeeSettings;
        this.settings = settings;
        this.clientSettings = clientSettings;
    }

    
    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ClientLogin getClientLogin() {
        return clientLogin;
    }

    public void setClientLogin(ClientLogin clientLogin) {
        this.clientLogin = clientLogin;
    }

    public ServiceEntity getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceEntity serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public boolean getCreateInnactive() {
        return createInnactive;
    }

    public void setCreateInnactive(boolean createInnactive) {
        this.createInnactive = createInnactive;
    }

    public Merchant getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(Merchant merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    public ServiceFeeSettings getServiceFeeSettings() {
        return serviceFeeSettings;
    }

    public void setServiceFeeSettings(ServiceFeeSettings serviceFeeSettings) {
        this.serviceFeeSettings = serviceFeeSettings;
    }

    public ServiceSettings getSettings() {
        return settings;
    }

    public void setSettings(ServiceSettings settings) {
        this.settings = settings;
    }

    public ClientSettings getClientSettings() {
        return clientSettings;
    }

    public void setClientSettings(ClientSettings clientSettings) {
        this.clientSettings = clientSettings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateClientNewAdminArgs that = (CreateClientNewAdminArgs) o;
        return Objects.equals(client, that.client) && Objects.equals(password, that.password) && Objects.equals(clientLogin, that.clientLogin) && Objects.equals(serviceInfo, that.serviceInfo) && Objects.equals(createInnactive, that.createInnactive) && Objects.equals(merchantInfo, that.merchantInfo) && Objects.equals(serviceFeeSettings, that.serviceFeeSettings) && Objects.equals(settings, that.settings) && Objects.equals(clientSettings, that.clientSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(client, password, clientLogin, serviceInfo, createInnactive, merchantInfo, serviceFeeSettings, settings, clientSettings);
    }

    @Override
    public String toString() {
        return "CreateClientNewAdminArgs{" +
                "client='" + client + '\'' +
                ", password='" + password + '\'' +
                ", clientLogin='" + clientLogin + '\'' +
                ", serviceInfo='" + serviceInfo + '\'' +
                ", createInnactive='" + createInnactive + '\'' +
                ", merchantInfo='" + merchantInfo + '\'' +
                ", serviceFeeSettings='" + serviceFeeSettings + '\'' +
                ", settings='" + settings + '\'' +
                ", clientSettings='" + clientSettings + '\'' +

                '}';
    }
}