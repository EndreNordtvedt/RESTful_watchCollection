package com.watch.watchcollection.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "watches")
public class watches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Primary key, automatic generated value
    @Column
    private String brand; // Brand of the watch
    @Column
    private String name; // Type of watch
    @Column
    private int price; // Price of the watch
    @Column
    private int year; // Year the watch was created

    public watches() {

    }

    public watches(String brand, String name, int price, int year) {
        super();
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "watches [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + ", year=" + year
                + "]";
    }

}
