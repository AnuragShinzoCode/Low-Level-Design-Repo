package org.example.DesignPatterns.Adapter.V0;

import org.example.DesignPatterns.Adapter.V0.BankApis.YesBankAPI;

public class PhonepeLoan {
//5
    public boolean checkLoanEligibility(int amount, YesBankAPI yesBankAPI){

        // Loan will be given if you have 10% of the loan amount in your bank
        //6
        if(yesBankAPI.getBalance() >= .1 * amount){
            System.out.println("Loan can be given!");
            return true;
        }
        return false;
    }
}
