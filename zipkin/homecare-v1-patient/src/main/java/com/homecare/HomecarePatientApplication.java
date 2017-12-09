package com.homecare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author zhao
 */

@SpringBootApplication
@RestController
public class HomecarePatientApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomecarePatientApplication.class, args);
    }

    private static final Logger LOG = Logger.getLogger(HomecarePatientApplication.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace homecare-v1-patient ");
        return restTemplate.getForObject("http://localhost:8989/qingjie", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace homecare-v1-patient ");

        return "i'm homecare-v1-patient";

    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
