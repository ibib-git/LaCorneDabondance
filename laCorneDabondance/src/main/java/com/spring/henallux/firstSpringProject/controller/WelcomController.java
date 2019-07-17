package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.model.MagicKeyForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping(value ="/hello")
public class WelcomController {

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){
        return "integrated:welcom";
    }


    @RequestMapping (method = RequestMethod.GET)
    public String Magic(Model model)
    {
    model.addAttribute("magicKeyForm", new MagicKeyForm());
    return "integrated:welcom";
    }

    @RequestMapping (method = RequestMethod.POST)
    public String getMagicData(Model model,@ModelAttribute(value = "magicKeyForm") MagicKeyForm magicKeyForm)
    {
        String valueForm = magicKeyForm.getMagicKey();
        model.addAttribute("valueForm",valueForm);
        return "integrated:welcom";
    }



}
