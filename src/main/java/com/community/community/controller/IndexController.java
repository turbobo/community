package com.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  //控制器
public class IndexController {
//    @GetMapping("/hello")  //默认访问路径
//    public String hello(@RequestParam(name="name") String name, Model model){
//        model.addAttribute("name", name);
//        return "index";
//    }

    @GetMapping("/")  //默认访问路径
    public String index(){
        return "index";
    }
}
