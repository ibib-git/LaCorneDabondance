package com.spring.henallux.laCorneDabondance.service;


import com.spring.henallux.laCorneDabondance.dataAccess.dao.CommandDAO;
import com.spring.henallux.laCorneDabondance.dataAccess.dao.OrderLineDAO;
import com.spring.henallux.laCorneDabondance.dataAccess.dao.UserDAO;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.util.UserConverter;
import com.spring.henallux.laCorneDabondance.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class CommandService {

    @Autowired
    private CommandDAO commandDAO;

    @Autowired
    private OrderLineDAO orderLineDAO;

    @Autowired
    private ProductsService productsService;

    @Autowired
    private UserDAO userDAO; // A changer

    @Autowired
    private UserConverter userConverter;


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
 idée pour la fonction si temps
        if (((peremDate.get(Calendar.DAY_OF_YEAR) - 3) <= toDay.get(Calendar.DAY_OF_YEAR)) && (toDay.get(Calendar.DAY_OF_YEAR) < peremDate.get(Calendar.DAY_OF_YEAR)))
        {
            // calcul à partir de promotion
            priceFinal = priceFinal * (percentreduc/100);
        }
*/

        return priceFinal ;

    }

    public void saveMarket (MarketModel market, UserEntity userEntity)
    {
        CommandModel commandModel = new CommandModel();
        OrderLineModel orderLineModel = new OrderLineModel();
        GregorianCalendar toDay = new GregorianCalendar();
        toDay.setTimeInMillis(System.currentTimeMillis());
        toDay.set(Calendar.MONTH,toDay.get(Calendar.MONTH)+1); // Compenser le 0 à 11 du type

        commandModel.setId(market.getIdOrder());
        commandModel.setDate(toDay);
        UserModel userModel = userConverter.userEntityToModel(userEntity);
        commandModel.setUserModel(userModel);

        commandDAO.insertCommand(commandModel);

        for (MarketLineModel marketLine: market.getMarketLineModel())
        {
            //orderLineModel.setId(marketLine.getIdLine()); // A changer pour démarrer depuis la bd
            orderLineModel.setOrderQuantity(marketLine.getQuantity());
            orderLineModel.setPrice(marketLine.getFinalPrice());
            orderLineModel.setLineNumber(marketLine.getIdLine());
            orderLineModel.setProductsModel(marketLine.getProductsModel());
            orderLineModel.setCommandModel(commandModel);

            orderLineDAO.insertLineOrder(orderLineModel);
        }


    }

    public void updateQuantity (MarketModel marketModel)
    {
        commandDAO.updateQuantity(marketModel);
    }
}
