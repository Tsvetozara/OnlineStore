package com.coherentsolutions.trainings.java.auto.store.productpackage;

public class ProductVariation {
    private int quantity;
    private int memory;
    private String processor;
    private double weight;
    private String color;
    private double displaySize;
    private double displayResolution;
    private double price;
    private String batteryType;

    public ProductVariation(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
