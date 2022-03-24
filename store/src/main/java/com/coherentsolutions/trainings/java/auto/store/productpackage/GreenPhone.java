package com.coherentsolutions.trainings.java.auto.store.productpackage;

import java.util.List;

public class GreenPhone implements Phone{
    @Override
    public String getColour() {
        return "GreenPhone";
    }

    @Override
    public boolean getRandomElement(List<String> list) {
        return false;
    }
}
