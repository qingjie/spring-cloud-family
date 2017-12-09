package com.homecare;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhao
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HomecareConsulApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(HomecareConsulApplication.class).web(true).run(args);
    }

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm qingjie";
    }
}
