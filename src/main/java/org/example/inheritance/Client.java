package org.example.inheritance;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Mammal on=new Mammal();
        on.legs();
        on.walk();

    }
}
