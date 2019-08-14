package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import com.spring.henallux.laCorneDabondance.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

@Controller
@RequestMapping(value ="/home")
public class WelcomController {

    @Autowired
    private ProductsService productsService;
    private ArrayList<ProductsModel> productsListing;
    private ProductsModel welcomFruit,welcomLegume;

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model){

        Random random = new Random();
        productsListing = productsService.getSeasonProducts();
        int indexRandom ;
        Boolean fruit = true;
        Boolean legume = true;

        while ((fruit) || (legume))
        {
            indexRandom = random.nextInt(productsListing.size());

            if (productsListing.get(indexRandom).getCategoryProduct() == 1)
            {
                welcomFruit = productsListing.get(indexRandom);
                fruit = false;
            }

            if (productsListing.get(indexRandom).getCategoryProduct() == 2)
            {
                welcomLegume = productsListing.get(indexRandom);
                legume = false;
            }
        }

        model.addAttribute("welcomFruitsName",welcomFruit.getName());
        model.addAttribute("welcomFruitsImage",welcomFruit.getPhotoLink());
        model.addAttribute("welcomFruitsDescription",welcomFruit.getDescription());
        model.addAttribute("welcomFruitsId",welcomFruit.getId());
        model.addAttribute("welcomLegumeName",welcomLegume.getName());
        model.addAttribute("welcomLegumeImage",welcomLegume.getPhotoLink());
        model.addAttribute("welcomLegumeDescription",welcomLegume.getDescription());
        model.addAttribute("welcomLegumeId",welcomLegume.getId());
        model.addAttribute("title","La Corne d'Abondance");
        return "integrated:welcom";

    }

    @RequestMapping(value ="/contact",method = RequestMethod.GET)
    public String contact (Model model) {

        model.addAttribute("title","Contact");
        return "integrated:contact";
    }

    @RequestMapping(value = "/calendar",method = RequestMethod.GET)
    public String calendar (Model model){

        model.addAttribute("title","Calendrier");
        return "integrated:calendar";
    }






}