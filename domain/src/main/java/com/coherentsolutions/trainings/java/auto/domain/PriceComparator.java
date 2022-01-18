package com.coherentsolutions.trainings.java.auto.domain;

import com.coherentsolutions.trainings.java.auto.store.ProductPackage.ProductVariation;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductVariation> {

    @Override
    public int compare(ProductVariation o1, ProductVariation o2) {

        if(o1.getPrice() > o2.getPrice()) {
            return 1;
        } else         if(o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

}