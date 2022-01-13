package com.ringo.controller;

import com.ringo.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("uri")
public class UrlController {
    @RequestMapping("u01")
    public ModelAndView u01(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name
    ) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("hello", name);
        return mv;
    }
    @RequestMapping(params = "u02")
    public ModelAndView u02(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name
    ) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("hello", name);
        return mv;
    }
    @RequestMapping("p1")
    public void p1( int i,double d){
        System.out.println("int:"+i+" double:"+d);
    }
    @RequestMapping("p2")
    public void p2(@RequestParam(defaultValue = "10") int i,@RequestParam(defaultValue = "0.0") double d){
        System.out.println("int:"+i+" double:"+d);
    }
    @RequestMapping("p3")
    public void p3(String name, String addr){
        System.out.println("name:"+name+" addr:"+addr);
    }
    @RequestMapping("p4")
    public void p4( Integer i,Double d){
        System.out.println("int:"+i+" double:"+d);
    }
    //传参i=1&i=2
    @RequestMapping("p5")
    public void p5( int i[]){
        for (Integer arr:i){
            System.out.println("number:"+arr);
        }
    }
    //参数与bean对象的属性需要一致
    @RequestMapping("p6")
    public void p6(User user){
        System.out.println(user);
    }

    @RequestMapping("p7")
    public String p7(User user){
        //user.getPhones().stream().forEach
        user.getPhones().forEach(phone->{
            System.out.println(phone.getName());
        });
        return "sucess";
    }

    @RequestMapping("p8")
    public String p8(User user){

        user.getMap().forEach((k,v)->{
            try {
                System.out.println(k + ":" + v);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        return "sucess";
    }

}
