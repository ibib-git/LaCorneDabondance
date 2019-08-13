package com.spring.henallux.laCorneDabondance.service;


import com.spring.henallux.laCorneDabondance.dataAccess.dao.ProductsDAO;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductsService {

    @Autowired
    ProductsDAO productsDAO;

    public ProductsModel getProduct(Integer id) {return productsDAO.findProductByID(id);}
    public ArrayList<ProductsModel> getAllProducts () {return productsDAO.getAllProducts();}
    public ArrayList<ProductsModel> getSeasonProducts () {return productsDAO.getSeasonProducts();}



}
