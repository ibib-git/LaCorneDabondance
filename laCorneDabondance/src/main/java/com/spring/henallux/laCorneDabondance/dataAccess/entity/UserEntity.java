package com.spring.henallux.laCorneDabondance.dataAccess.entity;

import com.spring.henallux.laCorneDabondance.dataAccess.util.Role;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name="PERSISTABLE_USER")
@Table (name = "user")
public class UserEntity implements UserDetails {

    @Id
    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "AUTHORITIES")
    private String authorities = "";

    @Column(name = "NON_EXPIRED")
    private Boolean accountNonExpired = true;

    @Column(name = "NON_LOCKED")
    private Boolean accountNonLocked = true;

    @Column(name = "CREDENTIALS_NON_EXPIRED")
    private Boolean credentialsNonExpired = true;

    @Column(name = "ENABLED")
    private Boolean enabled = true;

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

    @OneToMany (mappedBy = "user",fetch = FetchType.LAZY)
    private Collection<CommandEntity> commandEntities;

    public UserEntity() {}


    @Override
    public ArrayList<Role> getAuthorities() {
        String[] authoritiesArray = this.authorities.split(",");
        ArrayList<Role> authoritiesCollection = new ArrayList<Role>();

        for(String role : authoritiesArray){
            authoritiesCollection.add(new Role(role));
        }
        return authoritiesCollection;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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


    public Collection<CommandEntity> getCommandEntities() {
        return commandEntities;
    }

    public void setCommandEntities(Collection<CommandEntity> commandEntities) {
        this.commandEntities = commandEntities;
    }
}
