package Buoi9.BaiTap.QuanLyTienDien;

import javafx.scene.transform.Scale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Khachhang {
    private String makhachhang;
    private String hoten;
    private LocalDate ngayrahoadon;
    private float soluong;
    private float dongia;


    public Khachhang() {
    }

    public Khachhang(String makhachhang, String hoten, LocalDate ngayrahoadon, float soluong, float dongia) {
        this.makhachhang = makhachhang;
        this.hoten = hoten;
        this.ngayrahoadon = ngayrahoadon;
        this.soluong = soluong;
        this.dongia = dongia;

    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public LocalDate getNgayrahoadon() {
        return ngayrahoadon;
    }

    public void setNgayrahoadon(LocalDate ngayrahoadon) {
        this.ngayrahoadon = ngayrahoadon;
    }


    public float getSoluong() {
        return soluong;
    }

    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng: ");
        this.makhachhang = scanner.nextLine();
        System.out.println("Nhập họ tên: ");
        this.hoten = scanner.nextLine();
        System.out.println("Ngày xuất hóa đơn: ");
        String date = scanner.nextLine();
        this.ngayrahoadon = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập vào số lượng: ");
        this.soluong = scanner.nextFloat();
        System.out.println("Nhập vào đơn giá: ");
        this.dongia = scanner.nextFloat();
    }

    public void output() {
        System.out.println("Nhập vào mã khách hàng: " + makhachhang);
        System.out.println("Nhập vào họ tên: " + hoten);
        System.out.println("Ngày xuất hóa đơn: " + ngayrahoadon);
        System.out.println("Số lượng: " + soluong);
        System.out.println("Đơn giá: " + dongia);
    }

    public double thanhTien() {
        return 0;
    }


    @Override
    public String toString() {
        return "Khachhang{" +
                "makhachhang='" + makhachhang + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngayrahoadon='" + ngayrahoadon + '\'' +
                ", soluong=" + soluong +
                ", dongia=" + dongia +

                '}';
    }
}
