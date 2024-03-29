package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

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
    private Double catalogPrice;

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

    @Column (name = "quantity")
    private Integer quantity;

    @JoinColumn(name="category", referencedColumnName="id")
    @ManyToOne
    private CategoryEntity category;

    @OneToMany (mappedBy = "product",fetch = FetchType.LAZY)
    private Collection<OrderLineEntity> orderLineEntities;

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

    public Double getCatalogPrice() {
        return catalogPrice;
    }

    public void setCatalogPrice(Double catalogPrice) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public Collection<OrderLineEntity> getOrderLineEntities() {
        return orderLineEntities;
    }

    public void setOrderLineEntities(Collection<OrderLineEntity> orderLineEntities) {
        this.orderLineEntities = orderLineEntities;
    }
}
