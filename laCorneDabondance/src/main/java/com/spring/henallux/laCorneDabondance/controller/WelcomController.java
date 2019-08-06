package com.spring.henallux.laCorneDabondance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping(value ="/home")
public class WelcomController {

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){

        model.addAttribute("title","La Corne d'Abondance");
        return "integrated:welcom";
    }






}