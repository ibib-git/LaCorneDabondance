package com.spring.henallux.laCorneDabondance.dataAccess.util;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.LanguageEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.TraductionEntity;
import com.spring.henallux.laCorneDabondance.model.LanguageModel;
import com.spring.henallux.laCorneDabondance.model.TraductionModel;
import org.springframework.stereotype.Component;

@Component
public class TraductionConverter {

    public ProductsConverter productsConverter;

    public LanguageEntity languageModelToEntity (LanguageModel languageModel)
    {
        LanguageEntity languageEntity = new LanguageEntity();

        languageEntity.setId(languageModel.getId());
        languageEntity.setLabel(languageModel.getLabel());
        return languageEntity;
    }

    public LanguageModel languageEntityToModel (LanguageEntity languageEntity)
    {
        LanguageModel languageModel = new LanguageModel();

        languageModel.setId(languageEntity.getId());
        languageModel.setLabel(languageEntity.getLabel());

        return languageModel;
    }

    public TraductionEntity traductionModelToEntity (TraductionModel traductionModel)
    {
        TraductionEntity traductionEntity = new TraductionEntity();

        traductionEntity.setLabel(traductionModel.getLabel());
        traductionEntity.setCategoryEntity(productsConverter.categoryModelToEntity(traductionModel.getCategoryModel()));
        traductionEntity.setLanguageEntity(languageModelToEntity(traductionModel.getLanguageModel()));

        return traductionEntity;
    }

    public TraductionModel traductionEntityToModel (TraductionEntity traductionEntity)
    {
        TraductionModel traductionModel = new TraductionModel();

        traductionModel.setLabel(traductionEntity.getLabel());
        traductionModel.setCategoryModel(productsConverter.categoryEntityToModel(traductionEntity.getCategoryEntity()));
        traductionModel.setLanguageModel(languageEntityToModel(traductionEntity.getLanguageEntity()));

        return traductionModel;
    }
}
