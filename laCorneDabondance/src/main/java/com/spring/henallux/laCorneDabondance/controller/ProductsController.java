package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import com.spring.henallux.laCorneDabondance.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value = "/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping(method = RequestMethod.GET)
    public String products (Model model) {
        Integer id = 1;
        String chat = "pilou";
        model.addAttribute("apple",productsService.getProduct(id).getName());
        model.addAttribute("title","Produits");
        return "integrated:products";
    }
}
