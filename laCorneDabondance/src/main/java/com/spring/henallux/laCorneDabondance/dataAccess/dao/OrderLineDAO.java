package com.spring.henallux.laCorneDabondance.dataAccess.dao;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.OrderLineEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.repository.OrderLineRepository;
import com.spring.henallux.laCorneDabondance.dataAccess.util.CommandConverter;
import com.spring.henallux.laCorneDabondance.model.OrderLineModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderLineDAO {

    @Autowired
    private OrderLineRepository orderLineRepository;
    @Autowired
    private CommandConverter commandConverter;

    public void insertLineOrder(OrderLineModel orderLineModel)
    {
        OrderLineEntity orderLineEntity = new OrderLineEntity();

        orderLineEntity = commandConverter.orderLineModeToEntity(orderLineModel);
        orderLineRepository.save(orderLineEntity);

    }
}
