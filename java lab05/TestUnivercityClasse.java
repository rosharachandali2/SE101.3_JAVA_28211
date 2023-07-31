
package com.mycompany.person;

public class TestUnivercityClasse {
     Student student = new Student("John Doe", "S12345", "Computer Science");

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer("Dr. Jane Smith", "L6789", "Computer Science");

        // Print Student and Lecturer details
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Course: " + student.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getId());
        System.out.println("Programme: " + lecturer.getProgramme());
    }
