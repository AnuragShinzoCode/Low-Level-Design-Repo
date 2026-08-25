package org.example.LambdasAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //method 1
        Runnable sometask=new SomeTask();
        Thread t=new Thread(sometask);
        t.start();

        // Method 2 : We can use Lambda expressions
        // we know in the functional Interface Runnable
        // There is only one method to be implemented
        // JAVA WILL UNDERSTAND THE METHOD SIGNATURE SO NEED TO PROVIDE EXPLICITLY
        Runnable anotherTask = () -> {
            System.out.println("Hey! I am doing another task");
        };
        Thread t1 = new Thread(anotherTask);
        t1.start();


        List<Integer> list1 = new ArrayList<>();
        list1.add(13);
        list1.add(24);
        list1.add(63);
        list1.add(14);
        list1.add(58);
        list1.add(6);
        // my sorting rules
        // even number should come first, odd later

        // we know we need to right a comparator for this
        //Again we know that comparator has 1 methojde compare so directly we caan write here
        Comparator<Integer> comparator = (o1 , o2) -> {
            if(o1 % 2 == 0) return -1;
            else if(o2 % 2 == 0) return 1;
            return 0;
        };
        Collections.sort(list1, comparator);
        //ORRR WE can write all at once
        Collections.sort(list1, (o1 , o2) -> {
            if(o1 % 2 == 0) return -1;
            else if(o2 % 2 == 0) return 1;
            return 0;
        });

        // Without Lambda
        EvenOddComparator evenOddComparator = new EvenOddComparator();
        Collections.sort(list1, evenOddComparator);
        System.out.println(list1);

    }

}
