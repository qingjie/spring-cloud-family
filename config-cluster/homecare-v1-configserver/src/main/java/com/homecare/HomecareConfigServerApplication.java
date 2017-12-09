package com.homecare;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhao
 */

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class HomecareConfigServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomecareConfigServerApplication.class, args);
    }
}
