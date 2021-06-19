package LuyenTap.Bien;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moio ban nhap bai toan can giai quyet!");
        System.out.println("1.Tong 2 so nguyen");
        System.out.println("2.Tim chan le");
        System.out.println("3.Tim max min");
        System.out.println("4.Kiem tra tam giac");
        System.out.println("5.Số âm dương");
        System.out.println("6.Kiểm tra năm nhuận");
        System.out.println("7.Giải phương trình bậc 2");
        System.out.println("8. Trao đổi số");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Ban chon bai 1!");
                System.out.println("Nhap a: ");
                int a = scanner.nextInt();
                System.out.println("Nhap b: ");
                int b = scanner.nextInt();
                int sum = a + b;
                System.out.println("Tong 2 so a va b: " + sum);
                break;

            case 2:
                System.out.println("Ban chon bai 2: ");
                System.out.println("Nhap so can kiem tra: ");
                int c = scanner.nextInt();
                if (c % 2 == 0) {
                    System.out.println("La so chan");
                } else {
                    System.out.println(" La so le");
                }
                break;
            case 3:
                System.out.println("Ban chon bai 3: ");
                System.out.println("Nhap so thu nhat: ");
                int a1 = scanner.nextInt();
                System.out.println("Nhap so thu 2: ");
                int a2 = scanner.nextInt();
                System.out.println("Nhap so thu 3: ");
                int a3 = scanner.nextInt();
//                int max1=a1>a2?a1:a2;
//                int max=a3>max1?a3:max1;
//                System.out.println(max);
//                int min1=a1<a2?a1:a2;
//                int min=a3<min1?a3:min1;
//                System.out.println(min);
                int max = a1;
                if (max < a2) {
                    max = a2;
                }
                if (max < a3) {
                    max = a3;
                }
                System.out.println("Max: " + max);
                int min = a1;
                if (min > a2) {
                    min = a2;
                }
                if (min > a3) {
                    min = a3;
                }
                System.out.println("Min: " + min);
                break;

            case 4:
                System.out.println("Bạn chọn bài 4");
                System.out.println("Nhập cạnh a4: ");
                int a4 = scanner.nextInt();
                System.out.println("Nhập cạnh a5: ");
                int a5 = scanner.nextInt();
                System.out.println("Nhập cạnh a6: ");
                int a6 = scanner.nextInt();
                if (a4 + a5 > a6 || a4 + a6 > a5 || a5 + a6 > a4) {
                    System.out.println("Là tam giác");
                    if (a4 == a5 || a4 == a6 || a5 == a6) {
                        System.out.println("Đây là tam giác cân");
                    } else if ((a4 == a5) && (a5 == a6) && (a6 == a4)) {
                        System.out.println("Đây là tam giác đều");
                    } else if ((a4 * a4 == a5 * a5 + a6 * a6) || (a5 * a5 == a4 * a4 + a6 * a6) || (a6 * a6 == a4 * a4 + a5 * a5)) {
                        System.out.println("Đây là tam giác vuông");
                    } else if ((a4 * a4 > a5 * a5 + a6 * a6) || (a5 * a5 > a4 * a4 + a6 * a6) || (a6 * a6 > a4 * a4 + a5 * a5)) {
                        System.out.println("Đây là tam giác tù");
                    }
                } else {
                    System.out.println("Đay không phải là tam giác");
                }
                break;
            case 5:
                System.out.println("Bạn chọn bài 5");
                System.out.println("Mời bạn nhập số cần kiểm tra ");
                int a7 = scanner.nextInt();
                if (a7 >= 0) {
                    System.out.println("Đây là số dương");
                } else {
                    System.out.println("Đây là số âm");
                }
                break;
            case 6:
                System.out.println("Bạn chọn bài 6");
                System.out.println("NHập năm bạn cần kiểm tra: ");
                int year = scanner.nextInt();
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không là năm nhuận");
                }

            case 7:
                System.out.println("Bạn chọn giải phương trình bậc 2");
                System.out.println("Nhập a: ");
                int a8 = scanner.nextInt();
                System.out.println("Nhập b: ");
                int a9 = scanner.nextInt();
                System.out.println("Nhập c: ");
                int a10 = scanner.nextInt();
                if (a8 == 0) {
                    if (a9 == 0) {
                        if (a10 == 0) {
                            System.out.println("Phương trình vô số nghiệm");
                        } else {
                            System.out.println("Phương trình vô nghiệm");
                        }
                    } else {
                        System.out.println("Phương trình vó nghiệm duy nhất: " + (-a10 / a9));
                    }
                } else {
                    int delta=a9*a9-4*a8*a10;
                    if(delta<0){
                        System.out.println("Phương trình vô nghiệm");
                    }if(delta==0){
                        System.out.println("Phương trình có nghiệm kép: "+(-a9/2*a8));
                    }if (delta>0){
                        float x1=(float)(-a9+Math.sqrt(delta))/(2*a8);
                        float x2=(float)(-a9+Math.sqrt(delta))/(2+a8);
                        System.out.println("Phương trình có 2 nghiệm phân biệt x1: "+x1+", x2: "+x2);
                    }
                }

            case 8:
                System.out.println("Bạn chọn bài 8");
                System.out.println("Nhập số thứ nhất: ");
                int n1=scanner.nextInt();
                System.out.println("Nhập số thứ 2: ");
                int n2= scanner.nextInt();
                System.out.println("Giá trị trước khi hoán đổi số thứ nhất: "+n1+", số thứ 2: "+n2);
                int temp=n1;
                n1=n2;
                n2=temp;
                System.out.println("Số sau khi hoán đổi số thứ nhất: "+n1+", số thứ 2: "+n2);


        }
    }
}
