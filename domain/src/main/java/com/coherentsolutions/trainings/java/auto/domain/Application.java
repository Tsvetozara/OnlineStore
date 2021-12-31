package com.coherentsolutions.trainings.java.auto.domain;

import app.com.coherentsolutions.trainings.java.auto.store.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Product> products = createProducts();

          if ("sort".equals(products)) {
            sortProducts(products);
              products.sort(new ProductComparator());
              System.out.println(products);

        } else if ("top".equals(products)) {
            topProducts(products);
            System.out.println(topProducts());

        } else if ("print".equals(products)) {
            System.out.println(products);

        } else if ("quit".equals(products)) {
            System.exit(0);
        }

        }

    private static boolean topProducts() {
        return false;
    }

    private static void topProducts(List<Product> products) {
    }

    private static List<Product> createProducts() {

        return null;
    }

    private static void sortProducts(List<Product> products) {
   }
}
