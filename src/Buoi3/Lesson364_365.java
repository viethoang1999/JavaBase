package Buoi3;
//Giải phương trình 𝑎𝑥 + 𝑏 = 0
//Giải phương trình 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0.

import java.util.Scanner;

public class Lesson364_365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm x: " + (-c / b));
            }
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
            if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x: " + x);
            }
            if (delta > 0) {
                float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt x1: " + x1 + " và x2: " + x2);
            }
        }
    }
}
