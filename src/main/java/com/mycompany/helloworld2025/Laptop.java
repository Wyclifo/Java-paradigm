/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

/**
 *
 * @author Wyclif
 */
public class Laptop {

    /**
     *
     */
    private String laptopName;
    public static int laptopId=0;
    public Laptop(){
        laptopId++;
    }

   public void setlaptopName(String laptopName){
   this.laptopName=laptopName;
   }
   public String getlaptopName(){
   return this.laptopName;
   }
   
  
}
