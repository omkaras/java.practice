package com.os.java.practice;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyConfigProperties.class)
public class MyConfig {

    @Bean
    public DataToUse dataToUse(MyConfigProperties myConfigProperties){
        return new DataToUse(myConfigProperties.getApi());
    }
}
