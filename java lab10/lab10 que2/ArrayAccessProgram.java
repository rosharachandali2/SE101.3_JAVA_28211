
package com.mycompany.arrayaccessprogram;
import java.util.Scanner;
public class ArrayAccessProgram {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Create an array of integers
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.print("Enter the index you want to access: ");
        int index = scanner.nextInt();

        try {
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a valid index within the array bounds.");
        }
    }
}

    

