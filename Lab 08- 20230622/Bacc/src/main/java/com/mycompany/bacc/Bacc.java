
package com.mycompany.bacc;

public class Bacc {

    public static void main(String[] args) 
    {
        SavingAccount savingAccount=new SavingAccount();
        savingAccount.setBalance(200000.00);
        savingAccount.CalculateInteres();
        
        CheckingAccount checkingAccount=new CheckingAccount();
        checkingAccount.setBalance(200000.00);
        checkingAccount.CalculateInteres();
    }
}