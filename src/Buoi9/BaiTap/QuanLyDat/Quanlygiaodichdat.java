package Buoi9.BaiTap.QuanLyDat;

import java.time.LocalDate;

public class Quanlygiaodichdat {
    private int n;
    private BatDongSan batDongSan[];

    public Quanlygiaodichdat(int n) {
        this.n = n;
        this.batDongSan = new BatDongSan[n];
    }

    public void input() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                batDongSan[i] = new GiaoDichDat();
            } else {
                batDongSan[i] = new GiaoDichNha();
            }
            batDongSan[i].input();
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            if (batDongSan[i] != null) {
                batDongSan[i].output();
            }
        }
    }

    public double Tongsoluongtunggiaodich() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (batDongSan[i] instanceof GiaoDichDat) {
                sum += batDongSan[i].getDongia();
            }
            if (batDongSan[i] instanceof GiaoDichNha) {
                sum += batDongSan[i].getDongia();
            }
        }
        return sum;
    }

    public double trungBinhThanhTienTungLoai() {
        double sum1 = 0;
        double sum2 = 0;
        double tb = 0;
        for (int i = 0; i < n; i++) {
            if (batDongSan[i] instanceof GiaoDichDat) {
                sum1 += batDongSan[i].thanhtien();
                tb = sum1 / n;
            } else {
                sum2 += batDongSan[i].thanhtien();
                tb = sum2 / n;
            }
        }
        return tb;
    }
    public void output(LocalDate fromDate, LocalDate toDate){
        for (int i=0;i<n;i++){
            if (batDongSan[i].getNgaygiaodich().compareTo(fromDate)>=0&&batDongSan[i].getNgaygiaodich().compareTo(toDate)<=0){
                batDongSan[i].output();
            }
        }
    }
}

