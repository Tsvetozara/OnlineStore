package app.entities;

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
