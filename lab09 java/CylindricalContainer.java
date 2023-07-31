
package com.mycompany.lab09;
public abstract class CylindricalContainer extends Container{
        CylindricalContainer(double height, double radius){
    this.height=height;
    this.radius=radius;

 
  
    
}
@Override
public double calculateVolume(){
  double volume=Math.PI*radius*radius*height;

   return volume;
   }

}