package Buoi3;

import java.util.Scanner;

//Viết chương trình nhập tháng, năm. Hãy cho biết tháng đó có bao nhiêu ngày
public class Lesson3100 {
    public static boolean kiemTraNamNhuan(int nam) {
        return  (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);




    }
    public static void timNgayTrongThang(int thang, int nam){
        switch (thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Co 31 ngay");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Co 30 ngay");
                break;
            case 2:
                boolean check=kiemTraNamNhuan(nam);
                if (kiemTraNamNhuan(nam)){
                    System.out.println("Co 29 ngay");
                }else {
                    System.out.println("Co 28 ngay");
                }
                break;
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhaajp thang: ");
        int thang=scanner.nextInt();
        System.out.println("Nhap nam: ");
        int nam=scanner.nextInt();
        if (thang<1||thang>12){
            System.out.println("Moi ban nhap lai");
        }
        timNgayTrongThang(thang,nam);
        timNgayTrongThang(1,2020);

    }
}
