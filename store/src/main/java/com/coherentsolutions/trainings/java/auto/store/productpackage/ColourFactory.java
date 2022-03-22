package com.coherentsolutions.trainings.java.auto.store.productpackage;

public class ColourFactory {
    public static Phone createPhone(String colour) {
        if (colour.equalsIgnoreCase("Green")) {
            return new GreenPhone();
        } else if (colour.equalsIgnoreCase("White")) {
            return new WhitePhone();
        } else if (colour.equalsIgnoreCase("Red")) {
            return new RedPhone();
        }
        throw new IllegalArgumentException("No such colour of phone");
    }

    public static void createPhone() {
    }
}