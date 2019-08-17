package com.spring.henallux.laCorneDabondance.controller;

import com.spring.henallux.laCorneDabondance.configuration.ConstantConfiguration;
import com.spring.henallux.laCorneDabondance.model.MarketLineModel;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import com.spring.henallux.laCorneDabondance.model.SessionModel;
import com.spring.henallux.laCorneDabondance.service.OrderCommandService;
import com.spring.henallux.laCorneDabondance.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Calendar;

@Controller
@RequestMapping (value = "/products")
@SessionAttributes({ConstantConfiguration.SESSION,ConstantConfiguration.CURRENT_USER})
public class ProductsController {


    @Autowired
    private ProductsService productsService;
    private ProductsModel productDetail;
    private OrderCommandService orderCommandService;

    @RequestMapping(value = "/fruits",method = RequestMethod.GET)
    public String fruits (Model model,@ModelAttribute(value = "session") SessionModel session) {
        int id = 1;
        ArrayList<ProductsModel> fruitsListing = new ArrayList<>();
        fruitsListing = productsService.getAllProductsByCategory(1);

        model.addAttribute("productsListing",fruitsListing);
        model.addAttribute("title","Fruits");

        session.setCurrentPage("products/fruits");

        return "integrated:products";
    }

    @RequestMapping(value = "/legumes",method = RequestMethod.GET)
    public String legumes (Model model,@ModelAttribute (value = "session")SessionModel session)
    {
        int id = 2;
        ArrayList<ProductsModel> legumesListing = new ArrayList<>();
        legumesListing = productsService.getAllProductsByCategory(2);

        model.addAttribute("productsListing",legumesListing);

        model.addAttribute("productsListing",legumesListing);
        model.addAttribute("title","Légumes");

        session.setCurrentPage("products/legumes");
        return "integrated:products";
    }



    @RequestMapping (value = "/detail/{productId}",method = RequestMethod.GET)
    public String detailProduct (Model model, @PathVariable int productId,@ModelAttribute (value = "session")SessionModel session)
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

        session.setProductsModel(productDetail);


        model.addAttribute("title",productDetail.getName());
        return "integrated:productDetail";
    }

    @RequestMapping (value = "/return",method = RequestMethod.POST)
    public String returnButton (Model model,@ModelAttribute (value = "session")SessionModel session)
    {
        return  "redirect:/"+session.getCurrentPage();
    }

    @RequestMapping (value = "/addProduct",method = RequestMethod.POST)
    public String addChoiceMarket (Model model,@ModelAttribute (value = "session")SessionModel session)
    {
        MarketLineModel marketLine = new MarketLineModel();
        ArrayList<MarketLineModel> marketLines = new ArrayList<>();
        Integer idList = 0;



        if (session.getMarketModel().getMarketLineModel() != null)
        {
            marketLines =  session.getMarketModel().getMarketLineModel();


            for (MarketLineModel marketLineModel: marketLines)
            {
                idList = marketLineModel.getIdLine();
            }

            idList++;


        } else
        {
            session.getMarketModel().setIdOrder(1); // Faire le lien avec la BD pour avoir l'ID max de command
        }


        marketLine.setQuantity(session.getOrderQuantity());
        marketLine.setProductsModel(session.getProductsModel());
        marketLine.setIdLine(idList);
        marketLines.add(marketLine);

        session.getMarketModel().setMarketLineModel(marketLines);

        return  "redirect:/"+session.getCurrentPage();
    }

    @RequestMapping (value = "deleteProduct/{idLine}",method = RequestMethod.GET)
    public String deleteChoiceMarket (Model model,@PathVariable int idLine,@ModelAttribute (value = "session")SessionModel session)
    {
        ArrayList<MarketLineModel> marketLines =  session.getMarketModel().getMarketLineModel();

        marketLines.remove(idLine);

        session.getMarketModel().setMarketLineModel(marketLines);

        return  "redirect:/"+session.getCurrentPage();
    }

    @RequestMapping(value = "/calendar",method = RequestMethod.GET)
    public String calendar (Model model,@ModelAttribute (value = "session")SessionModel session){

        ArrayList<ProductsModel> productsList = new ArrayList<>();
        productsList = productsService.getAllProducts();

        model.addAttribute("productsList",productsList);
         model.addAttribute("title","Calendrier");
        return "integrated:calendar";
    }
}
