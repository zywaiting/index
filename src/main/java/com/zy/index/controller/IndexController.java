package com.zy.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/shop")
    public String toShop(){
        return "shop";
    }
}
