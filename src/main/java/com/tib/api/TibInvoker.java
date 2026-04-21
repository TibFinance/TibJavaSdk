package com.tib.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.tib.api.client.FlexibleOffsetDateTimeDeserializer;

import java.time.OffsetDateTime;

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
        SimpleModule flexibleDateModule = new SimpleModule();
        flexibleDateModule.addDeserializer(OffsetDateTime.class, new FlexibleOffsetDateTimeDeserializer());
        portal = new Portal(new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .registerModule(flexibleDateModule)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false),
                url);
    }
}
