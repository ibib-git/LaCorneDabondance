package com.spring.henallux.laCorneDabondance.dataAccess.util;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.ProductsEntity;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class ProductsConverter {

    public ProductsEntity productsModelToProductsEntity (ProductsModel productsModel){
        ProductsEntity productsEntity = new ProductsEntity();
        Date dateArr,dateStart,dateEnd;

        productsEntity.setId(productsModel.getId());
        productsEntity.setName(productsModel.getName());
        productsEntity.setScientName(productsModel.getScientName());
        productsEntity.setFamily(productsModel.getFamily());
        productsEntity.setVariety(productsModel.getVariety());
        productsEntity.setCatalogPrice(productsModel.getCatalogPrice());
        productsEntity.setLifespan(productsModel.getLifespan());

        // Conversion Gregorian Calendar to Date
        dateArr = new Date (productsModel.getDateArrival().getTimeInMillis());
        productsEntity.setDateArrival(dateArr);

        dateStart = new Date (productsModel.getSeasonStart().getTimeInMillis());
        productsEntity.setSeasonStart(dateStart);

        dateEnd = new Date(productsModel.getSeasonEnd().getTimeInMillis() );
        productsEntity.setSeasonEnd(dateEnd);


        productsEntity.setDescription(productsModel.getDescription());
        productsEntity.setPhotoLink(productsModel.getPhotoLink());
        productsEntity.setCategoryProduct(productsModel.getCategoryProduct());
        return productsEntity;
    }

    public ProductsModel productsEntityToProductsModel (ProductsEntity productsEntity){
        ProductsModel productsModel = new ProductsModel();
        GregorianCalendar dateGreg = new GregorianCalendar();

        productsModel.setId(productsEntity.getId());
        productsModel.setName(productsEntity.getName());
        productsModel.setScientName(productsEntity.getScientName());
        productsModel.setFamily(productsEntity.getFamily());
        productsModel.setVariety(productsEntity.getVariety());
        productsModel.setCatalogPrice(productsEntity.getCatalogPrice());
        productsModel.setLifespan(productsEntity.getLifespan());

        //Conversion Date to Gregorian Calendar
        dateGreg.setTime(productsEntity.getDateArrival());
        productsModel.setDateArrival(dateGreg);

        dateGreg.setTime(productsEntity.getSeasonStart());
        productsModel.setSeasonStart(dateGreg);

        dateGreg.setTime(productsEntity.getSeasonEnd());
        productsModel.setSeasonEnd(dateGreg);

        productsModel.setDescription(productsEntity.getDescription());
        productsModel.setPhotoLink(productsEntity.getPhotoLink());
        productsModel.setCategoryProduct(productsEntity.getCategoryProduct());
        return productsModel;
    }

}
