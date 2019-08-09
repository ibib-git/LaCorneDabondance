package com.spring.henallux.laCorneDabondance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping (value = "/signUp")
public class SignUpController {

    @RequestMapping(method = RequestMethod.GET)
    public String register (Model model){

        model.addAttribute("title","Inscription");
        return "integrated:signUp";
    }
}
