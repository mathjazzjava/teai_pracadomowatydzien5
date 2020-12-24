package com.mathjazz.grawalutowa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrawalutowaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrawalutowaApplication.class, args);
        Game game = new Game();

    }

}
