package Buoi9.BaiTap.QuanLyGiaoDich;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        QuanLyGiaoDichTien quanLyGiaoDichTien=new QuanLyGiaoDichTien(2);
        quanLyGiaoDichTien.input();
        quanLyGiaoDichTien.output();
        double a=quanLyGiaoDichTien.TongSoLuongTungLoai();
        System.out.println("Tổng số tiền cho từng loại giáo dịch là: "+a);
        float b=quanLyGiaoDichTien.TrungBinhThanhTienGiaoDichTienTe();
        System.out.println("Trung bình thành tiền của giao dịch tiên tệ: "+b);
        quanLyGiaoDichTien.GiaoDichDonGiaHon1ty();
        quanLyGiaoDichTien.output(LocalDate.of(2013,9,1), LocalDate.of(2013,9,30));
    }
}
