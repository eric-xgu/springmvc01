package com.ringo.modelcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("h")
public class Model1 {
    @RequestMapping("hi")
    public ModelAndView helloWorld(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name
    ) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("hello", name);
        System.out.println("视图生成");
        return mv;
    }

    //其他方式
    @RequestMapping("h2")
    public String helloWorld2(HttpServletRequest request) {
        request.setAttribute("hello","eric");
        //返回视图名
        return "hello";
    }
    @RequestMapping("h3")
    public String helloWorld3(ModelMap modelMap) {
        modelMap.addAttribute("hello","jack");
        //返回视图名
        return "hello";
    }
    @RequestMapping("h4")
    public String helloWorld3(Model model ){
        model.addAttribute("hello","jack21");
        //返回视图名
        return "hello";
    }
    @RequestMapping("h5")
    public String helloWorld3(Map map){
        map.put("hello","jack22");
        //返回视图名
        return "hello";
    }
}

