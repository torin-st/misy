package com.slyadz.misy.departments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DepartmentsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DepartmentsServiceApplication.class, args);
    }
}
