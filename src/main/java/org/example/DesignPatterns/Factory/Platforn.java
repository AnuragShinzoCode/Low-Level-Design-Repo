package org.example.DesignPatterns.Factory;

public abstract class Platforn {

    public void setRefreshRate(){
        System.out.println("Printing refresh rate");
    }
    //here we cant put the logic of creating objects for difff componets

    public abstract UIComponentFactory createUIComponentFactory();
}
