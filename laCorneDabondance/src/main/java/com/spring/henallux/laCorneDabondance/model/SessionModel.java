package com.spring.henallux.laCorneDabondance.model;

import org.springframework.stereotype.Component;

@Component
public class SessionModel {

    private String currentPage = "home";
    private MarketModel marketModel = new MarketModel();
    private Integer orderQuantity;   // A voir si on peut intégrer dans le path jusqu'à la quantity deline
    private ProductsModel productsModel;

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

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public ProductsModel getProductsModel() {
        return productsModel;
    }

    public void setProductsModel(ProductsModel productsModel) {
        this.productsModel = productsModel;
    }
}
