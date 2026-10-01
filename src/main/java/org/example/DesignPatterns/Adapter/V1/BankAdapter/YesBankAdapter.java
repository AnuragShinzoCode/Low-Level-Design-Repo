package org.example.DesignPatterns.Adapter.V1.BankAdapter;

import org.example.DesignPatterns.Adapter.V1.BankApi;
import org.example.DesignPatterns.Adapter.V1.BankApis.YesBankAPI;

public class YesBankAdapter implements BankApi {

    private YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void tarsferMoney(int amount) {
        yesBankAPI.transfer(amount);
    }
}
