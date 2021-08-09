package Buoi9.BaiTap.QuanLyDat;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Quanlygiaodichdat quanlygiaodichdat=new Quanlygiaodichdat(2);
        quanlygiaodichdat.input();
        quanlygiaodichdat.output();
        double a=quanlygiaodichdat.Tongsoluongtunggiaodich();
        System.out.println("Tổng số lượng từng loại : "+a);
        double b= quanlygiaodichdat.trungBinhThanhTienTungLoai();
        System.out.println("Trung bình từng loại giao dịch: "+b);
        quanlygiaodichdat.output(LocalDate.of(2013,9,1),LocalDate.of(2013,9,30));
    }
}
