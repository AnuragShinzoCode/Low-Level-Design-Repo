package org.example.DesignPrincipleAndPattern.V3;

public abstract class Bird {
    private String name;
    private int age;
    private int numberOfLegs;
    private String type;
//WHAT WILL HAPEIN IF A BIRD CANt FLY , IN THAT WAY WE HAVE TO CREATE MULTIPLE CALSSS SO THIS IS NOT A GREATE SOLUTION


//    public abstract void fly();

    public abstract void makeSound();

}
