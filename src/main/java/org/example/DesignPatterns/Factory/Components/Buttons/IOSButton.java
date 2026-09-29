package org.example.DesignPatterns.Factory.Components.Buttons;

public class IOSButton implements Button{
    @Override
    public void Click() {
        System.out.println("IOS button Clicked");
    }
}
