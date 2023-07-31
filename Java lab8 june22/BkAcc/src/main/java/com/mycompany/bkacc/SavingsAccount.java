
package com.mycompany.bkacc; 
public class SavingsAccount extends BankAccount {
    private static final double interest_rate=0.12;

    @Override
    public void CalculateInterest(){
      double interest=getBalance()*interest_rate;
        System.out.println("The interest for the Savings account");
        System.out.println("Interest is:"+interest);
    }
}
