package com.mesut.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping("/login")
    public String loging(){
        return "login" ;
    }

    //@PostMapping("")


    @GetMapping("index")
    public String index(){
        return "index";
    }
}
