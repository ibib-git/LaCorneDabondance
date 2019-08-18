package com.spring.henallux.laCorneDabondance.service;


import com.spring.henallux.laCorneDabondance.dataAccess.dao.ProductsDAO;
import com.spring.henallux.laCorneDabondance.model.MarketLineModel;
import com.spring.henallux.laCorneDabondance.model.MarketModel;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class CommandService {

    @Autowired
    private ProductsDAO productsDAO;

    @Autowired
    private ProductsService productsService;

    public MarketModel addOrderLineCommand (MarketModel market, ProductsModel product,Integer quantity,Integer price)
    {

        ArrayList<MarketLineModel> marketLineModels = new ArrayList<>();

        MarketLineModel marketLineModel = new MarketLineModel();
        marketLineModel.setQuantity(quantity);
        marketLineModel.setProductsModel(product);

        marketLineModels = market.getMarketLineModel();
        marketLineModels.add(marketLineModel);

        market.setMarketLineModel(marketLineModels);
        market.setIdOrder(1);  // A modifier

        return market;
    }

    public Double calculPriceLineWithReduc (Integer quantity,ProductsModel product) {

        // Tester si il y a une réduction à calculer sur une ligne (= sur un produit)

        GregorianCalendar peremDate = new GregorianCalendar();
        GregorianCalendar toDay = new GregorianCalendar();
        toDay.setTimeInMillis(System.currentTimeMillis());
        toDay.set(Calendar.MONTH,toDay.get(Calendar.MONTH)+1); // Compenser le 0 à 11 du type

        // Devoir remplacer la date du if par les start date et end date de promotion

        peremDate = product.getDateArrival();
        Integer dayPerem = peremDate.get(Calendar.DAY_OF_YEAR) + product.getLifespan();
        peremDate.set(Calendar.DAY_OF_YEAR,dayPerem);  // Calculer la date de vie du produit en stock

        Double percentreduc = 0.0; // a remplacer par le percentage de la bd
        Double priceFinal = product.getCatalogPrice() ;
/*

        if (((peremDate.get(Calendar.DAY_OF_YEAR) - 3) <= toDay.get(Calendar.DAY_OF_YEAR)) && (toDay.get(Calendar.DAY_OF_YEAR) < peremDate.get(Calendar.DAY_OF_YEAR)))
        {
            // calcul à partir de promotion
            priceFinal = priceFinal * (percentreduc/100);
        }
*/

        return priceFinal ;

    }


}
