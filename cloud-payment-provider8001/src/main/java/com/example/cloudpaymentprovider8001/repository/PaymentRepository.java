package com.example.cloudpaymentprovider8001.repository;


import org.example.repository.entities.Payment;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author kaixiang.tao
 * @Date 2023/4/4
 */
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
