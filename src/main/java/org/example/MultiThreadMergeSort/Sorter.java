package org.example.MultiThreadMergeSort;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class Sorter implements Callable<List<Integer>> {
private List<Integer> arrayToBeSorted;
    public void Sorter(List<Integer> arrayToBeSorted){
        this.arrayToBeSorted=arrayToBeSorted;
    }


    @Override
    public List<Integer> call(){
        if(arrayToBeSorted.size()<=1){
            return arrayToBeSorted;
        }

        return null;
    }
}
