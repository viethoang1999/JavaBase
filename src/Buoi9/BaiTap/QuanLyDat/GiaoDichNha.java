package Buoi9.BaiTap.QuanLyDat;

import java.util.Scanner;

public class GiaoDichNha extends BatDongSan {
    private int loainha;
    private String diachi;

    public GiaoDichNha() {
    }

    public int getLoainha() {
        return loainha;
    }

    public void setLoainha(int loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhap loai nha: ");
        this.loainha = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diachi = scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("loai nha: " + this.loainha);
        System.out.println("Dia chi: " + this.diachi);
    }

    @Override
    public double thanhtien() {
        if (LoaiNha.NHA_CAO_CAP == loainha) {
            return getDientich() * getDongia();
        } else {
            return getDientich() * getDongia() * 0.9;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "loainha=" + loainha +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
