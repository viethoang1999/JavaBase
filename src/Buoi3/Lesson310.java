package Buoi3;

import java.util.Scanner;

//Tính T(x, n) = x^n
public class Lesson310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x: ");
        int x = scanner.nextInt();
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= x;
        }
        System.out.println("Tích: " + multi);
    }

}
