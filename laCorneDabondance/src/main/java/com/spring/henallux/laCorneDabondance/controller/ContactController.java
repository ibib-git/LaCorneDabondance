package com.spring.henallux.laCorneDabondance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="/contact")
public class ContactController {

    @RequestMapping(method = RequestMethod.GET)
    public String contact (Model model){
        return "integrated:contact";
    }

}
