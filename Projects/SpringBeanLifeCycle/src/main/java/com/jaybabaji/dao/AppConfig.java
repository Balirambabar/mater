package com.jaybabaji.dao;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@Component
public class AppConfig {

    @Pos
    public void setProperties() {
        System.out.println("set properties");
    }

}
