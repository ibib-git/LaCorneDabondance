package com.spring.henallux.laCorneDabondance.model;

import org.springframework.stereotype.Component;

@Component
public class SessionModel {

    private String currentPage = "home";
    private MarketModel marketModel = new MarketModel();

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }


    public MarketModel getMarketModel() {
        return marketModel;
    }

    public void setMarketModel(MarketModel marketModel) {
        this.marketModel = marketModel;
    }
}
