package Oop.Student;

import java.util.Scanner;

public class SinhVien {
    Scanner scanner=new Scanner(System.in);
    private int masinhvien;
    private String hoten;
    private String diachi;
    private String sodienthoai;
    public SinhVien(){
    }
    public SinhVien(int masinhvien,String hoten,String diachi,String sodienthoai){
        this.masinhvien=masinhvien;
        this.hoten=hoten;
        this.diachi=diachi;
        this.sodienthoai=sodienthoai;
    }
    public int getMasinhvien(){
        return masinhvien;
    }
    public String getHoten(){
        return hoten;
    }
    public String getDiachi(){
        return diachi;
    }
    public String getSodienthoai(){
        return sodienthoai;
    }
    public void setMasinhvien(int masinhvien){
        this.masinhvien=masinhvien;
    }
    public void setHoten(String hoten){
        this.hoten=hoten;
    }
    public void setDiachi(String diachi){
        this.diachi=diachi;
    }
    public void setSodienthoai(String sodienthoai){
        this.sodienthoai=sodienthoai;
    }
    public void Nhap(){
        System.out.println("Nhập mã sinh viên");
        masinhvien=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập họ tên: ");
        hoten=scanner.nextLine();
        System.out.println("Nhập Địa Chỉ: ");
        diachi= scanner.nextLine();
        do {
            System.out.println("Nhập số điện thoại: ");
            sodienthoai=scanner.nextLine();
        }while (getSodienthoai().length()!=7);


    }
    public  void In(){
        System.out.println("Mã sinh viên: "+masinhvien);
        System.out.println("Họ tên: "+hoten);
        System.out.println("Địa chỉ: "+diachi);
        System.out.println("Số điện thoại"+sodienthoai);
    }
//    public boolean ktraSDT(boolean check){
//        if (this.sodienthoai.length()!=7){
//            return false;
//        }
//        return check;
//    }
    public String toString(){
        return "Mã sinh viên: "+masinhvien+", Họ tên: "+hoten+", Địa chỉ: "+diachi+", Số điện thoại: "+sodienthoai+";";
    }

}
