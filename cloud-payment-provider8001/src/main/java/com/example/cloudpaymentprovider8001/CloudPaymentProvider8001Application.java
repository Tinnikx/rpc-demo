package com.example.cloudpaymentprovider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan("org.example.repository.entities")
@EnableDiscoveryClient
public class CloudPaymentProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentProvider8001Application.class, args);
    }

}
