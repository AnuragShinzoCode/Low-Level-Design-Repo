package org.example.Generics;

public class Client {
    public static void main(String[] args) {
       //issye will comw in run time
        Pair ob=new Pair();
        ob.setFirst("Hello");
        ob.setSecond(59);
        //there it will give compile time issye if we pass any other type variiables
        //but if we dont provide type it will take default Object
        GenericPair<String,Integer> ob1=new GenericPair<>();
        ob1.setFirst("hello");
        ob1.setSecond(12);
    }
}
