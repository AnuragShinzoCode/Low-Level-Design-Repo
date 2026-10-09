package org.example.DesignPatterns.Stratagy;

public class UsernameLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logging via Username");
    }
}
