package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import com.spring.henallux.laCorneDabondance.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Controller
@RequestMapping (value = "/products")
@SessionAttributes({ConstantConfiguration.SESSION,ConstantConfiguration.CURRENT_USER})
public class ProductsController {

    @Autowired
    private ProductsService productsService;
    private ProductsModel productDetail;

    @RequestMapping(value = "/fruits",method = RequestMethod.GET)
    public String fruits (Model model,@ModelAttribute(value = "session") SessionModel sessionModel) {
        int id = 1;
        ArrayList<ProductsModel> fruitsListing = new ArrayList<>();
        fruitsListing = productsService.getAllProductsByCategory(1);

        model.addAttribute("productsListing",fruitsListing);
        model.addAttribute("title","Fruits");
        return "integrated:products";
    }

    @RequestMapping(value = "/legumes",method = RequestMethod.GET)
    public String legumes (Model model,@ModelAttribute (value = "session")SessionModel sessionModel)
    {
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



    @RequestMapping (value = "/detail/{productId}",method = RequestMethod.GET)
    public String detailProduct (Model model, @PathVariable int productId,@ModelAttribute (value = "session")SessionModel sessionModel)
    {
        productDetail =productsService.getProduct(productId);

        model.addAttribute("detailName",productDetail.getName());
        model.addAttribute("detailScient",productDetail.getScientName());
        model.addAttribute("detailDesc",productDetail.getDescription());
        model.addAttribute("detailImage",productDetail.getPhotoLink());
        model.addAttribute("detailVariety",productDetail.getVariety());
        model.addAttribute("detailFamily",productDetail.getFamily());
        model.addAttribute("detailPrice",productDetail.getCatalogPrice());
        model.addAttribute("detailLife",productDetail.getLifespan());
        model.addAttribute("detailCat",productDetail.getCategoryProduct());
        model.addAttribute("detailSeasonStart",productDetail.getSeasonStart().get(Calendar.DAY_OF_MONTH)+"/"+productDetail.getSeasonStart().get(Calendar.MONTH)+"/"+productDetail.getSeasonStart().get(Calendar.YEAR));
        model.addAttribute("detailSeasonEnd",productDetail.getSeasonEnd().get(Calendar.DAY_OF_MONTH)+"/"+productDetail.getSeasonEnd().get(Calendar.MONTH)+"/"+productDetail.getSeasonEnd().get(Calendar.YEAR));
        model.addAttribute("detailArriv",productDetail.getDateArrival());
        model.addAttribute("detailQuant",productDetail.getQuantity());

        model.addAttribute("title",productDetail.getName());
        return "integrated:productDetail";
    }

    @RequestMapping (method = RequestMethod.POST)
    public String addChoice (Model model,@ModelAttribute (value = "session")SessionModel sessionModel)
    {


        return "redirect:/"+ sessionModel.getCurrentPage();
    }


    @RequestMapping(value = "/calendar",method = RequestMethod.GET)
    public String calendar (Model model,@ModelAttribute (value = "session")SessionModel sessionModel){

        ArrayList<ProductsModel> productsList = new ArrayList<>();
        productsList = productsService.getAllProducts();

        model.addAttribute("productsList",productsList);
         model.addAttribute("title","Calendrier");
        return "integrated:calendar";
    }
}
