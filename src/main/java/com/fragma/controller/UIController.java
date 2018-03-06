package com.fragma.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UIController {
    @RequestMapping("/")
    public String home(){
        return "fragma hi new code";
    }
}
