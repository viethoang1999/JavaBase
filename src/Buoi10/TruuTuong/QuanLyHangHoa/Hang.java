package Buoi10.TruuTuong.QuanLyHangHoa;

import java.util.Scanner;

public abstract class Hang extends VatValue implements Evaluator {
    private String mahang;
    private String tenhang;
    private int soluongtonkho;
    private double dongia;
    private static int autorIncrement=0;
    private static int autorIncrement1=0;
    public Hang(){
        this.mahang="product"+autorIncrement++;
    }


    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        if (dongia < 0) {
            System.out.println("price is greater 0");
            System.exit(0);
        }
        this.dongia = dongia;
    }

    public String getMahang() {
        return mahang;
    }


    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        if (tenhang == null || tenhang.isEmpty()) {
            System.out.println("name do not blank");
            System.exit(0);
        }
        this.tenhang = tenhang;
    }

    public int getSoluongtonkho() {
        return soluongtonkho;
    }

    public void setSoluongtonkho(int soluongtonkho) {
        if (soluongtonkho < 0) {
            System.out.println("inventer is greater 0");
            System.exit(0);
        }
        this.soluongtonkho = soluongtonkho;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập mã số: ");
//        this.mahang = scanner.nextLine();
//        if (this.mahang == null || this.mahang.isEmpty()) {
//            System.out.println("indentity not blank");
//            System.exit(0);
//        }
        System.out.println("Nhập vào tên hàng: ");
        this.tenhang = scanner.nextLine();
        if (this.tenhang == null || this.tenhang.isEmpty()) {
            System.out.println("name is not blank");
            System.exit(0);
        }
        System.out.println("Nhập vào tồn kho: ");
        this.soluongtonkho = scanner.nextInt();
        if (this.soluongtonkho < 0) {
            System.out.println("inventer is greater 0");
            System.exit(0);
        }
        System.out.println("Nhập vào đơn giá: ");
        this.dongia = scanner.nextDouble();
        if (this.dongia <= 0) {
            System.out.println("price is greater 0");
            System.exit(0);
        }

    }
    public void output(){
        System.out.println("Mã hàng: "+this.mahang);
        System.out.println("Tên hàng: "+this.tenhang);
        System.out.println("Tồn kho: "+this.soluongtonkho);
        System.out.println("Đơn giá: "+this.dongia);
        System.out.println("vat: "+this.getVat());
    }

    @Override
    public String toString() {
        return "Hang{" +
                "mahang='" + mahang + '\'' +
                ", tenhang='" + tenhang + '\'' +
                ", soluongtonkho=" + soluongtonkho +
                ", dongia=" + dongia +
                '}';
    }
}
