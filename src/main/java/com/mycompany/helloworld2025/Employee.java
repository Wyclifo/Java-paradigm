/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

/**
 *
 * @author Wyclif
 */
public class Employee {
    private final  long  ID;
    private final String firstName;
    private final String lastName;
    
    public Employee(long ID, String firstName, String lastName){
    this.ID=ID;
    this.firstName=firstName;
    this.lastName=lastName;
    
    }
    public String getFullNAme(){
     return (this.firstName+" "+this.lastName);   
    }
    public long getID(){
     return this.ID;   
    }
}
