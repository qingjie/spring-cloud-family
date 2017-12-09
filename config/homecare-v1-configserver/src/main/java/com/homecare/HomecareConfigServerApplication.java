package com.homecare;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhao
 */

@SpringBootApplication
@EnableConfigServer
public class HomecareConfigServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomecareConfigServerApplication.class, args);
    }
}
