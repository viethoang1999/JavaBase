package Buoi9.BaiTap.QuanLySach;

import java.util.Date;
import java.util.Scanner;

public class Sach {
    private  String masach;
    private String ngaynhap;
    private  float dongia;
    private float soluong;
    private String nhaxuatban;
    private float thanhtien;

    public Sach(){}
    public Sach(String masach,String ngaynhap, float dongia,float soluong,String nhaxuatban,float thanhtien){
        this.masach=masach;
        this.ngaynhap=ngaynhap;
        this.dongia=dongia;
        this.soluong=soluong;
        this.nhaxuatban=nhaxuatban;
        this.thanhtien=thanhtien;
    }
    public String getMasach(){
        return masach;
    }
    public String getNgaynhap(){
        return ngaynhap;
    }
    public float getDongia(){
        return  dongia;
    }
    public float getSoluong(){
        return soluong;
    }
    public String getNhaxuatban(){
        return nhaxuatban;
    }
    public  float getThanhtien(){
        return thanhtien;
    }
    public void setMasach(String masach){
        this.masach=masach;
    }
    public void  setNgaynhap(String ngaynhap){
        this.ngaynhap=ngaynhap;
    }
    public void setDongia(float dongia){
        this.dongia=dongia;
    }
    public void setSoluong(float soluong){
        this.soluong=soluong;
    }
    public void setNhaxuatban(String nhaxuatban){
        this.nhaxuatban=nhaxuatban;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "masach='" + masach + '\'' +
                ", ngaynhap='" + ngaynhap + '\'' +
                ", dongia=" + dongia +
                ", soluong=" + soluong +
                ", nhaxuatban='" + nhaxuatban + '\'' +
                ", thanhtien=" + thanhtien +
                '}';
    }
}
