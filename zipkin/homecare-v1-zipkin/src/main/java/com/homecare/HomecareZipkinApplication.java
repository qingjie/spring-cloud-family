package com.homecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author zhao
 */

@SpringBootApplication
@EnableZipkinServer
public class HomecareZipkinApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomecareZipkinApplication.class, args);
    }

}
