package Buoi9.BaiTap.QuanLyHocSinh;

import java.util.Scanner;

public class Customer extends PerSon {
    private String tencongty;
    private float trigiahoadon;
    private String danhgia;

    public String getTencongty() {
        return tencongty;
    }

    public void setTencongty(String tencongty) {
        this.tencongty = tencongty;
    }

    public float getTrigiahoadon() {
        return trigiahoadon;
    }

    public void setTrigiahoadon(float trigiahoadon) {
        this.trigiahoadon = trigiahoadon;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên công ty: ");
        this.tencongty=scanner.nextLine();
        System.out.println("Nhập trị giá hóa đơn: ");
        this.trigiahoadon=scanner.nextFloat();
        System.out.println("Nhập Đánh giá: ");
        this.danhgia=scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tên công ty: "+this.tencongty);
        System.out.println("Trị giá háo đơn: "+this.trigiahoadon);
        System.out.println("Đánh giá: "+this.danhgia);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "tencongty='" + tencongty + '\'' +
                ", trigiahoadon=" + trigiahoadon +
                ", danhgia='" + danhgia + '\'' +
                '}';
    }
}

