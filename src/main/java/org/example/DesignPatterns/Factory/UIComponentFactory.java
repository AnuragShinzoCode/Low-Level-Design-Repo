package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Buttons.Button;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;

public interface UIComponentFactory {

    Button createButton();
    Dropdown createDropdown();
    //menu, list everything
}
