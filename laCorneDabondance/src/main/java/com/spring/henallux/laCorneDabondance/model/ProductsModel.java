package com.spring.henallux.laCorneDabondance.model;

import java.util.GregorianCalendar;

public class ProductsModel {

    private Integer id;

    private String name;

    private String scientName;

    private String family;

    private String variety;

    private Double catalogPrice;

    private String description;

    private Integer lifespan;

    private GregorianCalendar dateArrival;

    private GregorianCalendar seasonStart;

    private GregorianCalendar seasonEnd;

    private String photoLink;

    private Integer quantity;

    private CategoryModel categoryModel;

    public ProductsModel (){}

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientName() {
        return scientName;
    }

    public void setScientName(String scientName) {
        this.scientName = scientName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(Integer lifespan) {
        this.lifespan = lifespan;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public Double getCatalogPrice() {
        return catalogPrice;
    }

    public void setCatalogPrice(Double catalogPrice) {
        this.catalogPrice = catalogPrice;
    }

    public GregorianCalendar getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(GregorianCalendar dateArrival) {
        this.dateArrival = dateArrival;
    }

    public GregorianCalendar getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(GregorianCalendar seasonStart) {
        this.seasonStart = seasonStart;
    }

    public GregorianCalendar getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(GregorianCalendar seasonEnd) {
        this.seasonEnd = seasonEnd;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CategoryModel getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(CategoryModel categoryModel) {
        this.categoryModel = categoryModel;
    }
}
