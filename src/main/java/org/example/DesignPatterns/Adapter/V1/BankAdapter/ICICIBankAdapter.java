package org.example.DesignPatterns.Adapter.V1.BankAdapter;

import org.example.DesignPatterns.Adapter.V1.BankApi;
import org.example.DesignPatterns.Adapter.V1.BankApis.ICICIAPI;

public class ICICIBankAdapter implements BankApi {

    private ICICIAPI iciciapi=new ICICIAPI();
    @Override
    public int checkBalance() {
        return iciciapi.BalanceCheck();
    }

    @Override
    public void tarsferMoney(int amount) {
    iciciapi.transferMoney(amount);
    }
}
