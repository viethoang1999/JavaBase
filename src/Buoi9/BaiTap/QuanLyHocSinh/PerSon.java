package Buoi9.BaiTap.QuanLyHocSinh;

import Buoi8.Lopvadoituong.Person;

import java.util.Scanner;

public class PerSon {
    private String hoten;
    private String diachi;

    public PerSon(){}
    public PerSon(String hoten, String diachi){
        this.hoten=hoten;
        this.diachi=diachi;
    }
    public String getHoten(){
        return hoten;
    }
    public String getDiachi(){
        return diachi;
    }
    public void setHoten(String hoten){
        this.hoten=hoten;
    }
    public void setDiachi(String diachi){
        this.diachi=diachi;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoten=scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diachi=scanner.nextLine();
    }
    public void output(){
        System.out.println("Nhap ho ten: "+this.hoten);
        System.out.println("Nhap dia chi: "+this.diachi);
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "hoten='" + hoten + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
