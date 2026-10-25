/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

import java.util.ArrayList;

/**
 *
 * @author Wyclif
 */
public class Course {
 private final long ID;
 private final String name;
 ArrayList <Student> studentsEnrolled;
  public Course( long ID, String name ){
      this.ID=ID;
      this.name=name;
      this.studentsEnrolled=new ArrayList<Student>();
      
  }
  public void setstudentsEnrolled(Student student){
   
      this.studentsEnrolled.add(student);
  }
  public ArrayList<Student> getstudentsEnrolled() {
      
  return this.studentsEnrolled;    
  
  }
  public String getname(){
   return this.name;   
  }
  public long getID(){
   return this.ID;   
  }
  
 
}
