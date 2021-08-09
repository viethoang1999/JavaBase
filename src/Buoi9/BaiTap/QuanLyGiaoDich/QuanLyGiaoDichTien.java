package Buoi9.BaiTap.QuanLyGiaoDich;

import java.time.LocalDate;

public class QuanLyGiaoDichTien {
    private int n;
    private Giaodich giaodich[];

    public QuanLyGiaoDichTien(int n) {
        this.n = n;
        this.giaodich = new Giaodich[n];
    }

    public void input() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                giaodich[i] = new Giaodichvang();
            } else {
                giaodich[i] = new GiaoDichTienTe();
            }
            giaodich[i].input();
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            if (giaodich[i] != null) {
                giaodich[i].output();
            }
        }
    }

    public void output(LocalDate fromDate, LocalDate toDate) {
        for (int i = 0; i < n; i++) {
            if (giaodich[i].getNgayGD().compareTo(fromDate) >= 0 && giaodich[i].getNgayGD().compareTo(toDate) <= 0) {
                giaodich[i].output();
            }
        }
    }

    public double TongSoLuongTungLoai() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (giaodich[i] instanceof GiaoDichTienTe) {
                sum += giaodich[i].getSoluong();
            } else {
                sum += giaodich[i].getSoluong();
            }
        }
        return sum;
    }
    public float TrungBinhThanhTienGiaoDichTienTe(){
        int sum=0;
        int tb=0;
        for (int i=0;i<n;i++){
            if (giaodich[i] instanceof GiaoDichTienTe){
                sum+=giaodich[i].thanhtien();
                tb=sum/n;
            }
        }
        return tb;
    }
    public void GiaoDichDonGiaHon1ty(){
        for (int i=0;i<n;i++){
            if (giaodich[i].getDongia()>1000000000){
                System.out.println(giaodich[i].toString());
            }
        }
    }
}
