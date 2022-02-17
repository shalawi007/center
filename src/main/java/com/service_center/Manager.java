/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service_center;

/**
 *
 * @author shoal
 */
public class Manager {
    private String id;
    private String name ;
    private String contact;
    private String password;
    
    /**
     * Creates a new object for manager
     * @param ID for manager unique
     * @param Name name of the manager 
     * @param tel phone number of the manager
     * @param Pass password of the manager
     */
    
    //constructor
    public Manager(String ID, String Name, String tel, String Pass){
        this.id = ID;
        this.name = Name;
        this.contact = tel;
        this.password = Pass;
          
    }
    
    
    //getters
    public String getID(){
        return id ;
    }
    public String getName(){
        return name;
    }
    public String gettel(){
        return contact;
    }
    public String getPass(){
        return password;
    }
    
    public void checkfeedback(){
        
       
   }
    
   public void generateReport(){
       
   } 
   //setters
   
   public void bookApp(){
       
   }
}