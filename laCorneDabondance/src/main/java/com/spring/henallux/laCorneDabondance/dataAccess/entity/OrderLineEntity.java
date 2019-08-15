package com.spring.henallux.laCorneDabondance.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table (name = "orderline")
public class OrderLineEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @Column (name = "price")
    private Integer price;

    @Column (name = "linenumber")
    private Integer lineNumber;

    @Column (name = "orderquantity")
    private Integer orderQuantity;

    @Column (name = "product")
    private Integer productId;

    @Column (name = "command")
    private Integer commandId;

    public OrderLineEntity () {}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }
}
