package org.example.DesignPatterns.Factory;

public class IOS extends Platforn{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
