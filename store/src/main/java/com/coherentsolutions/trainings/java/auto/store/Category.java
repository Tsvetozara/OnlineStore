package com.coherentsolutions.trainings.java.auto.store;

import com.coherentsolutions.trainings.java.auto.store.productpackage.MasterProduct;

import java.util.List;

public class Category {
    private String name;

    public List<Category> categories;

    public List<MasterProduct> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Category(String name) {
        this.name = name;
    }

    public void setProducts(List<MasterProduct> products) {
        this.products = products;
    }

    public List<MasterProduct> getProducts() {
        return products;
    }
}

