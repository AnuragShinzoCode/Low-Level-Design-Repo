package org.example.DesignPatterns.Factory;

public class Android extends Platforn{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
