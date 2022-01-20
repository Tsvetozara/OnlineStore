package com.coherentsolutions.trainings.java.auto.store.productpackage;

import java.util.LinkedList;
import java.util.List;

public class MasterProduct {
    private String name;
    private Double rate;
    private String description;

    private List<ProductVariation> variations;

    public MasterProduct(String name, Double rate, String description) {
        variations = new LinkedList<>();
        this.name = name;
        this.rate = rate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public List<ProductVariation> getVariations() {
        return variations;
    }

    public void setVariations(List<ProductVariation> variations) {
        this.variations = variations;
    }

    public void addVariation(ProductVariation variation) {
        variations.add(variation);
    }

   }
