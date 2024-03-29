package com.dev.ecommerce.model;
// Generated Jul 27, 2019 7:43:45 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users"
)
public class Users implements java.io.Serializable {


    private Integer id;
    private App app;
    private String name;
    private String email;
    private String fcmToken;
    private String address;
    private String city;
    private String zip;
    private String phoneNumber;
    private String photo;
    private Date creationDate;
    private Date lastLogin;
    private Set<Orders> orderses = new HashSet<Orders>(0);
    private Set<Authorities> authoritieses = new HashSet<Authorities>(0);
    private Set<UsersSecurityDetails> usersSecurityDetailses = new HashSet<UsersSecurityDetails>(0);

    public Users() {
    }


    public Users(App app) {
        this.app = app;
    }

    public Users(App app, String name, String email, String fcmToken, String address, String city, String zip, String phoneNumber, String photo, Date creationDate, Date lastLogin, Set<Orders> orderses, Set<Authorities> authoritieses, Set<UsersSecurityDetails> usersSecurityDetailses) {
        this.app = app;
        this.name = name;
        this.email = email;
        this.fcmToken = fcmToken;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
        this.creationDate = creationDate;
        this.lastLogin = lastLogin;
        this.orderses = orderses;
        this.authoritieses = authoritieses;
        this.usersSecurityDetailses = usersSecurityDetailses;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id", nullable = false)
    public App getApp() {
        return this.app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    @Column(name = "name", length = 80)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email", length = 150)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "fcm_token", length = 300)
    public String getFcmToken() {
        return this.fcmToken;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }

    @Column(name = "address", length = 300)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "city", length = 45)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "zip", length = 45)
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Column(name = "phone_number", length = 12)
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "photo", length = 300)
    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date", length = 10)
    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "last_login", length = 10)
    public Date getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
    public Set<Orders> getOrderses() {
        return this.orderses;
    }

    public void setOrderses(Set<Orders> orderses) {
        this.orderses = orderses;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
    public Set<Authorities> getAuthoritieses() {
        return this.authoritieses;
    }

    public void setAuthoritieses(Set<Authorities> authoritieses) {
        this.authoritieses = authoritieses;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
    public Set<UsersSecurityDetails> getUsersSecurityDetailses() {
        return this.usersSecurityDetailses;
    }

    public void setUsersSecurityDetailses(Set<UsersSecurityDetails> usersSecurityDetailses) {
        this.usersSecurityDetailses = usersSecurityDetailses;
    }


}


