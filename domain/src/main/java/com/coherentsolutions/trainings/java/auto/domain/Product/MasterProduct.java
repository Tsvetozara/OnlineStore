package com.coherentsolutions.trainings.java.auto.domain.Product;

public class MasterProduct {
    private String name;
    private Double rate;
    private String description;


    public MasterProduct(String name, Double rate, String description) {
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
}
