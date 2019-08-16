package com.spring.henallux.laCorneDabondance.service;


import com.spring.henallux.laCorneDabondance.dataAccess.dao.ProductsDAO;
import com.spring.henallux.laCorneDabondance.model.MarketLineModel;
import com.spring.henallux.laCorneDabondance.model.MarketModel;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderCommandService {

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

}
