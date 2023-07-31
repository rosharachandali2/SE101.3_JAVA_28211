
package com.mycompany.item;
public class Item {

    public static void main(String[] args) {
        protected int location;
        protected String description;
        
        public  Item(int location, String destription){
        this.location=location;
        this.description=destription;
        }
        public int getLocation(){
          return location;
        }
        public void setLocation(int location){
        this.location=location;
        }
         
        public String getDestription(){
          return description;
        }
        public void setDescription(String description){
         this.description=description; 
        }
    }

