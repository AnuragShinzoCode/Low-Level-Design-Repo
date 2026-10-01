package org.example.DesignPatterns.Adapter.V1;

import org.example.DesignPatterns.Adapter.V1.BankApis.YesBankAPI;

public class FasttagRecharge {

    public boolean recharge(int amount, BankApi BankApi){
        if(BankApi.checkBalance() > amount){
            System.out.println("Successful!");
            return true;
        }
        return false;
    }
}
