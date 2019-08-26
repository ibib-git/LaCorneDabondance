package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import com.spring.henallux.laCorneDabondance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Locale;


@Controller
@RequestMapping (value = "/signUp")
@SessionAttributes({ConstantConfiguration.SESSION,ConstantConfiguration.CURRENT_USER})
public class SignUpController extends SessionController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String register (Model model, @ModelAttribute(value = "session") SessionModel session,@ModelAttribute (value = "user")UserModel user, Locale locale)
    {
        setMessageSource(session,model,locale,"signUp");
        model.addAttribute("userEntity",new UserEntity());

        return "integrated:signUp";
    }

    @RequestMapping (value = "/newUser",method = RequestMethod.POST)
    public String addNewUser (Model model,@ModelAttribute(value = "session") SessionModel session,@ModelAttribute (value = "user")UserModel user, Locale locale)
    {
            // Tester si existe déja

            userService.insertUser(user);
            return  "redirect:/home";




    }

    @RequestMapping (value = "/login",method = RequestMethod.POST)
    public String login ( Model model,@ModelAttribute(value="session")SessionModel session,@ModelAttribute (value = "user")UserModel user, Authentication authentication, Locale locale)
    {
        UserEntity userEntity = (UserEntity)authentication.getPrincipal();
        return  "redirect:/home";

    }



}
