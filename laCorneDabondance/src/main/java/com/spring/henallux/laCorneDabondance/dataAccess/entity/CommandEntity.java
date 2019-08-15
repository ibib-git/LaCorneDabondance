package com.spring.henallux.laCorneDabondance.dataAccess.entity;


import javax.persistence.*;
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

    @Column (name = "user")
    private String user;


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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
