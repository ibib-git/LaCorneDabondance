package com.spring.henallux.laCorneDabondance.controller;


import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes ({ConstantConfiguration.CURRENT_USER,ConstantConfiguration.SESSION})
public class SessionController {

    @ModelAttribute(ConstantConfiguration.SESSION)
    public SessionModel Session()
    {
        return new SessionModel();
    }

    @ModelAttribute (ConstantConfiguration.CURRENT_USER)
    public UserModel User() {return new UserModel();}

}
