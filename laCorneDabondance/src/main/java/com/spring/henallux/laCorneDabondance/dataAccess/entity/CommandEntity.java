package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table (name = "command")
public class CommandEntity {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Integer id;

    @Column (name = "datecommand")
    @Temporal(TemporalType.DATE)
    private Date dateCommand;

    @JoinColumn (name = "user",referencedColumnName = "username")
    @ManyToOne
    private UserEntity user;

    @OneToMany (mappedBy = "command",fetch = FetchType.LAZY)
    private Collection<OrderLineEntity> orderLineEntities;

    public CommandEntity () {}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCommand() {
        return dateCommand;
    }

    public void setDateCommand(Date dateCommand) {
        this.dateCommand = dateCommand;
    }


    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Collection<OrderLineEntity> getOrderLineEntities() {
        return orderLineEntities;
    }

    public void setOrderLineEntities(Collection<OrderLineEntity> orderLineEntities) {
        this.orderLineEntities = orderLineEntities;
    }
}
