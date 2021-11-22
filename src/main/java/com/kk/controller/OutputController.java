package com.kk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class OutputController {

    @RequestMapping("/map")
    public String mapTest(Map<String, Object> map) {
        map.put("msg", "你好坏！");
        return "output";
    }

    @RequestMapping("/model")
    public String modelTest(Model model) {
        model.addAttribute("msg", "你好坏呀！");
        return "output";
    }

    @RequestMapping("/modelMap")
    public String modelMapTest(ModelMap modelMap) {
        modelMap.addAttribute("msg", "你好坏呀，我好喜欢！");
        return "output";
    }

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndViewTest() {
        ModelAndView modelAndView = new ModelAndView("output");
        modelAndView.addObject("msg", "你好骚！");
        return modelAndView;
    }

}
