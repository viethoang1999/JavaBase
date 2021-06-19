package Buoi3;

import java.util.Scanner;

//S(n) = x + x^2/1 + 2 + x^3/1 + 2 + 3 + … + x^n/1 + 2 + 3 + N
public class Lesson316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float Tong = 0;
        float sum = 0;
        float multi = 1;
        for (int i = 1; i <= n; i++) {
            Tong += i;
            multi *= x;
            sum += multi / Tong;
        }
        System.out.println("Tổng: " + sum);

    }
}
