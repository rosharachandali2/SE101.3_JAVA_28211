
package com.mycompany.employeetest;
public class EmployeeTest {

    public static void main(String[] args) {
            Employee employee = new Employee(10000); // Pass the bonus value through the constructor

        employee.setName("Bogdan");
        employee.setSalary(50000);

        // Display employee details and bonus amount
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Basic Salary: " + employee.getSalary());
        System.out.println("Bonus: " + employee.getBonus());
        System.out.println("Bonus Amount: " + employee.calculateBonusAmount());
    }
    }
