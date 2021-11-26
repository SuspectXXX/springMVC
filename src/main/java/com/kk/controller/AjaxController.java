package com.kk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kk.bean.Employee;
import com.kk.bean.TestClass;
import com.kk.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class AjaxController {

    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/json1")
    @ResponseBody
    public Collection<Employee> test1() {
        Collection<Employee> all = employeeDao.getAll();
        return all;
    }

    @RequestMapping("/json2")
    @ResponseBody
    public String test2() {
        Collection<Employee> all = employeeDao.getAll();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(all);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping("/json3")
    @ResponseBody
    public String test3(@RequestBody TestClass testClass) {
        System.out.println(testClass);
        return "success";
    }

}
