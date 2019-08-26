package com.spring.henallux.laCorneDabondance.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

public class UserModel {

    @NotEmpty
    private String user;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String firstName;
    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})", message="{validation.phone}")
    private Integer phone;
    @NotEmpty
    @Pattern(regexp="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", message="{validation.mail}")
    private String mail;
    private String adressPrivate;
    @NotEmpty
    private String adressDelivery;
    @NotEmpty
    @Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message="{validation.password}")
    private String password;
    private String authorities;
    private Boolean non_expired;
    private Boolean non_locked;
    private Boolean credentials_non_expired;
    private Boolean enabled;

    public UserModel () {}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Boolean getNon_locked() {
        return non_locked;
    }

    public void setNon_locked(Boolean non_locked) {
        this.non_locked = non_locked;
    }

    public Boolean getCredentials_non_expired() {
        return credentials_non_expired;
    }

    public void setCredentials_non_expired(Boolean credentials_non_expired) {
        this.credentials_non_expired = credentials_non_expired;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
