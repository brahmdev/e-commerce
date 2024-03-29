package com.dev.ecommerce.model;
// Generated Jul 27, 2019 7:43:45 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Bags generated by hbm2java
 */
@Entity
@Table(name = "bags"
)
public class Bags implements java.io.Serializable {


    private Integer id;
    private App app;
    private String name;
    private Integer price;
    private String material;
    private String category;
    private String color;
    private String description;
    private String imageUrl;
    private String type;
    private Integer length;
    private Integer width;
    private Integer height;

    public Bags() {
    }


    public Bags(App app) {
        this.app = app;
    }

    public Bags(App app, String name, Integer price, String material, String category, String color, String description, String imageUrl, String type, Integer length, Integer width, Integer height) {
        this.app = app;
        this.name = name;
        this.price = price;
        this.material = material;
        this.category = category;
        this.color = color;
        this.description = description;
        this.imageUrl = imageUrl;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
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

    @Column(name = "name", length = 60)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price")
    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Column(name = "material", length = 45)
    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Column(name = "category", length = 20)
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "color", length = 20)
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "image_url", length = 800)
    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Column(name = "type", length = 20)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "length")
    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Column(name = "width")
    public Integer getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Column(name = "height")
    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


}


