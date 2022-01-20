package com.coherentsolutions.trainings.java.auto.domain;

import com.coherentsolutions.trainings.java.auto.store.productpackage.MasterProduct;

import java.util.Comparator;

public class RatingComparator implements Comparator<MasterProduct> {

    @Override
    public int compare(MasterProduct o1, MasterProduct o2) {
        if (o1.getRate() > o2.getRate()) {
            return 1;
        } else if (o1.getRate() < o2.getRate())
            return -1;
        {
        }
        return 0;
    }

}