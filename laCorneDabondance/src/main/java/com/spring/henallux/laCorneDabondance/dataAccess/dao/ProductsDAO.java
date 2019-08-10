package com.spring.henallux.laCorneDabondance.dataAccess.dao;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.ProductsEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.repository.ProductsRepository;
import com.spring.henallux.laCorneDabondance.dataAccess.util.ProductsConverter;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductsDAO {

    private ProductsRepository productsRepository;
    private ProductsConverter productsConverter;

    @Autowired
    public ProductsDAO (ProductsRepository productsRepository,ProductsConverter productsConverter){
        this.productsRepository = productsRepository;
        this.productsConverter = productsConverter;
    }

    public ProductsModel save (ProductsModel productsModel){
        ProductsEntity productsEntity = productsConverter.productsModelToProductsEntity(productsModel);
        productsEntity = productsRepository.save(productsEntity);
        return productsConverter.productsEntityToProductsModel(productsEntity);
    }

    public ArrayList<ProductsModel> getAllProducts(){
        List <ProductsEntity> productsEntities = productsRepository.findAll();
        ArrayList<ProductsModel> productsModels = new ArrayList<>();
        for (ProductsEntity entity : productsEntities)
        {
            ProductsModel productsModel = productsConverter.productsEntityToProductsModel(entity);
            productsModels.add(productsModel);
        }
        return productsModels;
    }

    public ProductsModel findProductByID (Integer id){

        ProductsEntity entity = productsRepository.findById(id);
        ProductsModel productsModel = productsConverter.productsEntityToProductsModel(entity);
        return productsModel;

    }
}
