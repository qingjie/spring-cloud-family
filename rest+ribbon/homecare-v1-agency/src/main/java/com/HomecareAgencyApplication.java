package com.homecare;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhao
 */

@SpringBootApplication
@Slf4j
@RestController
@EnableEurekaClient
public class HomecareAgencyApplication {

    @Value("${server.port}")
    String port;

    public static void main(String[] args) {
        log.info("Start application ...");
        SpringApplication.run(HomecareAgencyApplication.class, args);
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
