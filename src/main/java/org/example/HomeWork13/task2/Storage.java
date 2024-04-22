package org.example.HomeWork13.task2;

import java.util.ArrayList;
import java.util.List;

public class Storage <T>{
   private List<T> listOfStorage = new ArrayList<>();
   public void add (T item) {
       listOfStorage.add(item);
   }
   public T get (int index) {
       return listOfStorage.get(index);
   }
   public int size () {
       return listOfStorage.size();
   }
}
