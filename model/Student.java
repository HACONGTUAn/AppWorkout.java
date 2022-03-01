/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ThinkPro
 */
public class Student implements Serializable{
   private String ten,sdd;
   
   public String getTen(){
       return ten;
   }
   public void setTen(String ten){
       this.ten = ten;
    }
   
   public String getSdd() {
        return sdd;
    }

    public void setSdd(String sdd) {
        this.sdd = sdd;
    }
}


   
