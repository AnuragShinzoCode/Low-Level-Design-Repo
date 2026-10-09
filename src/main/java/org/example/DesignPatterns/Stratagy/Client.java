package org.example.DesignPatterns.Stratagy;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("Enter the login way");
        Scanner ob=new Scanner(System.in);
        LoginStrategy lo=LoginStrategyFactory.getLoginWay(ob.nextLine());
        lo.login();
    }
}
