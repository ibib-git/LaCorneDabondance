package com.spring.henallux.laCorneDabondance.dataAccess.util;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.ProductsEntity;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.stereotype.Component;

@Component
public class ProductsConverter {

    public ProductsEntity productsModelToProductsEntity (ProductsModel productsModel){
        ProductsEntity productsEntity = new ProductsEntity();
        productsEntity.setId(productsModel.getId());
        productsEntity.setName(productsModel.getName());
        productsEntity.setScientName(productsModel.getScientName());
        productsEntity.setFamily(productsModel.getFamily());
        productsEntity.setVariety(productsModel.getVariety());
        productsEntity.setCatalogPrice(productsModel.getCatalogPrice());
        productsEntity.setLifespan(productsModel.getLifespan());
        productsEntity.setDateArrival(productsModel.getDateArrival());
        productsEntity.setDescription(productsModel.getDescription());
        productsEntity.setPhotoLink(productsModel.getPhotoLink());
        productsEntity.setSeasonStart(productsModel.getSeasonStart());
        productsEntity.setSeasonEnd(productsModel.getSeasonEnd());
        productsEntity.setCategoryProduct(productsModel.getCategoryProduct());
        return productsEntity;
    }

    public ProductsModel productsEntityToProductsModel (ProductsEntity productsEntity){
        ProductsModel productsModel = new ProductsModel();
        productsModel.setId(productsEntity.getId());
        productsModel.setName(productsEntity.getName());
        productsModel.setScientName(productsEntity.getScientName());
        productsModel.setFamily(productsEntity.getFamily());
        productsModel.setVariety(productsEntity.getVariety());
        productsModel.setCatalogPrice(productsEntity.getCatalogPrice());
        productsModel.setLifespan(productsEntity.getLifespan());
        productsModel.setDateArrival(productsEntity.getDateArrival());
        productsModel.setDescription(productsEntity.getDescription());
        productsModel.setPhotoLink(productsEntity.getPhotoLink());
        productsModel.setSeasonStart(productsEntity.getSeasonStart());
        productsModel.setSeasonEnd(productsEntity.getSeasonEnd());
        productsModel.setCategoryProduct(productsEntity.getCategoryProduct());
        return productsModel;
    }

}
