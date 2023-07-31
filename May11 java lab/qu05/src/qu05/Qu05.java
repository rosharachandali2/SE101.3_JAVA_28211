
package qu05;

public class Qu05 {

   
    public static void main(String[] args) {
       char grade='A';
       if (grade=='A'){
           System.out.println("Excellent");
       }else if (grade=='D'){
           System.out.println("you passed");
           } else if (grade=='F'){
           System.out.println("better try again");
           }else {
           System.out.println("invalid grade");}
        System.out.println("your grade is" + grade);
    }
    
}
