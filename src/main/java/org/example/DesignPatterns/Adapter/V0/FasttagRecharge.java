package org.example.DesignPatterns.Adapter.V0;

import org.example.DesignPatterns.Adapter.V0.BankApis.YesBankAPI;

public class FasttagRecharge {

    public boolean recharge(int amount, YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance() > amount){
            System.out.println("Successful!");
            return true;
        }
        return false;
    }
}
