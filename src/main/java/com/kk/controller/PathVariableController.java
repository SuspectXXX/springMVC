package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

    @RequestMapping("/test01/{id}")
    public String test01(@PathVariable("id") String uId) {
        System.out.println("test01 + " + uId);
        return "success";
    }

    @RequestMapping("/{id}/test02")
    public String test02(@PathVariable("id") String uId) {
        System.out.println("test02 + " + uId);
        return "success";
    }

    @RequestMapping("/{id}")
    public String test03(@PathVariable("id") String uId) {
        System.out.println("test03 + " + uId);
        return "success";
    }

}
