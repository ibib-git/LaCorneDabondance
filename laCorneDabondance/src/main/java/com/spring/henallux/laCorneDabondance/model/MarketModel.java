package com.spring.henallux.laCorneDabondance.model;

import java.util.ArrayList;

public class MarketModel {

    private Integer idOrder;
    private ArrayList <MarketLineModel> marketLineModel;

    public MarketModel () {}


     public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }


    public ArrayList<MarketLineModel> getMarketLineModel() {
        return marketLineModel;
    }

    public void setMarketLineModel(ArrayList<MarketLineModel> marketLineModel) {
        this.marketLineModel = marketLineModel;
    }

}
