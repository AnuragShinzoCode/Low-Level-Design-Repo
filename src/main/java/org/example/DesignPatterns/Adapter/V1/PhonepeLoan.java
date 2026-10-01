package org.example.DesignPatterns.Adapter.V1;

import org.example.DesignPatterns.Adapter.V1.BankApis.YesBankAPI;

public class PhonepeLoan {
//5
    public boolean checkLoanEligibility(int amount, BankApi bankApi){

        // Loan will be given if you have 10% of the loan amount in your bank
        //6
        if(bankApi.checkBalance() >= .1 * amount){
            System.out.println("Loan can be given!");
            return true;
        }
        return false;
    }
}
