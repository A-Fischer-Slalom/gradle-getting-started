package com.example.heroku;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class HerokuApplication {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
