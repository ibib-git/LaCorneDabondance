package com.spring.henallux.laCorneDabondance.dataAccess.util;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.CategoryEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.ProductsEntity;
import com.spring.henallux.laCorneDabondance.model.CategoryModel;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.stereotype.Component;
import java.util.Calendar;
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
        productsEntity.setQuantity(productsModel.getQuantity());
        productsEntity.setCategory(categoryModelToEntity(productsModel.getCategoryModel()));
        return productsEntity;
    }

    public ProductsModel productsEntityToProductsModel (ProductsEntity productsEntity){
        ProductsModel productsModel = new ProductsModel();
        GregorianCalendar dateGregArr  = new GregorianCalendar();
        GregorianCalendar dateGregStart = new GregorianCalendar();
        GregorianCalendar dateGregEnd = new GregorianCalendar();

        productsModel.setId(productsEntity.getId());
        productsModel.setName(productsEntity.getName());
        productsModel.setScientName(productsEntity.getScientName());
        productsModel.setFamily(productsEntity.getFamily());
        productsModel.setVariety(productsEntity.getVariety());
        productsModel.setCatalogPrice(productsEntity.getCatalogPrice());
        productsModel.setLifespan(productsEntity.getLifespan());

        //Conversion Date to Gregorian Calendar
        dateGregArr.setTime(productsEntity.getDateArrival());
        dateGregArr.set(Calendar.MONTH,dateGregArr.get(Calendar.MONTH)+1);
        productsModel.setDateArrival(dateGregArr);

        dateGregStart.setTime(productsEntity.getSeasonStart());
        dateGregStart.set(Calendar.MONTH,dateGregStart.get(Calendar.MONTH)+1);
        productsModel.setSeasonStart(dateGregStart);

        dateGregEnd.setTime(productsEntity.getSeasonEnd());
        dateGregEnd.set(Calendar.MONTH,dateGregEnd.get(Calendar.MONTH)+1);
        productsModel.setSeasonEnd(dateGregEnd);

        productsModel.setDescription(productsEntity.getDescription());
        productsModel.setPhotoLink(productsEntity.getPhotoLink());
        productsModel.setQuantity(productsEntity.getQuantity());
        productsModel.setCategoryModel(categoryEntityToModel(productsEntity.getCategory()));
        return productsModel;
    }

    public CategoryEntity categoryModelToEntity (CategoryModel categoryModel)
    {
        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId(categoryModel.getId());

        return categoryEntity;
    }

    public CategoryModel categoryEntityToModel (CategoryEntity categoryEntity)
    {
        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setId(categoryEntity.getId());

        return categoryModel;
    }



}
