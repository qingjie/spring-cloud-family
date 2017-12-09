package com.homecare;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhao
 */

@SpringBootApplication
@RestController
public class HomecareConfigClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomecareConfigClientApplication.class, args);
    }

    @Value("${logging.level.com.didispace}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
