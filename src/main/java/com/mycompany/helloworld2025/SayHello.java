/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

/**
 *
 * @author Wyclif
 */
public class SayHello {
    private String Hello,World;
    public SayHello(String hello,String world){
        this.Hello=hello;
        this.World=world;
    }
    public void setHello(String hello){
    this.Hello=hello;
    }
    public void setWorld(String world){
    this.World=world;
    }
    public String getHello(){
        return this.Hello;
    }
    public String getWorld(){
        return this.World;
    }
    
    public String getHelloWorld(){
        return (this.Hello+" "+this.World);
    }
    
   
    
}
