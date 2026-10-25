/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

/**
 *
 * @author Wyclif
 */
public class Backpack {
    private boolean isTouchScreen;
    private int externalMemorySize;
    private int ramMemorySize;
    private Laptop laptop;
    public Backpack(){
    this.isTouchScreen=false;
    }
    public void setLaptop(Laptop laptop){
    this.laptop=laptop;
    }
    public Laptop getLaptop(){
    return this.laptop;
    }
    
    public void setisTouchScreen(boolean Bool){
        this.isTouchScreen=Bool;
        
    }
    public boolean getisTouchScreen(){
        return this.isTouchScreen;
        
    }
    
    public void setexternalMemorySize(int memorySize){
     this.externalMemorySize=memorySize;   
    
    }
    public int getexternalMemorySize(){
             return this.externalMemorySize;
    }
     public void setramMemorySize(int ramMemorySize){
     this.ramMemorySize=ramMemorySize;   
    
    }
    public int getramMemorySize(){
             return this.ramMemorySize;
    }
    
    
}
