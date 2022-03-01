/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import model.xep_hang;
import java.sql.PreparedStatement;
/**
 *
 * @author ThinkPro
 */
public class DAO_xep_hang {
      private Connection conn;
    String url = "jdbc:postgresql://localhost:5432/new_do_an";
    String user = "postgres";
    String password = "038201019073";
public DAO_xep_hang(){
  try {
         Class.forName("org.postgresql.Driver");
         conn = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
        e.printStackTrace();
   }

}


public ArrayList<xep_hang> get_xep_hang(){
ArrayList<xep_hang> list = new ArrayList<>();
String sql = "SELECT hovaten, body_fat FROM Khach_hang ORDER BY body_fat";
           try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
    while(rs.next()){
    xep_hang s = new xep_hang ();
   s.setHo_ten(rs.getString("hovaten"));
   s.setBody_fat(rs.getInt("body_fat"));
 
   list.add(s);
    
    }
    } catch (Exception e) {
        e.printStackTrace();
    }

return list;

}
public static void main(String[] args) {
       new DAO_xep_hang(); 
}
}
