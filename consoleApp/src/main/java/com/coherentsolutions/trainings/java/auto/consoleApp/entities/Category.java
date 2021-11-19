package com.coherentsolutions.trainings.java.auto.consoleApp.entities;

public class Category {
    private String name;

    Category[] categories;

    Product[] products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, Category[] categories, Product[] products) {
        this.name = name;
        this.products = products;
        this.categories = categories;
    }


}
