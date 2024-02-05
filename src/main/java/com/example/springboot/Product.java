package com.example.springboot;

public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private String imageUrl;

    public Product(int id, String name, int price, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public int getPrice() {

        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

