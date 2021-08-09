package Buoi9.BaiTap.QuanLyTienDien;

import java.util.Scanner;

public class Khachnuocngoai extends Khachhang {
private String quoctich;

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    @Override
    public double thanhTien() {
        return getSoluong()*getDongia();
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập quốc tịch: ");
        quoctich=scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Quốc tịch: "+quoctich);
    }

    @Override
    public String toString() {
        return "Khachnuocngoai{" +
                "quoctich='" + quoctich + '\'' +
                '}';
    }
}
