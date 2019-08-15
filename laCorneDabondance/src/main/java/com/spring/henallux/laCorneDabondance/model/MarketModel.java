package com.spring.henallux.laCorneDabondance.model;

public class MarketModel {

    private Integer idOrder;
    private MarketLineModel marketLineModel;

    public MarketModel () {}


     public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public MarketLineModel getMarketLineModel() {
        return marketLineModel;
    }

    public void setMarketLineModel(MarketLineModel marketLineModel) {
        this.marketLineModel = marketLineModel;
    }
}
