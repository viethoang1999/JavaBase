package Buoi9.BaiTap.QuanLyDat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BatDongSan {
    private int magd;
    private LocalDate ngaygiaodich;
    private double dongia;
    private double dientich;

    public BatDongSan() {
    }

    public BatDongSan(int magd, LocalDate ngaygiaodich, double dongia, double dientich) {
        this.magd = magd;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
    }

    public int getMagd() {
        return magd;
    }

    public void setMagd(int magd) {
        this.magd = magd;
    }

    public LocalDate getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(LocalDate ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma giao dich: ");
        this.magd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ngay giao dich: ");
        String date = scanner.nextLine();
        this.ngaygiaodich = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhap don gia: ");
        this.dongia = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        this.dientich = scanner.nextDouble();
        scanner.nextLine();
    }

    public void output() {
        System.out.println("Nhap ma giao dich: " + this.magd);
        System.out.println("ngay giao dich: " + this.ngaygiaodich);
        System.out.println("Don gia: " + this.dongia);
        System.out.println("Dien tich: " + this.dientich);
    }
    public double thanhtien(){
        return 0;
    }

    @Override
    public String toString() {
        return "BatDongSan{" +
                "magd='" + magd + '\'' +
                ", ngaygiaodich=" + ngaygiaodich +
                ", dongia=" + dongia +
                ", dientich=" + dientich +
                '}';
    }
}
