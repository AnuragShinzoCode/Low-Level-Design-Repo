package org.example.DesignPatterns.Adapter.V1;

import org.example.DesignPatterns.Adapter.V1.BankApis.YesBankAPI;

public class PhonePe {

    private FasttagRecharge fasttagRecharge;
    private PhonepeLoan phonepeLoan;
    private BankApi bankApi;

    public PhonePe(BankApi bankApi){
        this.fasttagRecharge=new FasttagRecharge();
        this.phonepeLoan=new PhonepeLoan();
        //2
        this.bankApi=bankApi;
    }
    public boolean rechargeFastTag(int amount){

        //3
        return fasttagRecharge.recharge(amount, bankApi);
    }

    public boolean availLoan(int amount){
        //4
        if(phonepeLoan.checkLoanEligibility(amount, bankApi)){
            System.out.println("Let's disburse the loan");
            return true;
        } else {
            System.out.println("Sorry, you don't have enough money");
        }
        return false;
    }

}


