package Oop;

public class TestQLSV {
    public static void main(String[] args) {
        QuanLySV sinhvien1=new QuanLySV();
        sinhvien1.nhap();
        sinhvien1.xuat();
        sinhvien1.diemTB();
        String s1=sinhvien1.toString();
        System.out.println(s1);
        System.out.println("---------------------------------------------");
        QuanLySV sinhvien2=new QuanLySV(12345,"lien",9.0f,9.0f);
        System.out.println(sinhvien2);
        System.out.println("------------------------------------------------");
        QuanLySV sinhvien3=new QuanLySV(2345,"oanh",9.0f,9.0f);
        System.out.println(sinhvien3);
    }
}
