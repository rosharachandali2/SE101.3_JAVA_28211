 
 class CheckingAccount extends BankAccount {
      private static final double interest_rate=0.02;
      
      @Override
      public void CalculateInterest()
      {
         double interest=getBalance()*interest_rate;
          System.out.println("The interest for the Checking account");
          System.out.println("Interest is:"+interest);
      }
}
