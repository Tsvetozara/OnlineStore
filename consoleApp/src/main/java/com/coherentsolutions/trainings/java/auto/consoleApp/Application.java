package com.coherentsolutions.trainings.java.auto.consoleApp;

import com.coherentsolutions.trainings.java.auto.domain.NameComparator;
import com.coherentsolutions.trainings.java.auto.domain.RatingComparator;
import com.coherentsolutions.trainings.java.auto.store.productpackage.MasterProduct;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        List<MasterProduct> products = createProducts();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String command = scanner.next();
            switch (command) {
                case "sort": {
                    sortProducts(products);
                    break;
                }
                case "top": {
                    topProducts(products);
                    break;
                }
                case "print": {
                    System.out.println(products);
                }
                case "quit": {
                    System.exit(0);
                }
            }

        }
    }

    private static void topProducts(List<MasterProduct> products) {
        products.sort(new RatingComparator());
        System.out.println(products.subList(0,5));
    }

    private static void sortProducts(List<MasterProduct> products) {
        products.sort(new NameComparator());
        System.out.println(products);
    }

    private static List<MasterProduct> createProducts() {
        return null;
    }
}

