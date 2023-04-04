package com.example.client.test;

import org.example.TestService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author kaixiang.tao
 * @Date 2023/3/28
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Override public String test() {
        return UUID.randomUUID().toString();
    }
}
