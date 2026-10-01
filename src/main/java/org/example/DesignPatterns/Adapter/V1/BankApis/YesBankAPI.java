package org.example.DesignPatterns.Adapter.V1.BankApis;

public class YesBankAPI {

    public int getBalance(){
        System.out.println("YES BANK IS CHECKING BALANCE");
        return 100;
    }

    public void transfer(int amount){
        System.out.println("Money Transferred via YES BANK");
    }
}
