package com.tib.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * This is the Main class to initialize the SDK.
 *
 * @author TIB Finance
 */
public class TibInvoker {

    public static Portal portal = null;

    /**
     * It will initialize the portal with given URL.
     *
     * @param url the url
     */
    public static void init(String url) {
        portal = new Portal(new ObjectMapper().registerModule(new JavaTimeModule()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false),
                url);
    }
}
