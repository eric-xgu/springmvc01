package com.ringo.controller;

import com.ringo.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("login");
        return mv;
    }

    @RequestMapping("login")
    public ModelAndView login(HttpSession session){

        ModelAndView mv=new ModelAndView();
        User user=new User();
        user.setName("jack");
        user.setPasswd("123456");
        System.out.println("登录成功");
        mv.setViewName("home");
        System.out.println(session.getId());
        session.setAttribute("user",user);
        return mv;
    }

    @RequestMapping("adduser")
    public ModelAndView adduser(){
        ModelAndView mv=new ModelAndView("adduser");
        return mv;
    }

    @RequestMapping("deleteuser")
    public ModelAndView deleteuser(){
        ModelAndView mv=new ModelAndView("deleteuser");
        return mv;
    }
    @RequestMapping("updateuser")
    public ModelAndView updateuser(){
        ModelAndView mv=new ModelAndView("updateuser");
        return mv;
    }

}
