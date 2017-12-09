package com.homecare;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhao
 */

@SpringBootApplication
@Slf4j
@EnableFeignClients
@EnableDiscoveryClient
public class HomecareCoreApplication {

    public static void main(String[] args) {
        log.info("Start application ...");
        SpringApplication.run(HomecareCoreApplication.class, args);
    }
}
