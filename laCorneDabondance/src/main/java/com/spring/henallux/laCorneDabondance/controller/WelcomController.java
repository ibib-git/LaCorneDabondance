package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.model.*;
import com.spring.henallux.laCorneDabondance.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


@Controller
@RequestMapping(value ="/home")
@SessionAttributes ({ConstantConfiguration.SESSION,ConstantConfiguration.CURRENT_USER})
public class WelcomController extends SessionController {

    @Autowired
    private ProductsService productsService;
    private ArrayList<ProductsModel> productsListing,productsAllList;
    private ArrayList<CategoryModel> categoryModels;
    private ProductsModel welcomFruit,welcomLegume;
    private CategoryModel categoryModel;
    private LanguageModel languageModel;
    private ArrayList<TraductionModel> traductionModels;
    private TraductionModel traductionModel;

    @RequestMapping (method = RequestMethod.GET)
    public String home (Model model, @ModelAttribute (value = "session")SessionModel session, Locale locale){

        setMessageSource(session,model,locale,"home");

        Random random = new Random();
        productsListing = productsService.getSeasonProducts();
        int indexRandom ;
        Boolean fruit = true;
        Boolean legume = true;

        while ((fruit) || (legume))
        {
            indexRandom = random.nextInt(productsListing.size());

            if (productsListing.get(indexRandom).getCategoryModel().getId() == 1)
            {
                welcomFruit = productsListing.get(indexRandom);
                fruit = false;
            }

            if (productsListing.get(indexRandom).getCategoryModel().getId() == 2)
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



        productsAllList = productsService.getAllProducts();
        model.addAttribute("productsList",productsAllList);
        model.addAttribute("userEntity",new UserEntity());
/*
        languageModel = productsService.getLanguage(locale.toString());
        ArrayList<CategoryModel> categoryList = productsService.getAllCategory();
        for (CategoryModel category: categoryList)
        {
            traductionModels.add(productsService.getLabelTraduction(category.getId(),languageModel.getId()));
        }

        model.addAttribute("categoryList",traductionModels);
*/
        return "integrated:welcom";

    }



    @RequestMapping(value ="/contact",method = RequestMethod.GET)
    public String contact (Model model, @ModelAttribute (value = "session")SessionModel session, Locale locale) {
        model.addAttribute("userEntity",new UserEntity());
        return "integrated:contact";
    }






}