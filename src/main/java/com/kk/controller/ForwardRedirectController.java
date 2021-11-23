package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ForwardRedirectController {

    @RequestMapping("/test01")
    public String test01() {
        System.out.println("test01...");
        return "forward:test001";
    }

    @RequestMapping("/test001")
    public String test02() {
        System.out.println("test02...");
        return "forward:/test.jsp";
    }

    @RequestMapping("/test03")
    public String test03() {
        System.out.println("test03...");
        return "redirect:test04";
    }

    @RequestMapping("/test04")
    public String test04() {
        System.out.println("test04...");
        return "redirect:/test.jsp";
    }

}
