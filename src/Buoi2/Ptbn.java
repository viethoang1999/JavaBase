package Buoi2;

import java.util.Scanner;

//ax+b=0;
//ax2+bx+c=0;

public class Ptbn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("pt vô số nghiệm");
                } else {
                    System.out.println("pt vô nghiệm");
                }
            } else {
                float x = (float) -c/ b;
                System.out.println("Phương trình có nghiệm duy nhất: " + x);
            }
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
            if (delta == 0) {
                float x = (float) -b / 2 * a;
                System.out.println("Phương trình có nghiệm duy nhất: " + x);
            }
            if (delta > 0) {
                float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt x1: " + x1 + " và x2: " + x2);
            }

        }

    }
}
