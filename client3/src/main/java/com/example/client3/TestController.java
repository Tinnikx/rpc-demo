package com.example.client3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author kaixiang.tao
 * @Date 2023/4/3
 */
@Controller
public class TestController {

    @GetMapping("/test")
    public String test() {

        return null;
    }
}
