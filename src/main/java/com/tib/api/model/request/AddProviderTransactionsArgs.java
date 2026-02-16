
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Provider;
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


public class AddProviderTransactionsArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Gets or sets the provider.
     */
    @JsonProperty("Provider")
    private Provider provider;

    /**
     * Gets or sets the content of the file.
     */
    @JsonProperty("FileContent")
    private String fileContent;


    
    public AddProviderTransactionsArgs() {
    }

    
    public AddProviderTransactionsArgs(Provider provider, String fileContent) {
        this.provider = provider;
        this.fileContent = fileContent;
    }
    
    
    public AddProviderTransactionsArgs(String adminSessionToken, Provider provider, String fileContent) {
        super(adminSessionToken);
        this.provider = provider;
        this.fileContent = fileContent;
    }

    
    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddProviderTransactionsArgs that = (AddProviderTransactionsArgs) o;
        return Objects.equals(provider, that.provider) && Objects.equals(fileContent, that.fileContent) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(provider, fileContent);
    }

    @Override
    public String toString() {
        return "AddProviderTransactionsArgs{" +
                "provider='" + provider + '\'' +
                ", fileContent='" + fileContent + '\'' +

                '}';
    }
}