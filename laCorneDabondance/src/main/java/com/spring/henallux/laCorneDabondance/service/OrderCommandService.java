package com.spring.henallux.laCorneDabondance.service;


import com.spring.henallux.laCorneDabondance.dataAccess.dao.ProductsDAO;
import com.spring.henallux.laCorneDabondance.model.MarketModel;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCommandService {

    @Autowired
    private ProductsDAO productsDAO;

    @Autowired
    private ProductsService productsService;

    public void addOrderLineCommand (MarketModel market, ProductsModel product,Integer quantity,)
    {


    }

}
