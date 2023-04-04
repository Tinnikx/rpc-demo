package com.example.client2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author kaixiang.tao
 * @Date 2023/3/28
 */
@RestController
public class TestController {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    public RestTemplate restTemplate;
    @GetMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://client1/test", String.class);
    }
}
