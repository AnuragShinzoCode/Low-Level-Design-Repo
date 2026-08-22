package org.example.CollectionsTest;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItem {
    private LinkedList<Items> recentlyViewedItems;
    private int MAX_SIZE;

    public RecentlyViewedItem(){
        recentlyViewedItems=new LinkedList<>();
        this.MAX_SIZE=5;
    }
    public void addRecentlyViewedItem(Items item){
        recentlyViewedItems.remove(item);
        recentlyViewedItems.add(item);
        if(recentlyViewedItems.size()>MAX_SIZE){
            recentlyViewedItems.removeFirst();
        }
    }
    List<Items> getRecentlyViewedItem(){
        return recentlyViewedItems;
    }
}
