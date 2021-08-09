package Buoi9.BaiTap.QuanLySach;

import java.util.Date;
import java.util.Scanner;

public class Quanlycacloaisach {
    private int n;
    private Sach[] cacloaisach;

    public Quanlycacloaisach(int n) {
        this.n = n;
        this.cacloaisach = new Sach[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin " + n + " cuốn sách");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào thông tin cuốn sách thứ" + (i + 1));
            System.out.println("Nhập vào thông tin sách giáo khoa/sách tham khảo");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("sách giáo khoa")) {
                System.out.println("Sách giáo khoa");
            } else if (type.equalsIgnoreCase("Sách tham khảo")) {
                System.out.println("Sách tham khảo");
            } else {
                System.out.println("Nhập sai yêu cầu");
            }
            //String masach, String ngaynhap,float dongia, int soluong, String nhaxuatban,double thanhtien, String tinhtrang
            System.out.println("Mã sách: ");
            String masach = scanner.nextLine();
            System.out.println("Ngày nhập: ");
            String ngaynhap = scanner.nextLine();
            System.out.println("Đơn giá: ");
            float dongia = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Số lượng: ");
            float soluong = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Nhà xuất bản: ");
            String nhaxuatban = scanner.nextLine();
            System.out.println("Thành tiền:  ");
            float thanhtien = scanner.nextFloat();
            scanner.nextLine();
            if (type.equalsIgnoreCase("Sách giáo khoa")) {
                System.out.println("Tình trạng:  ");
                String tinhtrang = scanner.nextLine();
                if (tinhtrang.equalsIgnoreCase("mới")) {
                    thanhtien = soluong * dongia;
                } else if (tinhtrang.equalsIgnoreCase("cũ")) {
                    thanhtien = (float) (soluong * dongia * 0.5);
                } else {
                    System.out.println("Không có dữ liệu");
                }
                cacloaisach[i] = new SachGiaoKhoa(masach, ngaynhap, dongia, soluong, nhaxuatban, thanhtien, tinhtrang);
            } else if (type.equalsIgnoreCase("Sách tham khảo")) {
                System.out.println("Thuế: ");
                float thue = scanner.nextFloat();
                thanhtien =(float) (soluong * dongia + thue);
                cacloaisach[i] = new SachThamKhao(masach, ngaynhap, dongia, soluong, nhaxuatban, thanhtien, thue);
            }
        }
    }
    public void printf(){
        System.out.println("Tổng số sách: "+n);
        for (int i=0;i<n;i++){
            System.out.println("Thông tin cuốn sách thứ: "+(i+1)+cacloaisach[i].toString());
        }
    }
    public float tongTienTungLoaiSach(){
        float sum=0;
        for (int i=0;i<n;i++){
            if (cacloaisach[i] instanceof SachGiaoKhoa){
                sum+=cacloaisach[i].getThanhtien();
            }else if (cacloaisach[i] instanceof SachThamKhao){
                sum+=cacloaisach[i].getThanhtien();
            }
        }
        return sum;
    }
    public float trungBinhCongDonGiaStk(){
        float tbc=0;
        float sum=0;
        for (int i=0;i<n;i++) {
            if (cacloaisach[i] instanceof SachThamKhao){
                sum+=cacloaisach[i].getThanhtien();
                tbc=sum/n;
            }
        }
        return tbc;
    }
    public void xuatSgk(){
        for (int i=0;i<n;i++){
            if (cacloaisach[i] instanceof SachGiaoKhoa){
                if (cacloaisach[i].getNhaxuatban().equalsIgnoreCase("X")){
                    System.out.println(cacloaisach[i].toString());
                }
            }
        }
    }
}
