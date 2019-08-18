package com.spring.henallux.laCorneDabondance.dataAccess.util;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.CommandEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.OrderLineEntity;
import com.spring.henallux.laCorneDabondance.model.CommandModel;
import com.spring.henallux.laCorneDabondance.model.OrderLineModel;
import org.springframework.stereotype.Component;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class CommandConverter {

    public ProductsConverter productsConverter;
    public UserConverter userConverter;

    public CommandEntity commandModelToEntity (CommandModel commandModel)
    {
        CommandEntity commandEntity = new CommandEntity();
        Date dateCom;

        commandEntity.setId(commandModel.getId());

        // Conversion Gregorian Calendar to Date
        dateCom = new Date (commandModel.getDate().getTimeInMillis());
        commandEntity.setDateCommand(dateCom);

        commandEntity.setUser(userConverter.userModelToEntity(commandModel.getUserModel()));

        return commandEntity;
    }

    public CommandModel commandEntityToModel (CommandEntity commandEntity)
    {
        CommandModel commandModel = new CommandModel();
        GregorianCalendar dateGreg = new GregorianCalendar();

        commandModel.setId(commandEntity.getId());

        //Conversion Date to Gregorian Calendar
        dateGreg.setTime(commandEntity.getDateCommand());
        dateGreg.set(Calendar.MONTH,dateGreg.get(Calendar.MONTH)+1);
        commandModel.setDate(dateGreg);

        commandModel.setUserModel(userConverter.userEntityToModel(commandEntity.getUser()));

        return commandModel;
    }

    public OrderLineEntity orderLineModeToEntity (OrderLineModel orderLineModel)
    {
        OrderLineEntity orderLineEntity = new OrderLineEntity();

        orderLineEntity.setId(orderLineModel.getId());
        orderLineEntity.setLineNumber(orderLineModel.getLineNumber());
        orderLineEntity.setOrderQuantity(orderLineModel.getOrderQuantity());
        orderLineEntity.setPrice(orderLineModel.getPrice());
        orderLineEntity.setProduct(productsConverter.productsModelToProductsEntity(orderLineModel.getProductsModel()));
        orderLineEntity.setCommand(commandModelToEntity(orderLineModel.getCommandModel()));

        return orderLineEntity;
    }

    public OrderLineModel orderLineEntityToModel (OrderLineEntity orderLineEntity)
    {
        OrderLineModel orderLineModel = new OrderLineModel();

        orderLineModel.setId(orderLineEntity.getId());
        orderLineModel.setLineNumber(orderLineEntity.getLineNumber());
        orderLineModel.setOrderQuantity(orderLineEntity.getOrderQuantity());
        orderLineModel.setPrice(orderLineEntity.getPrice());
        orderLineModel.setProductsModel(productsConverter.productsEntityToProductsModel(orderLineEntity.getProduct()));
        orderLineModel.setCommandModel(commandEntityToModel(orderLineEntity.getCommand()));

        return orderLineModel;
    }
}
