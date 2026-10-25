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
public class PublishedMaterial {
    private static long ID=0;
    private String title,author;
    private Date datePublished;
    private float price;
    public PublishedMaterial(String title,String author,Date datePublished,float price){
        
        PublishedMaterial.ID++;
        this.title=title;
        this.author=author;
        this.datePublished=datePublished;
        this.price=price;
    }
    
    public String gettitle(){
        return this.title;
    }
    public String getauthor(){
        return this.author;
    }
    public Date getdatePublished(){
        return this.datePublished;
    } 
    public float getprice(){
        return this.price;
    }
    public long getID(){
        return PublishedMaterial.ID;
    }
    
}
