package Buoi9.BaiTap.QuanLyHocSinh;

import java.util.Scanner;

public class Student extends PerSon {
    private float diemmon1;
    private float diemmon2;

    public float getDiemmon1() {
        return diemmon1;
    }

    public void setDiemmon1(float diemmon1) {
        this.diemmon1 = diemmon1;
    }

    public float getDiemmon2() {
        return diemmon2;
    }

    public void setDiemmon2(float diemmon2) {
        this.diemmon2 = diemmon2;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập diểm môn 1: ");
        this.diemmon1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhập điểm môn 2: ");
        this.diemmon2 = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Điểm môn 1: " + this.diemmon1);
        System.out.println("Điểm môn 2: " + this.diemmon2);
    }

    public double DiemTrungBinh() {
        return (diemmon1 + diemmon2) / 2;
    }

    public String DanhGia() {
        String danhgia = "";
        if (DiemTrungBinh() >= 8) {
            danhgia = "Loai A";
        } else if (DiemTrungBinh() < 8 && DiemTrungBinh() >= 7) {
            danhgia = "Loai B";
        } else if (DiemTrungBinh() < 7 && DiemTrungBinh() >= 5) {
            danhgia = "Loai C";
        } else {
            danhgia = "Loai D";
        }
        return danhgia;
    }

    @Override
    public String toString() {
        return "Student{" +
                "diemmon1= " + diemmon1 +
                ", diemmon2= " + diemmon2 +
                ", diem trung binh= " + DiemTrungBinh() +
                ", Đánh giá: " + DanhGia() +
                '}';
    }
}
