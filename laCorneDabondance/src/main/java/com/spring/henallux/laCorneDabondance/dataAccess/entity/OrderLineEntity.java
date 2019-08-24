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
    private Double price;

    @Column (name = "linenumber")
    private Integer lineNumber;

    @Column (name = "orderquantity")
    private Integer orderQuantity;

    @JoinColumn (name = "product",referencedColumnName = "id")
    @ManyToOne
    private ProductsEntity product;

    @JoinColumn (name = "command",referencedColumnName = "id")
    @ManyToOne
    private CommandEntity command;

    public OrderLineEntity () {}


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


    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
        this.product = product;
    }

    public CommandEntity getCommand() {
        return command;
    }

    public void setCommand(CommandEntity command) {
        this.command = command;
    }
}
