package com.skypro.coursework2.servicies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class RandomConfig {

    @Bean
    Random random() {
        return new Random();
    }
}
