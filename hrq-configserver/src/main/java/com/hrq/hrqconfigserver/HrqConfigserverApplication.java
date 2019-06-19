package com.hrq.hrqconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class HrqConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrqConfigserverApplication.class, args);
        System.out.println("start done");
    }

}
