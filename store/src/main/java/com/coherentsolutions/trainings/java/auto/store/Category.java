package com.coherentsolutions.trainings.java.auto.store;

import com.coherentsolutions.trainings.java.auto.store.productpackage.MasterProduct;

import java.util.List;

public class Category {
    private String name;

    public List<MasterProduct> products;

    public Category(String name) {
        this.name = name;
    }

    public void setProducts(List<MasterProduct> products) {
        this.products = products;
    }
}
