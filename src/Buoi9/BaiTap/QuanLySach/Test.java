package Buoi9.BaiTap.QuanLySach;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số lượng sách: ");
        int n=scanner.nextInt();
        scanner.nextLine();
        Quanlycacloaisach quanlycacloaisach=new Quanlycacloaisach(n);
        quanlycacloaisach.printf();
        System.out.println("Tổng thành tiền từng loại sách : "+quanlycacloaisach.tongTienTungLoaiSach());
        System.out.println("Trung bình cộng đơn giá sách tham khảo: "+quanlycacloaisach.trungBinhCongDonGiaStk());
        quanlycacloaisach.xuatSgk();
    }
}
