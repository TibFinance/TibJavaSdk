
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


public class ProviderAddressEntity   {

    
    /**
 * Gets or sets the type of the URL.
 */
    @JsonProperty("UrlType")
    private String urlType;

    /**
 * Gets or sets the URL.
 */
    @JsonProperty("Url")
    private String url;

    /**
 * Gets or sets the port.
 */
    @JsonProperty("Port")
    private Integer port;


    
    public ProviderAddressEntity() {
    }

    
    public ProviderAddressEntity(String urlType, String url, Integer port) {
        this.urlType = urlType;
this.url = url;
this.port = port;

    }
    
    

    
    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderAddressEntity that = (ProviderAddressEntity) o;
        return Objects.equals(urlType, that.urlType) && Objects.equals(url, that.url) && Objects.equals(port, that.port) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(urlType, url, port);
    }

    @Override
    public String toString() {
        return "ProviderAddressEntity{" +
                 "urlType='" + urlType + '\'' +
 ", url='" + url + '\'' +
 ", port='" + port + '\'' +

                '}';
    }
}