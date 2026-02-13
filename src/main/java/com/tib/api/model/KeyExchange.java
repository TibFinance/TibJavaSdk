package com.tib.api.model;

public class KeyExchange {
    private Key key;

    public KeyExchange(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "{" +
                "\"key\":" + key +
                "}";
    }
}
