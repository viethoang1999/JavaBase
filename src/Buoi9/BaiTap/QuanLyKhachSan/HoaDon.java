package Buoi9.BaiTap.QuanLyKhachSan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDon {
    private int mahoadon;
    private LocalDate ngayhoadon;
    private String tenkhachhang;
    private int maphong;
    private double dongia;

    public HoaDon() {
    }

    public HoaDon(int mahoadon, LocalDate ngayhoadon, String tenkhachhang, int maphong, double dongia) {
        this.mahoadon = mahoadon;
        this.ngayhoadon = ngayhoadon;
        this.tenkhachhang = tenkhachhang;
        this.maphong = maphong;
        this.dongia = dongia;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public LocalDate getNgayhoadon() {
        return ngayhoadon;
    }

    public void setNgayhoadon(LocalDate ngayhoadon) {
        this.ngayhoadon = ngayhoadon;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public int getMaphong() {
        return maphong;
    }

    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã hóa đơn: ");
        this.mahoadon = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày hóa đơn: ");
        String date = scanner.nextLine();
        this.ngayhoadon = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập tên khách hàng: ");
        this.tenkhachhang = scanner.nextLine();
        System.out.println("Nhập mã phòng: ");
        this.maphong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập đơn giá: ");
        this.dongia = scanner.nextDouble();
        scanner.nextLine();
    }

    public void output() {
        System.out.println("Mã hóa đơn: " + this.mahoadon);
        System.out.println("Ngày hóa đơn: " + this.ngayhoadon);
        System.out.println("Tên khách hàng: " + this.tenkhachhang);
        System.out.println("Mã phòng: " + this.maphong);
        System.out.println("Đơn giá: " + this.dongia);
    }
    public double thanhtien(){
        return 0;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "mahoadon=" + mahoadon +
                ", ngayhoadon=" + ngayhoadon +
                ", tenkhachhang='" + tenkhachhang + '\'' +
                ", maphong=" + maphong +
                ", dongia=" + dongia +
                '}';
    }
}
