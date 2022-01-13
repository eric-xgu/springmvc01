package com.ringo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HController {

    @RequestMapping("hello11")
    public ModelAndView helloWorld(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name
    ) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("hello", name);
        return mv;
    }
}
