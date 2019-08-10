package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table (name = "product")
public class ProductsEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "scientName")
    private String scientName;

    @Column (name = "family")
    private String family;

    @Column (name = "variety")
    private String variety;

    @Column (name = "catalogPrice")
    private Integer catalogPrice;

    @Column (name = "description")
    private String description;

    @Column (name = "lifespan")
    private Integer lifespan;

    @Column (name = "dateArrival")
    private GregorianCalendar dateArrival;

    @Column (name = "seasonStart")
    private GregorianCalendar seasonStart;

    @Column (name = "seasonEnd")
    private  GregorianCalendar seasonEnd;

    @Column (name = "photoLink")
    private String photoLink;

    @Column (name = "category")
    private Integer categoryProduct;

    public ProductsEntity (){}

    public Integer getId() {
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

    public Integer getCatalogPrice() {
        return catalogPrice;
    }

    public void setCatalogPrice(Integer catalogPrice) {
        this.catalogPrice = catalogPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLifespan() {
        return lifespan;
    }

    public void setLifespan(Integer lifespan) {
        this.lifespan = lifespan;
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

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public Integer getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(Integer categoryProduct) {
        this.categoryProduct = categoryProduct;
    }
}
