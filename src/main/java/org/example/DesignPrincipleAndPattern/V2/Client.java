package org.example.DesignPrincipleAndPattern.V2;

public class Client {
    public static void main(String[] args) {
        Bird n=new Crow();
        //only able to access Bird related behaviours
       // n.fly();
        //only able to access Penhguin related behaviours
        Penguin N1=new Penguin();
        N1.makeSound();
        //only able to access all behaviour a crow has may be implemeted interface and inherited class
        Crow n1=new Crow();
        n1.fly();
    }
}
