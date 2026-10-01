package org.example.DesignPatterns.Adapter.V0;

import org.example.DesignPatterns.Adapter.V0.BankApis.YesBankAPI;

public class PhonePe {

    private FasttagRecharge fasttagRecharge;
    private PhonepeLoan phonepeLoan;
    private YesBankAPI yesBankAPI;

    public PhonePe(){
        this.fasttagRecharge=new FasttagRecharge();
        this.phonepeLoan=new PhonepeLoan();
        //2
        this.yesBankAPI=new YesBankAPI();
    }
    public boolean rechargeFastTag(int amount){

        //3
        return fasttagRecharge.recharge(amount, yesBankAPI);
    }

    public boolean availLoan(int amount){
        //4
        if(phonepeLoan.checkLoanEligibility(amount, yesBankAPI)){
            System.out.println("Let's disburse the loan");
            return true;
        } else {
            System.out.println("Sorry, you don't have enough money");
        }
        return false;
    }

}


