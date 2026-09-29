package org.example.DesignPatterns.Factory.Components.Dropdown;

public class IOSDropdown implements Dropdown{
    @Override
    public void ShowDropDown() {
        System.out.println("ios Dropdown showed");
    }
}
