package Buoi9.BaiTap.QuanLyKhachSan;

import Buoi9.BaiTap.QuanLyTienDien.Quanlyhoadon;

import java.time.LocalDate;

public class QuanLyHoaDon {
    private int n;
    private HoaDon hoaDon[];

    public QuanLyHoaDon(int n) {
        this.n = n;
        this.hoaDon = new HoaDon[n];
    }

    public void input() {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                hoaDon[i] = new HoaDonTheoGio();
            } else {
                hoaDon[i] = new HoaDonNgay();
            }
            hoaDon[i].input();
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            if (hoaDon[i] != null) {
                hoaDon[i].output();
            }
        }
    }

    public int TongHoaDonTheoGio() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (hoaDon[i] instanceof HoaDonTheoGio) {
                count++;
            }

        }
        return count;
    }

    public int TongHoaDonTheoNgay() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (hoaDon[i] instanceof HoaDonNgay) {
                count++;

            }
        }
        return count;
    }

    public float TrungBinhThanhTienHoaDonTheoThang(LocalDate fromDate, LocalDate toDate) {
        float sum = 0;
        float trungbinh = 0;
        for (int i = 0; i < n; i++) {
            if (hoaDon[i].getNgayhoadon().compareTo(fromDate) >= 0 && hoaDon[i].getNgayhoadon().compareTo(toDate) <= 0) {
                sum += hoaDon[i].thanhtien();
                trungbinh = sum / n;
            }
        }
        return trungbinh;
    }
}
