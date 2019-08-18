package com.spring.henallux.laCorneDabondance.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table (name = "language")
public class LanguageEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @Column (name = "label")
    private String label;

    public LanguageEntity () {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
