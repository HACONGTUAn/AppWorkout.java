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
import model.lich_tap;
import model.tenkhach_hangtl;

/**
 *
 * @author ThinkPro
 */
public class DAO_lich_tap {
    private Connection conn;
    String url = "jdbc:postgresql://localhost:5432/new_do_an";
String user = "postgres";
String password = "038201019073";
public DAO_lich_tap(){
    try {
         Class.forName("org.postgresql.Driver");
         conn = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
        e.printStackTrace();
   }
}
// ngay và nội dụng tập luyện của các lịch tập
public ArrayList<lich_tap> get_lich_tap(){
ArrayList<lich_tap> list = new ArrayList<>();
String sql = "select thu,noi_dung from lich_tap where lich_tap.mabt = 'BT01';";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
    while(rs.next()){
    lich_tap s = new lich_tap();
    s.setThu(rs.getString("thu"));
   s.setNoi_dung(rs.getString("noi_dung"));
     list.add(s);
    
    }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;
}

public ArrayList<lich_tap> get_lich_tap_2(){
ArrayList<lich_tap> list = new ArrayList<>();

String sql = "select thu,noi_dung from lich_tap where lich_tap.mabt = 'BT02';";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
    while(rs.next()){
    lich_tap s = new lich_tap();
   s.setThu(rs.getString("thu"));
   s.setNoi_dung(rs.getString("noi_dung"));
     list.add(s);
    
    }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;
}

public ArrayList<lich_tap> get_lich_tap_3(){
ArrayList<lich_tap> list = new ArrayList<>();
String sql = "select thu,noi_dung from lich_tap where lich_tap.mabt = 'BT03';";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
    while(rs.next()){
    lich_tap s = new lich_tap();
   s.setThu(rs.getString("thu"));
   s.setNoi_dung(rs.getString("noi_dung"));
     list.add(s);
    
    }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;
}
// tên các khách hàng tập lịch tập số 01,02,03
public ArrayList<tenkhach_hangtl> get_khach_hang_tl(){
ArrayList<tenkhach_hangtl> list = new ArrayList<>();
String sql = "select hovaten from khach_hang INNER JOIN tong_hop on khach_hang.makh = tong_hop.makh where mabt = 'BT01'";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
    while(rs.next()){
    tenkhach_hangtl s = new tenkhach_hangtl();
   s.setTen(rs.getString("hovaten"));
 
   list.add(s);
    
    }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;
}
public ArrayList<tenkhach_hangtl> get_khach_hang_t2(){
ArrayList<tenkhach_hangtl> list = new ArrayList<>();
String sql = "select hovaten from khach_hang INNER JOIN tong_hop on khach_hang.makh = tong_hop.makh where mabt = 'BT02'";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
    while(rs.next()){
    tenkhach_hangtl s = new tenkhach_hangtl();
   s.setTen(rs.getString("hovaten"));
 
   list.add(s);
    
    }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;
}
public ArrayList<tenkhach_hangtl> get_khach_hang_t3(){
ArrayList<tenkhach_hangtl> list = new ArrayList<>();
String sql = "select hovaten from khach_hang INNER JOIN tong_hop on khach_hang.makh = tong_hop.makh where mabt = 'BT03'";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
    while(rs.next()){
    tenkhach_hangtl s = new tenkhach_hangtl();
   s.setTen(rs.getString("hovaten"));
 
   list.add(s);
    
    }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;
}
  public boolean add_BT(lich_tap s){
        String sql = "insert into lich_tap(mabt,thu,noi_dung) values (?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMabt());
            ps.setString(2,s.getThu());
            ps.setString(3,s.getNoi_dung());
              
            return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
  //thêm bài tập vào bảng tổng hợp cho các body_fat mới
 public boolean update_BT_3(String s){
        String sql = "UPDATE tong_hop SET mabt = 'BT03'  where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s);
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
  public boolean update_BT_2(String s){
        String sql = "UPDATE tong_hop SET mabt = 'BT02'  where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s);
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
   public boolean update_BT_1(String s){
        String sql = "UPDATE tong_hop SET mabt = 'BT01'  where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s);
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }


public static void main(String[] args) {
       new DAO_lich_tap(); 
}



  }
