package app;

import app.entities.Category;
import app.entities.Product;
import org.reflections.Reflections;

import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class StoreApp {

    static RandomStorePopulator pupulator = new RandomStorePopulator();

    public static void main(String args[]) {

        System.out.println("Welcome to category store");

        Category root = new Category("All categories");

        Reflections reflections = new Reflections("app.categories");

        Set<Class<?>> subTypes =
                reflections.get(SubTypes.of(Category.class).asClass());

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
