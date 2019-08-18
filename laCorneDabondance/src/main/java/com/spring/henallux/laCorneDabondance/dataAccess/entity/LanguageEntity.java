package com.spring.henallux.laCorneDabondance.dataAccess.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name = "language")
public class LanguageEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @Column (name = "label")
    private String label;

    @OneToMany (mappedBy = "language",fetch = FetchType.LAZY)
    private Collection<TraductionEntity> traductionEntities;

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

    public Collection<TraductionEntity> getTraductionEntities() {
        return traductionEntities;
    }

    public void setTraductionEntities(Collection<TraductionEntity> traductionEntities) {
        this.traductionEntities = traductionEntities;
    }
}
