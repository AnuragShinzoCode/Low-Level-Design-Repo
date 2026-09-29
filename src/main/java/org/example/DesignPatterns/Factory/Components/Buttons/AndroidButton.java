package org.example.DesignPatterns.Factory.Components.Buttons;

public class AndroidButton implements Button{
    @Override
    public void Click() {
        System.out.println("Android button Clicked");
    }
}
