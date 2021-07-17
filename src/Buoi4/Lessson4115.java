package Buoi4;

import java.util.Scanner;

//Viết chương trình nhập họ tên, điểm toán, điểm văn của 1 học sinh. Tính điểm trung bình và xuất ra kết quả
public class Lessson4115 {
    public static String hoten;
    public static int diemtoan;
    public static int diemvan;
    public static float diemTB;

    public static void diemtrungbinh() {
         diemTB = (float) (diemtoan + diemvan) / 2;

    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        hoten = scanner.nextLine();
        System.out.println("Nhap diem toan: ");
        diemtoan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap diem van: ");
        diemvan = scanner.nextInt();
        scanner.nextLine();
    }

    public static void output( ) {
        System.out.println("Ho ten: " + hoten);
        System.out.println("Diem toan: " + diemtoan);
        System.out.println("Diem van: " + diemvan);
        System.out.println("Diem tb: "+diemTB);
    }

    public static void main(String[] args) {

        input();
        diemtrungbinh();
        output();


    }
}
