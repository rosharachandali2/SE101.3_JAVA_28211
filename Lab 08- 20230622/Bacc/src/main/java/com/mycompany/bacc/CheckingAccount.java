
package com.mycompany.bacc;


 class CheckingAccount extends BankAccount1 {
      private static final double rate=0.02;
      
      @Override
      public void CalculateInteres()
      {
         double interest=getBalance()*rate;
          System.out.println("The interest for the Checking account");
          System.out.println("Interest is:"+interest);
      }
    
}
