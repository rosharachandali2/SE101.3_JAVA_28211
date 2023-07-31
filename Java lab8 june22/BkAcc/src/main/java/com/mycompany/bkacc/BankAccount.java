
package com.mycompany.bkacc;
abstract class BankAccount {
    private String AccNo;
    private double balance;
    
    public String getAccNo(){
        return AccNo;
    }
   public void setAccNo(String AccNo){
       this.AccNo=AccNo;
   }
   public double getBalance(){
      return balance;
   }
   public void setBalance(double balance){
      this.balance=balance;
   }
   public abstract void CalculateInterest();
}
