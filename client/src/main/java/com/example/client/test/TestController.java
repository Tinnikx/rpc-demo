package com.example.client.test;

import org.example.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kaixiang.tao
 * @Date 2023/3/28
 */
@RestController
public class TestController {

    @Value("#{T(java.util.UUID).randomUUID()}")
    private String random;

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test() {
        return "client1 " + random + ' ' + testService.test();
    }
}
