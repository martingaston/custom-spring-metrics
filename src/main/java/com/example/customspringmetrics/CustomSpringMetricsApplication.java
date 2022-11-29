package com.example.customspringmetrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CustomSpringMetricsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomSpringMetricsApplication.class, args);
    }

}
