package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Buttons.Button;
import org.example.DesignPatterns.Factory.Components.Buttons.IOSButton;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;
import org.example.DesignPatterns.Factory.Components.Dropdown.IOSDropdown;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
