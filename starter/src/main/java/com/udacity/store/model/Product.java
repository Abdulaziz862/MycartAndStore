package com.udacity.store.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
// TODO: Add the details of the product class



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount;
    private String name;
    private double price;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Lob
    private byte[] image;



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }




    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] imageUrl) {
        this.image = image;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
