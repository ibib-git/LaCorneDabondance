package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import com.spring.henallux.laCorneDabondance.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Controller
@RequestMapping (value = "/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping(value = "/fruits",method = RequestMethod.GET)
    public String fruits (Model model) {
        int id = 1;
        ArrayList<ProductsModel> fruitsListing = new ArrayList<>();

        for (ProductsModel fruit: productsService.getAllProducts())
        {
            if (fruit.getCategoryProduct() == 1)
            {
                fruitsListing.add(fruit);
            }
        }

        model.addAttribute("productsListing",fruitsListing);
        model.addAttribute("title","Fruits");
        return "integrated:products";
    }

    @RequestMapping(value = "/legumes",method = RequestMethod.GET)
    public String legumes (Model model) {
        ArrayList<ProductsModel> legumesListing = new ArrayList<>();

        for (ProductsModel legume: productsService.getAllProducts())
        {
            if (legume.getCategoryProduct() == 2)
            {
                legumesListing.add(legume);
            }
        }

        model.addAttribute("productsListing",legumesListing);
        model.addAttribute("title","Légumes");
        return "integrated:products";
    }
}
