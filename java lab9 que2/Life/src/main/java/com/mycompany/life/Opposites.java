
package com.mycompany.life;
public class Opposites extends Movements {
    private int Sp;
    Opposites(int i){
    this.Sp=i;
    }
     @Override
     public void Up(){
            System.out.println("Player moved Down by"+this.Sp+"space");
}
      @Override
     public void Right(){
            System.out.println("Player moved Left by"+this.Sp+"space");
}
      @Override
     public void Left(){
            System.out.println("Player moved Right by"+this.Sp+"space");
}
      @Override
     public void Down(){
            System.out.println("Player moved Up by"+this.Sp+"space");
}
}
