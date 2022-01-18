package com.coherentsolutions.trainings.java.auto.store;

import java.util.LinkedList;
import java.util.List;

public class Store {

    List<Category> categoryList;

 public Store(){
     categoryList = new LinkedList<>();
 }
    public void addCategory(Category category) {
        categoryList.add(category);
    }


}
