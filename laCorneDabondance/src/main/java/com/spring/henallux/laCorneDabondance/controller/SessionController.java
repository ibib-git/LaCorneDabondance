package com.spring.henallux.laCorneDabondance.controller;


import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Locale;

@Controller
@SessionAttributes ({ConstantConfiguration.CURRENT_USER,ConstantConfiguration.SESSION})
public class SessionController {

    @ModelAttribute(ConstantConfiguration.SESSION)
    public SessionModel Session()
    {
        return new SessionModel();
    }

    @ModelAttribute (ConstantConfiguration.CURRENT_USER)
    public UserEntity User() {return new UserEntity(); }

    @Autowired
    protected  MessageSource messageSource;



    public void setMessageSource(SessionModel session, Model model, Locale locale,String page){
        String title = messageSource.getMessage(page, null, locale);
        model.addAttribute("title",title);

    }

}
