package Buoi9.BaiTap.QuanLyXe;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng chuyên xe:  ");
        int n = scanner.nextInt();
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe(n);
        quanLyChuyenXe.prinf();
        System.out.println("Tổng doanh thu của xe đi nội thành: "+quanLyChuyenXe.Tongxenoithanh());
        System.out.println("Tổng doanh thu của xe đi ngoại thành: "+quanLyChuyenXe.Tongxengoaithanh());
    }
}
