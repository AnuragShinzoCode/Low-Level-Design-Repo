package org.example.DesignPrincipleAndPattern.V1;

public class Crow extends Bird {
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("crow is making soubd");
    }
}
