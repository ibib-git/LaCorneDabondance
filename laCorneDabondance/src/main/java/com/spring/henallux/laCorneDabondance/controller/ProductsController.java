package com.spring.henallux.laCorneDabondance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value = "/products")
public class ProductsController {

    @RequestMapping(method = RequestMethod.GET)
    public String products (Model model) {

        model.addAttribute("title","Produits");
        return "integrated:products";
    }
}
