package org.example.DesignPatterns.Stratagy;

public class OTPLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("loggin via OTP");
    }
}
