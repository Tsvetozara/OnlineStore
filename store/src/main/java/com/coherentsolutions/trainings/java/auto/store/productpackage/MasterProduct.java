package com.coherentsolutions.trainings.java.auto.store.productpackage;

import java.util.List;

public class MasterProduct {
    private String name;
    private Double rate;
    private String description;

    private List<ProductVariation> variations;

    public MasterProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getRate() {
        return rate;
    }

    public void setVariations(List<ProductVariation> variations) {
        this.variations = variations;
    }

}
