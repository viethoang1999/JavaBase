package Buoi9.BaiTap.QuanLyHocSinh;

import java.util.Scanner;

public class Employee extends PerSon {
    private float hesoluong;
    private float ngaycong;

    public float getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(float ngaycong) {
        this.ngaycong = ngaycong;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập hệ số lương: ");
        this.hesoluong=scanner.nextFloat();
        System.out.println("Nhập ngày công: ");
        this.ngaycong=scanner.nextFloat();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Hệ số lương: "+this.hesoluong);
        System.out.println("Số ngày công: "+this.ngaycong);
    }
    public double tinhluong(){
        return getHesoluong()*getNgaycong();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hesoluong=" + hesoluong +
                ", ngaycong=" + ngaycong +
                ", Lương: "+tinhluong()+
                '}';
    }
}
