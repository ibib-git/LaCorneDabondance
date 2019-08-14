package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import com.spring.henallux.laCorneDabondance.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    private ProductsModel productDetail;

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
    public String legumes (Model model)
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
    public String detailProduct (Model model, @PathVariable int productId)
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


    @RequestMapping(value = "/calendar",method = RequestMethod.GET)
    public String calendar (Model model){

        ArrayList<ProductsModel> productsList = new ArrayList<>();
        productsList = productsService.getAllProducts();

        model.addAttribute("productsList",productsList);
         model.addAttribute("title","Calendrier");
        return "integrated:calendar";
    }
}
