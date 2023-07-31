
package com.mycompany.employeetest;


class Employee {
  
    // Private variables to store employee data
    private String name;
    private int age;
    private double salary;
    private final double bonus;

    // Getters and setters for Name, Age, and Salary
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Constructor to set the bonus value
    public Employee(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate bonus amount
    public double calculateBonusAmount() {
        return salary + bonus;
    }

    String getBonus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

  