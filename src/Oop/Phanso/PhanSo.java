package Oop.Phanso;

import java.util.Scanner;

public class PhanSo {
    private int tuso;
    private int mauso;

    public PhanSo() {
    }

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toigian2phanso() {
        int ps = UCLN(this.getTuso(), this.getMauso());
        this.setTuso(this.getTuso() / ps);
        this.setMauso(this.getMauso() / ps);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("Nhập tử số: ");
            a = scanner.nextInt();
            System.out.println("Nhập mẫu số: ");
            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("mau so không đúng mời nhập lại");
            } else {
                tuso = a;
                mauso = b;
            }
        } while (b == 0);
    }

    public void xuat() {
        if (tuso * mauso < 0) {
            System.out.println("-" + Math.abs(tuso) + "/" + Math.abs(mauso));
        } else {
            System.out.println(Math.abs(tuso) + "/" + Math.abs(mauso));
        }
    }

    public void congPs(PhanSo ps2) {
        int a = tuso * ps2.mauso + ps2.tuso * mauso;
        int b = mauso * ps2.mauso;
        PhanSo pstong = new PhanSo(a, b);
        pstong.toigian2phanso();
        System.out.println("Tôrng 2 phân số: " + pstong.tuso + "/" + pstong.mauso);
    }

    public PhanSo truPs(PhanSo ps2) {
        int a = tuso * ps2.mauso - ps2.tuso * mauso;
        int b = mauso * ps2.mauso;
        return new PhanSo(a, b);
    }

    public PhanSo nhanPs(PhanSo ps2) {
        int a = tuso * ps2.tuso;
        int b = mauso * ps2.mauso;
        return new PhanSo(a, b);
    }

    public PhanSo chiaPs(PhanSo ps2) {
        int a = tuso * ps2.mauso;
        int b = mauso * ps2.tuso;
        return new PhanSo(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo ps = new PhanSo();
        PhanSo ps2 = new PhanSo();
        ps.nhap();
        ps.xuat();
        ps2.nhap();
        ps2.xuat();
        ps.congPs(ps2);
        ps.toigian2phanso();
        ps.nhanPs(ps2);
    }
}
