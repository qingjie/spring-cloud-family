package com.homecare;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhao
 */

@SpringBootApplication
@Slf4j
public class HomecareCoreApplication {

    public static void main(String[] args) {
        log.info("Start application ...");
        SpringApplication.run(HomecareCoreApplication.class, args);
    }
}
