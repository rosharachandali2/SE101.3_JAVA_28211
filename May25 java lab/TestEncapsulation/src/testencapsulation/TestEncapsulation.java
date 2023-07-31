

package testencapsulation;


public class TestEncapsulation {
    public static void main(String[] args) {
        
        Employeee employee = new Employeee();
       //set values using setters
       employee.setName("Bogdan");
       employee.setAge(30);
       employee.setSalary(5000.0);
       
       //get value using getters
       String name=employee.getName();
       int age =employee.getAge();
       double salary=employee.getSalary();
       
       //print values
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Salary: " + employee.getSalary());
        
    }}
        
        
        
        
        
        
        
        

    }
    
}
