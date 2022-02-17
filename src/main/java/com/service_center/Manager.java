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
     * 
     * @param ID
     * @param Name
     * @param tel
     * @param Pass 
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
    public void checkfeedback() {

        
    }

}