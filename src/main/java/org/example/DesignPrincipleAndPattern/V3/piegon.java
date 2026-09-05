package org.example.DesignPrincipleAndPattern.V3;

public class piegon extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("peogoin is making sound");
    }

    @Override
    public void fly() {
        System.out.println("flying low");
    }
}
