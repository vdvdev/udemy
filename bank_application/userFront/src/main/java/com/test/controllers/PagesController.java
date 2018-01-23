package com.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ara")
public class PagesController {

    @RequestMapping(value = "/second")
    public String secondPage(){
        return "secondPage";
    }
}
