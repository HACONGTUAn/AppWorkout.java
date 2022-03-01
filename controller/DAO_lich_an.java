/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.chi_so_khach_hang;
import model.lich_an;

/**
 *
 * @author ThinkPro
 */
public class DAO_lich_an {
    
       private Connection conn;
    String url = "jdbc:postgresql://localhost:5432/new_do_an";
String user = "postgres";
String password = "038201019073";
public DAO_lich_an(){
    try {
         Class.forName("org.postgresql.Driver");
         conn = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
        e.printStackTrace();
   }
}
   public ArrayList<lich_an> lich_an_1(){
  String sql ="select cac_chat,chi_so from cac_chat where macc = 'C01'";
  ArrayList<lich_an> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        lich_an s = new lich_an();
              s.setCac_chat(rs.getString("cac_chat"));
             s.setPhan_tram(rs.getString("chi_so"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
    public ArrayList<lich_an> lich_an_2(){
  String sql ="select cac_chat,chi_so from cac_chat where macc = 'C02'";
  ArrayList<lich_an> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        lich_an s = new lich_an();
              s.setCac_chat(rs.getString("cac_chat"));
             s.setPhan_tram(rs.getString("chi_so"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
     public ArrayList<lich_an> lich_an_3(){
  String sql ="select cac_chat,chi_so from cac_chat where macc = 'C03'";
  ArrayList<lich_an> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        lich_an s = new lich_an();
              s.setCac_chat(rs.getString("cac_chat"));
             s.setPhan_tram(rs.getString("chi_so"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
 public boolean update_lich_an3(String s){
        String sql = "UPDATE lich_an SET macc = 'C03'  where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s);
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
 public boolean update_lich_an2(String s){
        String sql = "UPDATE lich_an SET macc = 'C02'  where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s);
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
 public boolean update_lich_an1(String s){
        String sql = "UPDATE lich_an SET macc = 'C01'  where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s);
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }

       public static void main(String[] args) {
       new DAO_lich_an(); 
}

    
}
