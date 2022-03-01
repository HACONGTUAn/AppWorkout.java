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

/**
 *
 * @author ThinkPro
 */
public class DAO {
    private Connection conn;
    String url = "jdbc:postgresql://localhost:5432/new_do_an";
String user = "postgres";
String password = "038201019073";
public DAO(){
    try {
         Class.forName("org.postgresql.Driver");
         conn = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
        e.printStackTrace();
   }
}
/* ghi du lieu vao CSDL */
public boolean addchi_so_khach_hang(chi_so_khach_hang s){
        String sql = "INSERT INTO khach_hang(makh , hovaten , tuoi , chieu_cao , can_nang , bmi , body_fat , calo  ) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getMakh());
            ps.setString(2, s.getTen());
            ps.setInt(3, s.getTuoi());
            ps.setFloat(4, s.getChieu_cao());
            ps.setFloat(5, s.getCan_nang());
            ps.setInt(6, s.getBmi());
            ps.setInt(7, s.getBody());
            ps.setInt(8, s.getCalo());
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
    return false;
    }
 /* doc du lieu tu CSDL ra */
public ArrayList<chi_so_khach_hang> getListchi_so_khach_hang(){
ArrayList<chi_so_khach_hang> list = new ArrayList<>();
String sql = "select * from khach_hang";
 
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        chi_so_khach_hang s = new chi_so_khach_hang();
        s.setMakh(rs.getString("makh"));
            s.setTen(rs.getString("hovaten"));
            s.setTuoi(rs.getInt("tuoi"));
            s.setChieu_cao(rs.getFloat("chieu_cao"));
            s.setCan_nang(rs.getFloat("can_nang"));
            s.setBmi(rs.getInt("bmi"));
            s.setBody(rs.getInt("body_fat"));
            s.setCalo(rs.getInt("calo"));
            list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;

}
public boolean update_chi_so_khach_hang(chi_so_khach_hang s){
        String sql = "update khach_hang set hovaten = ?,tuoi= ? , chieu_cao = ?, can_nang =? , bmi = ?, body_fat = ?,calo = ? where makh =?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, s.getTen());
            ps.setInt(2, s.getTuoi());
            ps.setFloat(3, s.getChieu_cao());
            ps.setFloat(4, s.getCan_nang());
            ps.setInt(5, s.getBmi());
            ps.setInt(6, s.getBody());
            ps.setInt(7, s.getCalo());
            ps.setString(8,s.getMakh());
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
  public boolean delete_chi_so_khach_hang(String makh){
        String sql = "delete from khach_hang where makh = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
        ps.setString(1,makh);
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
    return false;
    }
  //su du lieu bang tong hop
  public boolean update_tong_hop(chi_so_khach_hang s){
        String sql = "UPDATE tong_hop SET body_fat = ? where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, s.getBody());
            ps.setString(2,s.getMakh());
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
 //them du lieu cua khach hang vao bang tong hop 
    public boolean insert_tong_hop(chi_so_khach_hang s){
        String sql = "insert into tong_hop (makh , mabt , body_fat) values (?,'BT01',?); ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(2, s.getBody());
            ps.setString(1,s.getMakh());
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
    
    //them du lieu vao bang lich an
      public boolean insert_lich_an(chi_so_khach_hang s){
        String sql = "insert into lich_an (makh , macc , calo) values (?,'C01',?); ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(2, s.getCalo());
            ps.setString(1,s.getMakh());
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
    //su du lieu bang lich an
        public boolean update_lich_an(chi_so_khach_hang s){
        String sql = "UPDATE lich_an SET calo = ? where makh = ? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, s.getCalo());
            ps.setString(2,s.getMakh());
              
              return ps.executeUpdate() > 0;
    } catch (SQLException e) {
    }
        
    return false;
    }
        
  public ArrayList<chi_so_khach_hang> tim_kiem_ten(String ten){
ArrayList<chi_so_khach_hang> list = new ArrayList<>();
String sql = "select * from khach_hang where hovaten like '%"+ten+"%'";
 
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        chi_so_khach_hang s = new chi_so_khach_hang();
        s.setMakh(rs.getString("makh"));
            s.setTen(rs.getString("hovaten"));
            s.setTuoi(rs.getInt("tuoi"));
            s.setChieu_cao(rs.getFloat("chieu_cao"));
            s.setCan_nang(rs.getFloat("can_nang"));
            s.setBmi(rs.getInt("bmi"));
            s.setBody(rs.getInt("body_fat"));
            s.setCalo(rs.getInt("calo"));
            list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
        return list;

}
  public ArrayList<chi_so_khach_hang> tim_makh(String makh){
  String sql ="select * from khach_hang where makh ='"+makh+"'";
  ArrayList<chi_so_khach_hang> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        chi_so_khach_hang s = new chi_so_khach_hang();
        s.setMakh(rs.getString("makh"));
            s.setTen(rs.getString("hovaten"));
            s.setTuoi(rs.getInt("tuoi"));
            s.setChieu_cao(rs.getFloat("chieu_cao"));
            s.setCan_nang(rs.getFloat("can_nang"));
            s.setBmi(rs.getInt("bmi"));
            s.setBody(rs.getInt("body_fat"));
            s.setCalo(rs.getInt("calo"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
   public ArrayList<chi_so_khach_hang> tim_body(String body_fat){
  String sql ="select * from khach_hang where body_fat ='"+body_fat+"'";
  ArrayList<chi_so_khach_hang> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        chi_so_khach_hang s = new chi_so_khach_hang();
        s.setMakh(rs.getString("makh"));
            s.setTen(rs.getString("hovaten"));
            s.setTuoi(rs.getInt("tuoi"));
            s.setChieu_cao(rs.getFloat("chieu_cao"));
            s.setCan_nang(rs.getFloat("can_nang"));
            s.setBmi(rs.getInt("bmi"));
            s.setBody(rs.getInt("body_fat"));
            s.setCalo(rs.getInt("calo"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
   public ArrayList<chi_so_khach_hang> tim_chieu_cao(String chieu_cao){
  String sql ="select * from khach_hang where chieu_cao ='"+chieu_cao+"'";
  ArrayList<chi_so_khach_hang> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        chi_so_khach_hang s = new chi_so_khach_hang();
        s.setMakh(rs.getString("makh"));
            s.setTen(rs.getString("hovaten"));
            s.setTuoi(rs.getInt("tuoi"));
            s.setChieu_cao(rs.getFloat("chieu_cao"));
            s.setCan_nang(rs.getFloat("can_nang"));
            s.setBmi(rs.getInt("bmi"));
            s.setBody(rs.getInt("body_fat"));
            s.setCalo(rs.getInt("calo"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
   public ArrayList<chi_so_khach_hang> tim_can_nang(String can_nang){
  String sql ="select * from khach_hang where can_nang ='"+can_nang+"'";
  ArrayList<chi_so_khach_hang> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        chi_so_khach_hang s = new chi_so_khach_hang();
        s.setMakh(rs.getString("makh"));
            s.setTen(rs.getString("hovaten"));
            s.setTuoi(rs.getInt("tuoi"));
            s.setChieu_cao(rs.getFloat("chieu_cao"));
            s.setCan_nang(rs.getFloat("can_nang"));
            s.setBmi(rs.getInt("bmi"));
            s.setBody(rs.getInt("body_fat"));
            s.setCalo(rs.getInt("calo"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
    public ArrayList<chi_so_khach_hang> tim_tuoi(int tuoi_truoc, int tuoi_sau){
  String sql ="select * from khach_hang where tuoi BETWEEN '"+tuoi_truoc+"' and '"+tuoi_sau+"'";
  ArrayList<chi_so_khach_hang> list = new ArrayList<>();
  try {
        PreparedStatement ps = conn.prepareStatement(sql);
     java.sql.ResultSet rs;
    rs = ps.executeQuery();
        while(rs.next()){
        chi_so_khach_hang s = new chi_so_khach_hang();
        s.setMakh(rs.getString("makh"));
            s.setTen(rs.getString("hovaten"));
            s.setTuoi(rs.getInt("tuoi"));
            s.setChieu_cao(rs.getFloat("chieu_cao"));
            s.setCan_nang(rs.getFloat("can_nang"));
            s.setBmi(rs.getInt("bmi"));
            s.setBody(rs.getInt("body_fat"));
            s.setCalo(rs.getInt("calo"));
           list.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
         return list;
        
       }
    
    public static void main(String[] args) {
       new DAO(); 
}

   
}