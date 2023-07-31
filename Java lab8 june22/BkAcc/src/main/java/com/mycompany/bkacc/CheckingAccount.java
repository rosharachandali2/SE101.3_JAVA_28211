
package com.mycompany.bkacc;
public class CheckingAccount extends BankAccount{
    private static final double interest_rate=0.02;
    @Override
    public void CalculateInterest(){
        double interest=getBalance()*interest_rate;
        System.out.println("The interest for the checking account");
        System.out.println("Interest is:"+interest);
    }

    void setBalanace(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
