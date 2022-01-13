package com.ringo.controller;

import com.ringo.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Jc {
    @RequestMapping(value="/api")
    @ResponseBody
    public User api() {
       /* Map map=new HashMap();
        map.put("status", "200");
        return map;*/
        User user=new User();
        user.setId(1);
        user.setName("jack");
        Map<String,String> map=new HashMap<>();
        map.put ("company","zjds");
        user.setMap(map);
        List list =new ArrayList();
        list.add("坚果");
        user.setPhones(list);
        user.setPasswd(123456+"");
        return  user;
    }
    @RequestMapping(value="/api1")
    @ResponseBody
    public User api1(@RequestBody User user) {
        return user;
    }

}
