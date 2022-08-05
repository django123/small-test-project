package io.bootify.my_app_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class MyAppTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyAppTestApplication.class, args);
    }

}
