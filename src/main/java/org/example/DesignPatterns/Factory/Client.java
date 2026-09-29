package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Buttons.Button;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    String platForm=scanner.nextLine();
        Platforn p=PlatformFactory.getPlatFormByName(platForm);
        UIComponentFactory componentFactory=p.createUIComponentFactory();
        Button button= componentFactory.createButton();
        button.Click();
        Dropdown dropdown=componentFactory.createDropdown();
        dropdown.ShowDropDown();
    }
}
