package com.spring.henallux.laCorneDabondance.model;

public class OrderLineModel {

    private  Integer id;
    private Double price;
    private Integer lineNumber;
    private Integer orderQuantity;
    private ProductsModel productsModel;
    private CommandModel commandModel;

    public OrderLineModel () {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
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

    public CommandModel getCommandModel() {
        return commandModel;
    }

    public void setCommandModel(CommandModel commandModel) {
        this.commandModel = commandModel;
    }
}
