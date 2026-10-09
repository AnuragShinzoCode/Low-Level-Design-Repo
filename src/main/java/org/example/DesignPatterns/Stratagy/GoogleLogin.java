package org.example.DesignPatterns.Stratagy;

public class GoogleLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Loggin via Google");
    }
}
