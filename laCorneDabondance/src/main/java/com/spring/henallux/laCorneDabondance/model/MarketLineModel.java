package com.spring.henallux.laCorneDabondance.model;

public class MarketLineModel {

    private ProductsModel productsModel;
    private Integer quantity;
    private Integer linePrice;  // Sauvegarder le prix du produit à l'instant du click

    public MarketLineModel () {}


    public ProductsModel getProductsModel() {
        return productsModel;
    }

    public void setProductsModel(ProductsModel productsModel) {
        this.productsModel = productsModel;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(Integer linePrice) {
        this.linePrice = linePrice;
    }
}
