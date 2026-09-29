package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Buttons.AndroidButton;
import org.example.DesignPatterns.Factory.Components.Buttons.Button;
import org.example.DesignPatterns.Factory.Components.Dropdown.AndroidDropdown;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
