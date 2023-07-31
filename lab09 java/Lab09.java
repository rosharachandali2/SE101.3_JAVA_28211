
package com.mycompany.lab09;

public class Lab09 {

    public static void main(String[] args) {
        double height=10.0;
        double radius=5.0;
        CylindricalContainer container = new  CylindricalContainer(height,radius) {};
        double volume= container.calculateVolume();
        
        System.out.println("Volume of the cylindrical container."+volume);
    }
}
