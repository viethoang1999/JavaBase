package Oop;

import java.util.Scanner;

public class QuanLySV {
    private int maSinhVien;
    private String Name;
    private float diemLT;
    private float diemTH;

    public QuanLySV() {
    }

    public QuanLySV(int maSinhVien, String Name, float diemLT, float diemTH) {
        this.maSinhVien = maSinhVien;
        this.Name = Name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getName() {
        return Name;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public float diemTB() {
        return (diemTH + diemLT) / 2;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma Sinh Vien: ");
        maSinhVien = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: ");
        Name = scanner.nextLine();
        System.out.println("Diem LT: ");
        diemLT = scanner.nextFloat();
        System.out.println("Diem TH: ");
        diemTH = scanner.nextFloat();
    }

    public void xuat() {
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Name: " + Name);
        System.out.println("Diem LT: " + diemLT);
        System.out.println("Diem TH: " + diemTH);
    }

    @Override
    public String toString() {
        return "{ Ma Sinh Vien: " + maSinhVien + "; Name: " + Name +
                "; Diem LT: " + diemLT + "; Diem TH: " + diemTH +
                "; Diem TB: " + diemTB() + " }";
    }
}
