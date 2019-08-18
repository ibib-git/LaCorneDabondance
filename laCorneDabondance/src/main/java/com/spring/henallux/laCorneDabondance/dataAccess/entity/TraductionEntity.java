package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table (name = "traduction")
public class TraductionEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private String label;

    @JoinColumn(name="category", referencedColumnName="id")
    @ManyToOne
    private CategoryEntity category;

    @JoinColumn (name ="language", referencedColumnName = "id")
    @ManyToOne
    private LanguageEntity language;

    public TraductionEntity () {}


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public LanguageEntity getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEntity language) {
        this.language = language;
    }
}
