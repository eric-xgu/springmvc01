package com.ringo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class view {
    //重定向
    @RequestMapping("v1")
    public String v1() {
        return "redirect:index.jsp?hello=jack";
    }


    @RequestMapping("v2")
    public String v2(RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("hello","华为");
        return "redirect:index.jsp";
    }

    @RequestMapping("v3")
    public ModelAndView v3() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("redirect:index.jsp");
        modelAndView.addObject("hello","特斯拉");
        return modelAndView;
    }

    @RequestMapping("v4")
    public ModelAndView v4() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("forward:hello.do");
        modelAndView.addObject("hello","特斯拉");
        return modelAndView;
    }

    @RequestMapping("v5")
    public ModelAndView v5() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("forward:hello.do?id=1&name=2");
        return modelAndView;
    }


}
