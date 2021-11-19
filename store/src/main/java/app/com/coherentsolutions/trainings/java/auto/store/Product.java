package app.com.coherentsolutions.trainings.java.auto.store;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private String name;
    private Double rate;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Product(BigDecimal price, String name, Double rate) {
        this.price = price;
        this.name = name;
        this.rate = rate;
    }
}
