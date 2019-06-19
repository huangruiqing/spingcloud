package com.hrq.hrqregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrqRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrqRegisterApplication.class, args);
        System.out.println("start done");
    }

}
