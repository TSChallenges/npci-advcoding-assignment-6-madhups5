package com.mystore.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
    public static void main(String[] arg) {

        // Load the Spring Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Product beans from Spring's IoC container
        Product tumbler = context.getBean("tumbler", Product.class);
        Product bucket = context.getBean("bucket", Product.class);

        // Display the Product details
        System.out.println("Product 1: " + tumbler);
        System.out.println("Product 2: " + bucket);
    }  
}