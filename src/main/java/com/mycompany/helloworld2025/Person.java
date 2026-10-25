/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

/**
 *
 * @author Wyclif
 */
public class Person {
  private String firstName,secondName;
  private final Brain brain=new Brain();
  public Person(String firstName,String secondName){
      this.firstName=firstName;
      this.secondName=secondName;
  }

  public void setfirstName(String firstname){
      this.firstName=firstname;
  }
  public void  setsecondName(String secondname){
       this.secondName=secondname;
  }
  public String getfirstName(){
      return this.firstName;
  }
  public String getsecondName(){
      return this.secondName;
  }
  public String getfullName(){
      return (this.firstName + " "+ this.secondName);
  }

    /**
     *
     * @return
     */
  public Brain getBrain(){
  return this.brain;
  }
  
}
