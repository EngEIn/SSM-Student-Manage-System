package com.bluebridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/myTest.do")
    @ResponseBody
    public String myTest() {
        return "你好,蓝桥云课";
    }

}