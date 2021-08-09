package Buoi9.BaiTap.QuanLyKhachSan;

import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon {
    private float sogiothue;

    public HoaDonTheoGio() {
    }

    public float getSogiothue() {
        return sogiothue;
    }

    public void setSogiothue(float sogiothue) {
        this.sogiothue = sogiothue;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số giờ thuê: ");
        this.sogiothue = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Số giờ thuê: " + this.sogiothue);
    }

    @Override
    public double thanhtien() {
        if (sogiothue > 24 && sogiothue < 30) {
            return getDongia() * getSogiothue();
        }
        if (sogiothue > 30) {
            new HoaDonNgay();
        }
        return thanhtien();
    }

    @Override
    public String toString() {
        return "HoaDonTheoGio{" +
                "sogiothue=" + sogiothue +
                '}';
    }
}
