package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table (name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @Column (name = "libelle")
    private String libelle;

    public CategoryEntity () {}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
