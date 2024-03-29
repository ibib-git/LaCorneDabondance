package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.model.MarketLineModel;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import com.spring.henallux.laCorneDabondance.service.CommandService;
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
@RequestMapping (value = "/command")
@SessionAttributes({ConstantConfiguration.SESSION,ConstantConfiguration.CURRENT_USER})
public class CommandController extends SessionController {

    @Autowired
    private CommandService commandService;


    @RequestMapping (method = RequestMethod.GET)
    public String command (Model model, @ModelAttribute(value = "session") SessionModel session, Locale locale){

        setMessageSource(session,model,locale,"command");

        // Vérifier si le client est identifié

        Double totalCommand = (0.0);
        Double priceFinal = 0.0;


        for (MarketLineModel market: session.getMarketModel().getMarketLineModel())
        {
            priceFinal = commandService.calculPriceLineWithReduc(market.getQuantity(),market.getProductsModel());
            market.setFinalPrice(priceFinal);
            totalCommand += (market.getQuantity() * market.getFinalPrice());

        }
        model.addAttribute("totalCommand",totalCommand);
        model.addAttribute("userEntity",new UserEntity());


        return "integrated:command";
    }

    @RequestMapping (value = "/toPay",method = RequestMethod.GET)
    public String toPay (Model model, @ModelAttribute(value = "session") SessionModel session, Locale locale, Authentication authentication){

        UserEntity userEntity = (UserEntity)authentication.getPrincipal();

        commandService.saveMarket(session.getMarketModel(),userEntity);
        commandService.updateQuantity(session.getMarketModel());

        // Normalement redirigé vers payement Paypal

        return "integrated:payement";

    }
}
