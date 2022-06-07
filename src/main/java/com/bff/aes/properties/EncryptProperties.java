package com.bff.aes.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * created by bff
 * 2022-6-7
 */
@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.itboyhub.com";
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
