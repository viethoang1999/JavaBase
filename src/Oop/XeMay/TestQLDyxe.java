package Oop.XeMay;

import Oop.XeMay.QLdangkyxe;

import java.util.Scanner;

public class TestQLDyxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLdangkyxe[] xe = null;
        int a = 0;
        int n = 0;
        System.out.println("Bọn chọn nghiệp vụ : ");
        System.out.println("1.Tạo các đối tượng nhập thông tin xe.");
        System.out.println("2.Bảng kê khai tiền thuế");
        a = scanner.nextInt();
        switch (a) {
            case 1: {
                System.out.println("Nhap so luong xe: ");
                n = scanner.nextInt();
                xe = new QLdangkyxe[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("xe thu: " + (i + 1));
                    xe[i] = new QLdangkyxe();
                    xe[i].nhap();
                    xe[i].xuat();
                    float s=xe[i].thuephainop();
                    System.out.println(s);
                    String s1=xe[i].toString();
                    System.out.println(s1);
                }
                break;
            }
            default:{
                System.out.println("bye");
            }
        }
    }
}
