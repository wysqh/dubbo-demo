package com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.start.inter.IMyInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private IMyInterface myInterface;
    @RequestMapping(value = "/test.do")
    @ResponseBody
    public String getTest() {
        return myInterface.sayHello();
    }
}
