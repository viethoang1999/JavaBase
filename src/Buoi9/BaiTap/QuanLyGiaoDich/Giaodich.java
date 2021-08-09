package Buoi9.BaiTap.QuanLyGiaoDich;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Giaodich {
    private int maGD;
    private LocalDate ngayGD;
    private float dongia;
    private int soluong;

     public Giaodich(){}
     public Giaodich(int maGD, LocalDate ngayGD, float dongia,int soluong){
         this.maGD=maGD;
         this.ngayGD=ngayGD;
         this.dongia=dongia;
         this.soluong=soluong;
     }
     public int getMaGD(){
         return maGD;
     }
     public LocalDate getNgayGD(){
         return ngayGD;
     }
     public float getDongia(){
         return dongia;
     }
     public int getSoluong(){
         return soluong;
     }


    public void setMaGD(int maGD){
         this.maGD=maGD;
    }
    public void setNgayGD(LocalDate ngayGD){
         this.ngayGD=ngayGD;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }


    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã giao dịch: ");
        this.maGD=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày giao dịch: ");
//        String date=scanner.nextLine();
//        this.ngayGD=LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String date = scanner.nextLine();
        this.ngayGD = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập đơn giá: ");
        this.dongia=scanner.nextFloat();
        System.out.println("Nhập số lượng: ");
        this.soluong=scanner.nextInt();
    }
    public void output(){
        System.out.println("mã giao dịch: "+maGD);
        System.out.println("Ngày giao dịch: "+ngayGD);
        System.out.println("Đơn giá: "+dongia);
        System.out.println("Số lượng: "+soluong);

    }
    public double thanhtien(){
         return 0;
    }

    @Override
    public String toString() {
        return "Giaodich{" +
                "maGD=" + maGD +
                ", ngayGD='" + ngayGD + '\'' +
                ", dongia=" + dongia +
                ", soluong=" + soluong +

                '}';
    }
}
