package Buoi9.BaiTap.QuanLyDat;

import java.util.Scanner;

public class GiaoDichDat extends BatDongSan {
    private int loaidat;

    public GiaoDichDat() {
    }

    public int getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(int loaidat) {
        this.loaidat = loaidat;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap loai dat: ");
        this.loaidat = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Loai dat: " + this.loaidat);

    }
    @Override
    public double thanhtien(){
        if (LoaiDat.DAT_A==loaidat){
            return getDientich()*getDongia()*1.5;
        }else {
            return getDientich()*getDongia();
        }
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +
                "loaidat=" + loaidat +
                '}';
    }
}
