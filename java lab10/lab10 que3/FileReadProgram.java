
package com.mycompany.filereadprogram;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReadProgram {

    public static void main(String[] args) {
  
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath);
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path and try again.");
        }
    }
}

    
