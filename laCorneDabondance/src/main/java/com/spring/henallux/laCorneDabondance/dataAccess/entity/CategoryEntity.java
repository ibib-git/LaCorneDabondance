package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table (name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;


    public CategoryEntity () {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
