package com.coherentsolutions.trainings.java.auto.store.productpackage;

import java.util.List;

public class RedPhone implements Phone{
    @Override
    public String getColour() {
        return "RedPhone";
    }

    @Override
    public boolean getRandomElement(List<String> list) {
        return false;
    }
}
