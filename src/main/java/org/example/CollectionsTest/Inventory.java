package org.example.CollectionsTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
//This extends will help us to defiine which object we will get during object cretion of inventory so it will generic for all kind of inventory
public class Inventory<T extends Items>{

   HashMap<Integer,T> inv=new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();

   public Inventory(){
       this.inv=new HashMap<>();
   }

            public void add(T item){
            inv.put(item.getId(),item);
    }

    public void remove(T item){
                inv.remove(item.getId());
    }

    public void remove(int id){
        inv.remove(id);
    }
     public  T get(int itemid){
       if(list.size()>10){
           list.removeLast();
       }
       list.add(itemid);
                return inv.get(itemid);

     }

     public List<Items> getAllByItems(){
                return new ArrayList<>(inv.values());
     }
}
