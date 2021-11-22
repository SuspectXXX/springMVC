package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requestMapping")
public class RequestMappingController {

    @RequestMapping("/hello")
    public String requestMpping() {
        System.out.println("RequestMapping...");
        return "success";
    }

}
