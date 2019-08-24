package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import com.spring.henallux.laCorneDabondance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String register (Model model, @ModelAttribute(value = "session") SessionModel session,@ModelAttribute (value = "user")UserModel user)
    {

        model.addAttribute("title","Inscription");
        return "integrated:signUp";
    }

    @RequestMapping (value = "/newUser",method = RequestMethod.POST)
    public String addNewUser (Model model,@ModelAttribute(value = "session") SessionModel session,@ModelAttribute (value = "user")UserModel user)
    {
        UserModel userModel = user;
        userModel.setEnabled(true);
        userModel.setCredentials_non_expired(true);
        userModel.setAuthorities("admin");
        userModel.setNon_expired(true);
        userModel.setNon_locked(true);

        userService.insertUser(userModel);

        return  "redirect:/home";
    }



}
