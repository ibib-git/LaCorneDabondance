package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table (name = "traduction")
public class TraductionEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private String label;

    @JoinColumn(name="id", referencedColumnName="category")
    @ManyToOne
    private CategoryEntity categoryEntity;

    @JoinColumn (name ="id", referencedColumnName = "language")
    @ManyToOne
    private LanguageEntity languageEntity;

    public TraductionEntity () {}


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public LanguageEntity getLanguageEntity() {
        return languageEntity;
    }

    public void setLanguageEntity(LanguageEntity languageEntity) {
        this.languageEntity = languageEntity;
    }
}
