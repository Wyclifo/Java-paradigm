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
public class Department {
    private final long ID;
    private String departmentName;
    private ArrayList<Employee> employees=new ArrayList<>();
    public Department(long ID, String departmentName){
    this.ID=ID;
    this.departmentName=departmentName;
    }
    
    public long getDepartmentId(){
     return this.ID;   
    }
    public void setemployees(Employee employee){
        
    this.employees.add(employee);
    }
    public ArrayList<Employee> getemployees(){
    return this.employees;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentName(){
     return this.departmentName;   
    }
}
