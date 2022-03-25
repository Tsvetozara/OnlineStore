package com.coherentsolutions.trainings.java.auto.store.productpackage;

import java.util.List;

public class GreenPhone implements Phone{
    @Override
    public String getColour() {
        return "GreenPhone";
    }

    @Override
    public int getRandomElement(List<String> list, int boundIndex) {
        return boundIndex;
    }
}
