package com.homecare;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author zhao
 */

@SpringBootApplication
@EnableTurbine
public class HomecareTurbineApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(HomecareTurbineApplication.class).web(true).run(args);
    }

}
