/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

/**
 *
 * @author Wyclif
 */
public class ArrayExplanation {
  private int [] Positions;
  public  int[] getArray(){
      Positions =new int[34];
    for( int i=0; i<Positions.length; ++i){
      Positions[i] =i;
   }
      return this.Positions;
      
  }
  private String[] arrayDeclared(){
        String names[] = {"Anna", "Krisztina", "Rebekka"};
        return names;
  }
  public String[] getarrayDeclared(){
      return this.arrayDeclared();
  } 
  public void printArray(String array[]){
      for(int i=0;i<array.length;i++){
          System.out.println("THe array content at index "+i +" is "+array[i]);
      }
  }
  
    
}
