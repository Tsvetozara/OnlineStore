package com.coherentsolutions.trainings.java.auto.consoleApp;

import com.github.javafaker.Faker;

public class RandomStorePopulator {

    Faker faker = new Faker();

    public long generateProductCount() {
        return faker.number().randomNumber();
    }

  }
