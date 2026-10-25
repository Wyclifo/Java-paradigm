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
public class Manager extends Employee {
    private ArrayList<Department> departments=new ArrayList<>();

    public Manager(long ID, String firstName, String lastName,Department department) {
        super(ID, firstName, lastName);
        this.departments.add(department);
    }
    
    public void setdepartments(Department department){
        
     this.departments.add(department);
    }
    public ArrayList<Department> getdepartments(){
        return this.departments;
    }
}
