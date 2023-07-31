
package com.mycompany.life;
public class Life {

    public static void main(String[] args) {
        Player p1=new Player(2);
        p1.Up();
        p1.Down();
        p1.Right();
        p1.Left();
         
        Jumper j1=new Jumper(5);
          j1.Up();
          j1.Down();
          j1.Right();
          j1.Left();
          
          Opposites o1=new Opposites(1);
          o1.Up();
          o1.Down();
          o1.Right();
          o1.Left();
    }
}
