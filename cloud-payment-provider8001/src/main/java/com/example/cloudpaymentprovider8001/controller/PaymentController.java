package com.example.cloudpaymentprovider8001.controller;

import com.example.cloudpaymentprovider8001.repository.PaymentRepository;

import org.example.repository.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author kaixiang.tao
 * @Date 2023/4/4
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping("/payment/create")
    public Payment create(@RequestBody Payment payment) {
        log.info(payment.toString());
        paymentRepository.save(payment);
        return payment;
    }

    @GetMapping("/payment/{paymentId}")
    public Payment getPaymentById(@PathVariable Integer paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }
}
