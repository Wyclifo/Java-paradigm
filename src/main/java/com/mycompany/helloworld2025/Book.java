/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld2025;

import java.util.Date;

/**
 *
 * @author Wyclif
 */
public class Book extends PublishedMaterial{
    private final String type="Book";
    public Book(String title, String author, Date datePublished, float price) {
        super(title, author, datePublished, price);
    }
    
      public String getType(){
        return this.type;
    }
    
}
