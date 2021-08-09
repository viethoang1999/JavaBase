package Buoi9.BaiTap.QuanLyGiaoDich;

import java.time.LocalDate;
import java.util.Scanner;

public class Giaodichvang extends Giaodich {
    private String loaivang;

    public Giaodichvang() {
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập loại vàng: ");
        this.loaivang=scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Loại vàng: "+this.loaivang);
    }

    @Override
    public double thanhtien() {
        return getDongia()*getSoluong();
    }

    @Override
    public String toString() {
        return "Giaodichvang{" +
                "loaivang='" + loaivang + '\'' +
                '}';
    }
}
