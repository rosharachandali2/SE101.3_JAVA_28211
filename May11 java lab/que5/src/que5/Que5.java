
package que5;

public class Que5 {

   
    public static void main(String[] args) {
      int [] numbers={10,20,30,40,50};
      for (int x:numbers)
      { switch(x)
      
      { case 30:
      continue;
      default:
          System.out.println("x");
      }
      }
        System.out.println("\n");
        System.out.println("I'm out of the loop now");
    }
    
}
