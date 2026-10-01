package org.example.DesignPatterns.Adapter.V1;

import org.example.DesignPatterns.Adapter.V1.BankAdapter.ICICIBankAdapter;
import org.example.DesignPatterns.Adapter.V1.BankAdapter.YesBankAdapter;

public class BankApiFactory {

    public static BankApi getBankAPIByName(String bankName) {
        BankApi bankAPI = null;
        if(bankName.equals("ICICI")){
            bankAPI = new ICICIBankAdapter();
        } else if(bankName.equals("YesBank")){
            bankAPI = new YesBankAdapter();
        }
        return bankAPI;
    }
}
