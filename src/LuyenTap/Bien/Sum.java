package LuyenTap.Bien;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhập a: ");
//        int a=scanner.nextInt();
//        System.out.println("Nhập b: ");
//        int b=scanner.nextInt();
//        System.out.println("Nhập c: ");
//        int c=scanner.nextInt();
//        System.out.println("Sum: "+(a+b+c));
        System.out.println("Ban chon bai 3: ");
        System.out.println("Nhap so thu nhat: ");
        int a1 = scanner.nextInt();
        System.out.println("Nhap so thu 2: ");
        int a2 = scanner.nextInt();
        System.out.println("Nhap so thu 3: ");
        int a3 = scanner.nextInt();
        int max = a1;
        if (max < a2) {
            System.out.println("Max: " + a2);
        } else if (max < a3) {
            System.out.println("Max: " + a3);
        }
        int min = a1;
        if (min > a2) {
            System.out.println("Min: " + a2);
        }else  if (min > a3) {
            System.out.println("Min: " + a3);
        }
    }
}
