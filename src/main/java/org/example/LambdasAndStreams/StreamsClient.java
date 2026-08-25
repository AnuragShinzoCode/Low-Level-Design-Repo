package org.example.LambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args) {
        List<Integer> list = List.of(13 , 2, 7, 3, 4, 6, 6, 10, 1, 9, 8, 9, 12);

        // filter out the odd elements , only keep the even elements
        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        Stream<Integer> stream = list.stream();
        // filter method : helps you filter out elements on the basis of logic you will provide
        // filter method returns the stream

        List<Integer> evenElementsList =
                stream.filter((element) -> {
                    if(element % 2 == 0) { return true; }
                    return false;
                }).collect(Collectors.toList());
        System.out.println(evenElementsList);
        //.collect collects the stream and put in type you want


        // Predicate interface => bool test(T t);
//        bool test(Integer element){
//            if(element % 2 == 0) { return true; }
//            return false;
//        }

        // Stream is closed

        // map method : Function interface obj : implementation of apply


        List<Integer> sqaures = list.stream().map(
                            (element) -> {
                            return element * element;
                        })
                        .collect(Collectors.toList());

        System.out.println(sqaures);

        List<Integer> finalOutput =
                list
                        .stream()
                        .filter((element) -> {
                            if(element % 2 == 0) { return true; }
                            return false;
                        })
                        .map((element) -> {
                            return element * element;
                        })
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(finalOutput);
//if body is of 1 line then we can write without curly braces
        List<Integer> finalOutput2 =
                list
                        .stream()
                        .filter(element -> element % 2 == 0)
                        .map(element -> element * element)
                        .sorted()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(finalOutput2);

        System.out.println("********* Advantage *************");
        Optional<Integer> ans =
                list
                        .stream()
                        .filter((element) -> {
                            System.out.println("Filtering : " + element);
                            if(element % 2 == 0) { return true; }
                            return false;
                        })
                        .map((element) -> {
                            System.out.println("Mapping : " + element);
                            return element * element;
                        })
                        .distinct().sorted()
                        .findFirst();

        if(ans.isPresent()) {}
        System.out.println(ans.get());
//here at last we wanted first and asoon as it got it stoped it
        //if i use sorted then all execuiton of all the elements will happen
        //smart enough to undersat the optimization
    }
}
