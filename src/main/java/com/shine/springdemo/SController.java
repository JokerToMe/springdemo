package com.shine.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SController {

    @ResponseBody
    @RequestMapping("hello")
    public String helloSpringBoot() {
        return "Hello,Spring Boot";
    }
}
