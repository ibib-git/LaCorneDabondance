package com.spring.henallux.laCorneDabondance.dataAccess.dao;

import com.spring.henallux.laCorneDabondance.dataAccess.repository.OrderLineRepository;
import com.spring.henallux.laCorneDabondance.model.MarketLineModel;
import com.spring.henallux.laCorneDabondance.model.MarketModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderLineDAO {

    @Autowired
    private OrderLineRepository orderLineRepository;

    public void insertLineOrder(MarketModel command,MarketLineModel orderLine)
    {


    }
}
