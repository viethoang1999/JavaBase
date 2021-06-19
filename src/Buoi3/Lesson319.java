package Buoi3;

import java.util.Scanner;

///S(n) = 1 + x + x^3/3! + x^5/5! + … + x^(2n+1)/(2n+1)!
public class Lesson319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 1 + x;
        float tich1 = 1;
        float tich2 = 1;
        for (int i = 1; i <= 2 * n + 1; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 2 * i + 1; j++) {
                    tich1 *= x;
                    tich2 *= j;
                }
                sum += tich1 / tich2;
            }
        }
        System.out.println("Tổng : " + sum);
    }
}
