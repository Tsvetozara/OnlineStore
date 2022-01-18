package com.coherentsolutions.trainings.java.auto.store;

public class Category {
    private String name;

    Category[] categories;

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

    public Category(String name) {
        this.name = name;
    }
}
