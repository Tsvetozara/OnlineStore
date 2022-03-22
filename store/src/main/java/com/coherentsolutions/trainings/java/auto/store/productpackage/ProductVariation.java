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

    public ProductVariation(int quantity, int memory, String processor, double weight, String color,
                            double displaySize, double displayResolution, double price,
                            String batteryType, String name, Double rate, String description) {
        this.quantity = quantity;
        this.memory = memory;
        this.processor = processor;
        this.weight = weight;
        this.color = color;
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.price = price;
        this.batteryType = batteryType;
    }

    public ProductVariation(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int quantity) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplayResolution(double displayResolution) {
        this.displayResolution = displayResolution;
    }

    public double getDisplayResolution() {
        return displayResolution;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

   }

