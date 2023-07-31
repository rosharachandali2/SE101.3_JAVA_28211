
package com.mycompany.epmtest; 
public class EpmTest {

    public static void main(String[] args) {
 
        // Create two objects for Mr.Bogdan and Ms.Bird
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        // Set values using setters
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        msBird.setEmpID(102);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("HR Manager");

        // Print values using getters
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println("\nEmployee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }

    }

