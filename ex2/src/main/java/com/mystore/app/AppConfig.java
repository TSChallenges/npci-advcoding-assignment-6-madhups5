package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product tumbler() {
        Product tumbler = new Product();
        tumbler.setId(1);
        tumbler.setName("Tumbler");
        return tumbler;
    }

    @Bean
    public Product bucket() {
        Product bucket = new Product();
        bucket.setId(2);
        bucket.setName("Bucket");
        return bucket;
    }
}
