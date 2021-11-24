package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

    @RequestMapping("/handle01")
    public String handle01(String name) {
        System.out.println("-------------");
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/handle02")
    public String handle02(@RequestParam("name") String name) {
        System.out.println("-------------");
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/handle03")
    public String handle03(@RequestParam(value = "name", required = false) String name) {
        System.out.println("-------------");
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/handle04")
    public String handle04(@RequestParam(value = "name",defaultValue = "你没名字") String name) {
        System.out.println("-------------");
        System.out.println(name);
        return "success";
    }

    @RequestMapping("/handle05/{bid}")
    public String handle05(@PathVariable("bid") String bid, @RequestParam(value = "id") String id) {
        System.out.println(id);
        System.out.println(bid);
        return "success";
    }

}
