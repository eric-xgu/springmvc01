package com.ringo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView helloWorld(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name
    ) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name", name);
        return mv;
    }
}