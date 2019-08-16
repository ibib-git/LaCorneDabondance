package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping (value = "/signUp")
@SessionAttributes({ConstantConfiguration.SESSION,ConstantConfiguration.CURRENT_USER})
public class SignUpController {

    @RequestMapping(method = RequestMethod.GET)
    public String register (Model model,@ModelAttribute(value = "session") SessionModel session){

        model.addAttribute("title","Inscription");
        return "integrated:signUp";
    }
}
