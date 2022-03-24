package com.coherentsolutions.trainings.java.auto.store.productpackage;

import java.util.List;

public class WhitePhone implements Phone {
    @Override
    public String getColour() {
        return "WhitePhone";
    }

    @Override
    public boolean getRandomElement(List<String> list) {
        return false;
    }
}
