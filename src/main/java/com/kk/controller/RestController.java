package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestController {

    @RequestMapping(value = "/book/{bId}", method = RequestMethod.GET)
    public String getBook(@PathVariable("bId") int bId) {
        System.out.println("get " + bId);
        return "success";
    }

    @RequestMapping(value = "/book/{bId}", method = RequestMethod.DELETE)
    public String daleteBook(@PathVariable("bId") int bId) {
        System.out.println("delete " + bId);
        return "success";
    }

    @RequestMapping(value = "/book/{bId}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("bId") int bId) {
        System.out.println("put " + bId);
        return "success";
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String addBook() {
        System.out.println("add");
        return "success";
    }
}
