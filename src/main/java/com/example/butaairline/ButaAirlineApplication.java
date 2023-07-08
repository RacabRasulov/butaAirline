package com.example.butaairline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.butaairline.client")
public class ButaAirlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ButaAirlineApplication.class, args);
    }

}
