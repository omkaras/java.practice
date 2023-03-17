package com.os.java.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("eps.br")
public class MyConfigProperties {

    List<APIInfo> api;

    public MyConfigProperties() {
    }

    public MyConfigProperties(List<APIInfo> api) {
        this.api = api;
    }

    public List<APIInfo> getApi() {
        return api;
    }

    public void setApi(List<APIInfo> api) {
        this.api = api;
    }
}
