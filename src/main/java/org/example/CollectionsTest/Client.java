package org.example.CollectionsTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Items> items=new ArrayList<>();

        items.add(new Book(1,"Sapiens", (long) 50.0,1,"Hillary"));
        items.add(new Electronics(3,"Mouse", (long) 600.0,1,6));
        items.add(new Clothing(2,"JARA", (long) 100.0,1,"L"));
        items.add(new Electronics(4,"Mouse", (long) 6000.0,1,6));

        System.out.println("Item list:::");
        for(Items item:items){
            System.out.println(item.getName()+"price is:::"+item.getPrice());
        }
        //now i have to sort on  name but we cant use collections.sort on object , hence we will use copparable interface
        Collections.sort(items);
        System.out.println("Item list:::sorteed");
        for(Items item:items){
            System.out.println(item.getName()+"price is:::"+item.getPrice());
        }

    }
}
