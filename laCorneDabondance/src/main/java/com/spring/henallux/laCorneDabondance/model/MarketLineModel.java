package com.spring.henallux.laCorneDabondance.model;

public class MarketLineModel {

    private Integer idLine;
    private ProductsModel productsModel;
    private Integer quantity;

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

    public Integer getIdLine() {
        return idLine;
    }

    public void setIdLine(Integer idLine) {
        this.idLine = idLine;
    }
}
