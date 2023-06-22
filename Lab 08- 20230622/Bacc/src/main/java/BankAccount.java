abstract class BankAccount {
    private String AccountNumber;
    private double balance;
    
    public String getAccountNumber(){
           return AccountNumber;
    }
    public void setAccountNumber(String AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    public double getBalance(){
        return balance;
    }
   public void setBalance(double balance){
                this.balance=balance;
   }
   public abstract void CalculateInteres();
}
