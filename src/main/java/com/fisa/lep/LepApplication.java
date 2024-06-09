package com.fisa.lep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LepApplication {

    public static void main(String[] args) {
        SpringApplication.run(LepApplication.class, args);
    }

}
