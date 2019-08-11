package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;
import java.util.Date;
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

    @Column (name = "scientname")
    private String scientName;

    @Column (name = "family")
    private String family;

    @Column (name = "variety")
    private String variety;

    @Column (name = "catalogprice")
    private Float catalogPrice;

    @Column (name = "description")
    private String description;

    @Column (name = "lifespan")
    private Integer lifespan;

    @Column (name = "datearrival")
    @Temporal(TemporalType.DATE)
    private Date dateArrival;

    @Column (name = "seasonstart")
    @Temporal(TemporalType.DATE)
    private Date seasonStart;

    @Column (name = "seasonend")
    @Temporal(TemporalType.DATE)
    private  Date seasonEnd;

    @Column (name = "photolink")
    private String photoLink;

    @Column (name = "category")
    private Integer categoryProduct;

    public ProductsEntity (){}


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

    public int getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(Integer categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public Float getCatalogPrice() {
        return catalogPrice;
    }

    public void setCatalogPrice(Float catalogPrice) {
        this.catalogPrice = catalogPrice;
    }


    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public void setSeasonStart(Date seasonStart) {
        this.seasonStart = seasonStart;
    }

    public void setSeasonEnd(Date seasonEnd) {
        this.seasonEnd = seasonEnd;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public Date getSeasonStart() {
        return seasonStart;
    }

    public Date getSeasonEnd() {
        return seasonEnd;
    }
}
