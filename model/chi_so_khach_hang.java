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
public class chi_so_khach_hang implements Serializable {
     private String ten,makh;

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }
     private int tuoi;
     private float can_nang,chieu_cao;
     private int body,calo,bmi;
    // get để lấy thông tin ra khi dùng private

    public int getBmi() {
        return bmi;
    }

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getCalo() {
        return calo;
    }

    public void setCalo(int calo) {
        this.calo = calo;
    }

    public String getTen() {
        return ten;
    }
//set để nhập thông tin vào khi dùng thuộc tính private
    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getChieu_cao() {
        return chieu_cao;
    }

    public void setChieu_cao(float chieu_cao) {
        this.chieu_cao = chieu_cao;
    }

 

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getCan_nang() {
        return can_nang;
    }

    public void setCan_nang(float can_nang) {
        this.can_nang = can_nang;
    }

   
   

}
