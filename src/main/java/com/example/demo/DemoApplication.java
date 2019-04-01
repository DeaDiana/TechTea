package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class DemoApplication {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        final Properties properties = applicationContext.getBean(Properties.class);
        System.out.println(properties.getProp1());
        System.out.println(properties.getProp2());
        System.out.println(properties.getInner().getProp3());
        System.out.println(properties.getInner().getProp4());
    }
}
