package org.example.DesignPatterns.Adapter.V1.BankApis;

public class ICICIAPI {

    public int BalanceCheck(){
        System.out.println("ICICI BANK IS CHECKING BALANCE");
        return 100;
    }

    public void transferMoney(int amount){
        System.out.println("Money Transferred via ICICI BANK");
    }
}
