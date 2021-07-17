package Oop.Nganhang;

import java.util.Scanner;

public class User {
    private long sotaikhoan;
    private String tentaikhoan;
    private double tientrongtaikhoan;
    private final float TIENLAI = 0.035f;
    Scanner sc = new Scanner(System.in);

    public User() {
    }

    public User(long sotaikhoan, String tentaikhoan, double tientrongtaikhoan) {
        this.sotaikhoan = sotaikhoan;
        this.tentaikhoan = tentaikhoan;
        this.tientrongtaikhoan = tientrongtaikhoan;
    }

    public User(long sotaikhoan, String tentaikhoan) {
        this.sotaikhoan = sotaikhoan;
        this.tentaikhoan = tentaikhoan;
        this.tientrongtaikhoan = 50;
    }

    public long getSotaikhoan() {
        return sotaikhoan;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public double getTientrongtaikhoan() {
        return tientrongtaikhoan;
    }

    public void setSotaikhoan(long sotaikhoan) {
        this.sotaikhoan = sotaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public void setTientrongtaikhoan(double tientrongtaikhoan) {
        this.tientrongtaikhoan = tientrongtaikhoan;
    }
    public void nhap(int[]a,int n){
        for (int i=0;i<n;i++){
            System.out.println("So tai khoan: ");
            sotaikhoan=sc.nextLong();
            sc.nextLine();
            System.out.println("Ten tai khoan: ");
            tentaikhoan=sc.nextLine();
            setTientrongtaikhoan(50000);
        }
    }
    public void xuat(int[]a,int n){
        System.out.println("So tai khoan: "+sotaikhoan);
        System.out.println("Ten tai khoan: "+tentaikhoan);
        System.out.println("Tien trong tk: "+tientrongtaikhoan);
    }

    public double naptien() {
        double nap;
        System.out.println("Nhập số tiền cần nạp: ");
        nap = sc.nextDouble();
        if (nap > 0) {
            tientrongtaikhoan += nap;
            System.out.println("bạn vừa nạp " + nap + " vào số tài khoản");
        } else {
            System.out.println("số tiền nạp không hợp lệ");
        }
        return nap;
    }

    public double ruttien() {
        double rut;
        System.out.println("Nhâp số tiền bạn muốn rút: ");
        rut = sc.nextDouble();
        int phi = 5;
        if (rut > 0) {
            tientrongtaikhoan -= (rut + phi);
            System.out.println("bạn vừa rút " + rut + " ra khỏi tài khoản");
        } else {
            System.out.println("Số tiền rút không hợp lệ");
        }
        return rut;
    }
    public double daohan(){
        tientrongtaikhoan+=tientrongtaikhoan*TIENLAI;
        System.out.println("Bạn đk"+tientrongtaikhoan+" từ đáo hạn 1 tháng");
        return tientrongtaikhoan;

    }

}



