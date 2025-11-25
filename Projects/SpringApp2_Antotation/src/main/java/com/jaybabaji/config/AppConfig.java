package com.jaybabaji.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig===");
    }
}
