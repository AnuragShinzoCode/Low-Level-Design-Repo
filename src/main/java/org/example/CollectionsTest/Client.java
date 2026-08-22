package org.example.CollectionsTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Items> items=new ArrayList<>();

        items.add(new Book(1,"Sapiens", (long) 50.0,1,"Hillary"));
        items.add(new Electronics(3,"Mouse", (long) 600.0,3,6));
        items.add(new Clothing(2,"JARA", (long) 100.0,8,"L"));
        items.add(new Electronics(4,"Mouse", (long) 6000.0,0,6));

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
        System.out.println("*****************************************************");
        //this object will only expect electrnics type
        Inventory<Electronics> electronicsInventory=new Inventory<>();
        Inventory<Book> booksInventory=new Inventory<>();
        Inventory<Clothing> clothingInventory=new Inventory<>();

        electronicsInventory.add(new Electronics(4,"Mouse", (long) 6000.0,1,6));
        electronicsInventory.add(new Electronics(8,"Mouse1", (long) 6000.0,1,6));
        electronicsInventory.add(new Electronics(9,"Mouse3", (long) 6000.0,1,6));
        electronicsInventory.add(new Electronics(10,"Mouse4", (long) 6000.0,1,6));
        System.out.println("*****************************************************");
        System.out.println("pritnig all items"+electronicsInventory.getAllByItems());
        for(Items item:electronicsInventory.getAllByItems()){
            System.out.println(item.getName()+"price is:::"+item.getPrice());
        }
        Items item1=new Electronics(4,"Mouse1", (long) 6000.0,1,6);
        Items item2=new Electronics(4,"Mouse2", (long) 6000.0,1,6);
        Items item3=new Electronics(4,"Mouse3", (long) 6000.0,1,6);
        Items item4=new Book(4,"BOOK1", (long) 6000.0,1,"rUSKIN");
        Items item5=new Book(4,"BOOK2", (long) 6000.0,1,"HILLL");
        Items item6=new Clothing(4,"CLOTH1", (long) 6000.0,1,"L");
        Items item7=new Clothing(4,"CLOTH1", (long) 6000.0,1,"XL");
        Items item8=new Clothing(4,"CLOTH1", (long) 6000.0,1,"M");
        RecentlyViewedItem recentlyViewedItem=new RecentlyViewedItem();

        recentlyViewedItem.addRecentlyViewedItem(item1);
        recentlyViewedItem.addRecentlyViewedItem(item2);
        recentlyViewedItem.addRecentlyViewedItem(item3);
        recentlyViewedItem.addRecentlyViewedItem(item4);
        recentlyViewedItem.addRecentlyViewedItem(item5);
        recentlyViewedItem.addRecentlyViewedItem(item6);
        recentlyViewedItem.addRecentlyViewedItem(item7);
        recentlyViewedItem.addRecentlyViewedItem(item8);

        System.out.println("*****************************************************");

        for(Items item:recentlyViewedItem.getRecentlyViewedItem()){
            System.out.println(item.getName());
        }
        System.out.println("*****************************************************");
        List<Items> items1=new ArrayList<>();

        items1.add(new Book(1,"Sapiens", (long) 50.0,1,"Hillary"));
        items1.add(new Electronics(3,"Mouse", (long) 600.0,3,6));
        items1.add(new Clothing(2,"JARA", (long) 100.0,8,"L"));
        items1.add(new Electronics(4,"Mouse", (long) 6000.0,0,6));
        Collections.sort(items1,new ItemQuantityComparator());
        for(Items item:items1){
            System.out.println(item.getQuantity());
        }
        System.out.println("*****************************************************");
        Order order1=new Order(true,"1");
        Order order2=new Order(false,"2");
        Order order3=new Order(true,"3");
        Order order4=new Order(false,"4");
        Order order5=new Order(true,"5");
OrderProcessor orderProcessor=new OrderProcessor();
orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order3);
        orderProcessor.addOrder(order4);
        orderProcessor.addOrder(order5);
        while(orderProcessor.getSize()>0){
            orderProcessor.processOrder();
        }

    }
}
