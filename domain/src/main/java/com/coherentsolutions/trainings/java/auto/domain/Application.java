package com.coherentsolutions.trainings.java.auto.domain;

import app.com.coherentsolutions.trainings.java.auto.store.ProductPackage.MasterProduct;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<MasterProduct> products = createProducts();

        if ("sort".equals(products)) {
            sortMasterProducts(products);
            products.sort(new NameComparator());
            System.out.println(products);

        } else if ("top".equals(products)) {
            topMasterProducts(products);
            System.out.println(topProducts());

        } else if ("print".equals(products)) {
            System.out.println(products);

        } else if ("quit".equals(products)) {
            System.exit(0);
        }

    }

    private static void topMasterProducts(List<MasterProduct> products) {
    }

    private static void sortMasterProducts(List<MasterProduct> products) {
    }

    private static boolean topProducts() {
        return false;
    }

    private static List<MasterProduct> createProducts() {
        return null;
    }

    public static class Category {
        private String name;

        Category[] categories;

        MasterProduct[] products;
    }
}
