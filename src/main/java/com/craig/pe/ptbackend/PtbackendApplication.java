package com.craig.pe.ptbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class PtbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PtbackendApplication.class, args);
    }

}
