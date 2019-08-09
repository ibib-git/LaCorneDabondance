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

    @RequestMapping(value ="/contact",method = RequestMethod.GET)
    public String contact (Model model) {

        model.addAttribute("title","Contact");
        return "integrated:contact";
    }

    @RequestMapping(value = "/calendar",method = RequestMethod.GET)
    public String calendar (Model model){

        model.addAttribute("title","Calendrier");
        return "integrated:calendar";
    }






}