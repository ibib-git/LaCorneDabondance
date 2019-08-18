package com.spring.henallux.laCorneDabondance.dataAccess.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table (name = "user")
public class UserEntity {

    @Id
    @Column (name = "login")
    private String login;

    @Column (name = "lastname")
    private String lastname;

    @Column (name = "firstname")
    private String firstname;

    @Column (name = "phone")
    private Integer phone;

    @Column (name = "mail")
    private String mail;

    @Column (name = "adressprivate")
    private String adressPrivate;

    @Column (name = "adressdelivery")
    private String adressDelivery;

    @Column (name = "password")
    private String password;

    @Column (name = "authorities")
    private String authorities;

    @Column (name = "non_expired")
    private Boolean non_expired;

    @Column (name = "non_locked")
    private Boolean non_Locked;

    @Column (name = "credentials_non_expired")
    private Boolean credentials_non_expired;

    @Column (name = "enabled")
    private Boolean enabled;

    @OneToMany (mappedBy = "user",fetch = FetchType.LAZY)
    private Collection<CommandEntity> commandEntities;

    public UserEntity() {}


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdressPrivate() {
        return adressPrivate;
    }

    public void setAdressPrivate(String adressPrivate) {
        this.adressPrivate = adressPrivate;
    }

    public String getAdressDelivery() {
        return adressDelivery;
    }

    public void setAdressDelivery(String adressDelivery) {
        this.adressDelivery = adressDelivery;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Boolean getNon_expired() {
        return non_expired;
    }

    public void setNon_expired(Boolean non_expired) {
        this.non_expired = non_expired;
    }

    public Boolean getNon_Locked() {
        return non_Locked;
    }

    public void setNon_Locked(Boolean non_Locked) {
        this.non_Locked = non_Locked;
    }

    public Boolean getCredentials_non_expired() {
        return credentials_non_expired;
    }

    public void setCredentials_non_expired(Boolean credentials_non_expired) {
        this.credentials_non_expired = credentials_non_expired;
    }

    public Collection<CommandEntity> getCommandEntities() {
        return commandEntities;
    }

    public void setCommandEntities(Collection<CommandEntity> commandEntities) {
        this.commandEntities = commandEntities;
    }
}
