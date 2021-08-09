package Buoi9.BaiTap.QuanLyTienDien;

import java.util.Scanner;

public class KhachhangVN extends Khachhang {
    private int doituong;
    private double limit;

    public int getDoituong() {
        return doituong;
    }

    public void setDoituong(int doituong) {
        this.doituong = doituong;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public double thanhTien() {
       if (getSoluong() < limit) {
            return getSoluong() * getDongia();
        } else {
            return getDongia() + getDongia() * 2.5;
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đối tượng khách hàng: ");
        doituong = scanner.nextInt();
        System.out.println("Nhập vào định mức: ");
        limit = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Đối tượng khách hàng: " + doituong);
        System.out.println("ĐỊnh mức: " + limit);
    }

    @Override
    public String toString() {
        return "KhachhangVN{" +
                "doituong=" + doituong +
                ", limit=" + limit +
                '}';
    }
}
