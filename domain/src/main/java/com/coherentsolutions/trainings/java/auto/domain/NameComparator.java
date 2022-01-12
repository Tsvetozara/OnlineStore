package com.coherentsolutions.trainings.java.auto.domain;

import app.com.coherentsolutions.trainings.java.auto.store.ProductPackage.MasterProduct;

import java.util.Comparator;

public class NameComparator implements Comparator<MasterProduct> {

    @Override
    public int compare(MasterProduct o1, MasterProduct o2) {
        int nameComparison = o1.getName().compareTo(o2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return 0;
    }

}