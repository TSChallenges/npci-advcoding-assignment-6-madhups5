package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")
public class AppConfig {

    @Bean
    public Product tumblerProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("Tumbler");
        return product;
    }
}
