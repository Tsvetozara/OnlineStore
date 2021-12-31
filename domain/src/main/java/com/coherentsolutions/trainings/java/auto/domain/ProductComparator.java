package com.coherentsolutions.trainings.java.auto.domain;

import app.com.coherentsolutions.trainings.java.auto.store.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        int nameComparison = o1.getName().compareTo(o2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        int priceComparison = o1.getPrice().compareTo(o2.getPrice());
        if (priceComparison != 0) {
            return priceComparison;
        }

                if (o1.getRate() > o2.getRate())
               {
                    return 1;
                } else if (o1.getRate() < o2.getRate())
                return -1; {
                }

               return 0;
            }

    }