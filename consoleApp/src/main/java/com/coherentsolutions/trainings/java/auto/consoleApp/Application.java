package com.coherentsolutions.trainings.java.auto.consoleApp;

import com.coherentsolutions.trainings.java.auto.domain.NameComparator;
import com.coherentsolutions.trainings.java.auto.domain.PriceComparator;
import com.coherentsolutions.trainings.java.auto.store.Category;
import com.coherentsolutions.trainings.java.auto.store.Store;
import com.coherentsolutions.trainings.java.auto.store.productpackage.MasterProduct;
import com.coherentsolutions.trainings.java.auto.store.productpackage.Phone;
import com.coherentsolutions.trainings.java.auto.store.productpackage.ProductVariation;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to category store");
        Store store = new Store();
        Category phones = new Category("Phones");
        MasterProduct iphone = new MasterProduct("iphone") {
        };

        List<ProductVariation> variations = createVariations();
        iphone.setVariations(variations);
        List<MasterProduct> products = Arrays.asList(iphone);
        phones.setProducts(products);
        store.addCategory(phones);

        executeCommand(products, variations);

        List<String> list = new LinkedList<>();
        list.add("RedPhone");
        list.add("GreenPhone");
        list.add("WhitePhone");

        Phone obj = new Phone() {
            @Override
            public String getColour() {
                return null;
            }

            @Override
            public int getRandomElement(List<String> list, int boundIndex) {
                return 0;
            }

        };

        int boundIndex = 3;
        System.out.println(obj.getRandomElement(list, boundIndex));
    }

    public static void executeCommand(List<MasterProduct> products, List<ProductVariation> variations) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String command = scanner.next();
            switch (command) {
                case "sort": {
                    sortProducts(products);
                    break;
                }
                case "top": {
                    topProducts(variations);
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

    private static List<ProductVariation> createVariations() {

        ProductVariation whiteColour = new ProductVariation("whiteColour", 1000.0);
        ProductVariation silverColour = new ProductVariation("silverColour", 1200.0);
        ProductVariation blueColour = new ProductVariation("blueColour", 1100.0);
        ProductVariation blackColour = new ProductVariation("blackColour", 1400.0);
        ProductVariation pinkColour = new ProductVariation("pinkColour", 1350.0);
        ProductVariation greenColour = new ProductVariation("pinkColour", 900.0);

        List<ProductVariation> variations = Arrays.asList(whiteColour, silverColour, blueColour,
                blackColour, pinkColour, greenColour);
        return variations;
    }

    private static void topProducts(List<ProductVariation> products) {
        products.sort(new PriceComparator());
        System.out.println(products.subList(0, 5));
    }

    private static void sortProducts(List<MasterProduct> products) {
        products.sort(new NameComparator());
        System.out.println(products);
    }
}

