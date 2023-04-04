package com.example.cloudconsumerorder80.controller;

import org.example.repository.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author kaixiang.tao
 * @Date 2023/4/4
 */
@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public Payment create(@RequestBody Payment payment) {
        log.info(payment.toString());
        return restTemplate.postForEntity(PAYMENT_URL + "/payment/create", payment, Payment.class).getBody();
    }

    @GetMapping("/consumer/payment/{paymentId}")
    public Payment getPayment(@PathVariable Integer paymentId) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/{paymentId}", Payment.class, paymentId);
    }
}
