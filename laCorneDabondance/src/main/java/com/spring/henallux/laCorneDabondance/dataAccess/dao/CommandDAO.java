package com.spring.henallux.laCorneDabondance.dataAccess.dao;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.CommandEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.ProductsEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.repository.CommandRepository;
import com.spring.henallux.laCorneDabondance.dataAccess.repository.ProductsRepository;
import com.spring.henallux.laCorneDabondance.dataAccess.util.CommandConverter;
import com.spring.henallux.laCorneDabondance.dataAccess.util.ProductsConverter;
import com.spring.henallux.laCorneDabondance.model.CommandModel;
import com.spring.henallux.laCorneDabondance.model.MarketLineModel;
import com.spring.henallux.laCorneDabondance.model.MarketModel;
import com.spring.henallux.laCorneDabondance.model.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CommandDAO {

    @Autowired
    private CommandRepository commandRepository;
    @Autowired
    private CommandConverter commandConverter;
    @Autowired
    private ProductsConverter productsConverter;
    @Autowired
    private ProductsRepository productsRepository;



    public void insertCommand (CommandModel commandModel)
    {
        CommandEntity commandEntity = new CommandEntity();

        commandEntity =commandConverter.commandModelToEntity(commandModel);
        commandRepository.save(commandEntity);

    }

    public void updateQuantity (MarketModel marketModel)
    {
        ProductsEntity productsEntity = new ProductsEntity();

        for (MarketLineModel marketLine: marketModel.getMarketLineModel())
        {
            productsEntity = productsConverter.productsModelToProductsEntity(marketLine.getProductsModel());
            productsEntity.setQuantity((marketLine.getProductsModel().getQuantity()) - (marketLine.getQuantity()));

            productsRepository.save(productsEntity);

        }


    }
}
