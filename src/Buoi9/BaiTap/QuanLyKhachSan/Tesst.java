package Buoi9.BaiTap.QuanLyKhachSan;

import java.time.LocalDate;

public class Tesst {
    public static void main(String[] args) {
        QuanLyHoaDon quanLyHoaDon=new QuanLyHoaDon(2);
        quanLyHoaDon.input();
        quanLyHoaDon.output();
        int a= quanLyHoaDon.TongHoaDonTheoGio();
        System.out.println("Tong so hoa don theo gio: "+a);
        int b= quanLyHoaDon.TongHoaDonTheoNgay();
        System.out.println("Tong so hoa don theo ngay: "+b);
        float c= quanLyHoaDon.TrungBinhThanhTienHoaDonTheoThang(LocalDate.of(2013,9,1),LocalDate.of(2013,9,30));
        System.out.println("Trung bifnh thanfh tien hoa don trong thang 9 nam2 013: "+c);
    }
}
