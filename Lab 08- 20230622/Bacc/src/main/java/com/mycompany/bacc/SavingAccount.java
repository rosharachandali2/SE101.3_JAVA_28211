
package com.mycompany.bacc;


 class  SavingAccount extends BankAccount1
 {
     private static final double interest_rate=0.12;
    
            @Override
            public void CalculateInteres()
            {
            double interest=getBalance()*interest_rate;
                System.out.println("The interest for the saving account");
                System.out.println("Interest is:"+interest);
            }
    
}
