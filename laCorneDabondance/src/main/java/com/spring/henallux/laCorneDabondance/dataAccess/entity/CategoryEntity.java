package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @OneToMany (mappedBy = "category",fetch = FetchType.LAZY)
    private Collection<ProductsEntity> productsEntities;

    @OneToMany (mappedBy = "category",fetch = FetchType.LAZY)
    private Collection<TraductionEntity> traductionEntities;

    public CategoryEntity () {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<ProductsEntity> getProductsEntities() {
        return productsEntities;
    }

    public void setProductsEntities(Collection<ProductsEntity> productsEntities) {
        this.productsEntities = productsEntities;
    }

    public Collection<TraductionEntity> getTraductionEntities() {
        return traductionEntities;
    }

    public void setTraductionEntities(Collection<TraductionEntity> traductionEntities) {
        this.traductionEntities = traductionEntities;
    }
}
