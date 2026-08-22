package org.example.ProducerConsumer.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
//List is not tread safe it doesnot give error if multiple tread access same index
   // private List<Object> items=new ArrayList<>();
    private ConcurrentLinkedDeque<Object> items=new ConcurrentLinkedDeque<>();
    private int MAX_SIZE=5;

    public void add(Object item){
        System.out.println("Item is being produced "+items.size());
        items.add(item);
    }

    public void remove(){
        System.out.println("Item is being consumed "+items.size());
        items.remove();
    }
    public int getMAX_SIZE(){
        return MAX_SIZE;
    }
    public ConcurrentLinkedDeque<Object> getItems(){
        return items;
    }
}
