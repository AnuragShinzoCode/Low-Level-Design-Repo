package org.example.CollectionsTest;

import java.util.Comparator;
//here comparatory is used to put
public class ItemQuantityComparator implements Comparator<Items> {
    @Override
    public int compare(Items o1, Items o2) {
        if(o1.getQuantity()<o2.getQuantity()){
            return 1;
        }
        else if(o1.getQuantity()>o2.getQuantity()){
            return -1;

        }
        return 0;
    }
}
