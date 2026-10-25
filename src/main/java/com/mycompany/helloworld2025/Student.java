    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.helloworld2025;

    /**
     *
     * @author Wyclif
     */
    public class Student {
     private final long ID;
     private String firstname;
     private String lastname;
     public Student(long ID,String firstName,String lastName){

     this.ID=ID;
     this.firstname=firstName;
     this.lastname=lastName;
     }

     public void setfirstName(String firstName){
      this.firstname=firstName;   
     }
     public void setlastName(String lastName){
         this.lastname=lastName;

     }

     public String getfirstName(){

     return this.firstname;
     }
     public String getlastName(){
         return this.lastname;

     }

        /**
         *
         * @return
         */
      public  long getID(){
      return this.ID;   
     }
      public String getFiullName(){
          return (this.firstname +" "+this.lastname);

      }
     }

