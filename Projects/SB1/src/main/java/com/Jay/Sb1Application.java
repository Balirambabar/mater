package com.Jay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb1Application.class, args);
	}

    @GetMapping("/")
    public String UserService() {
        return "welcome to jaybabaji Enterprise";
    }

}
