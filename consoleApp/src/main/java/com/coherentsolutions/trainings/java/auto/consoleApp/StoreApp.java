package com.coherentsolutions.trainings.java.auto.consoleApp;

import com.coherentsolutions.trainings.java.auto.consoleApp.entities.Category;
import com.coherentsolutions.trainings.java.auto.consoleApp.entities.Product;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.util.Set;

public class StoreApp {

    static RandomStorePopulator pupulator = new RandomStorePopulator();

    public static void main(String args[]) {

        System.out.println("Welcome to category store");

        Category root = new Category("All categories");

        Reflections reflections = new Reflections("app.categories");

        Set<Class<?>> subTypes =
                reflections.get(Scanners.SubTypes.of(Category.class).asClass());

        Category milk = new Category("Milk");
        Category phone = new Category("Phone");
        Category bike = new Category("Bike");


        Category[] categories = new Category[]{milk, phone, bike};
        root.setCategories(categories);

        for (Category category : categories) {
            generateProducts(category);

            System.out.println(category.getName());
        }

    }

    private static void generateProducts(Category category) {
        long numProducts = pupulator.generateProductCount();
        if (numProducts > 20) {
            numProducts = 20;
        }

        Product[] products = new Product[(int) numProducts];
        for (int index = 0; index < numProducts; index++) {


        }

    }
}
