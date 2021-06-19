package Buoi3;

import java.util.Scanner;

//Tính S(n) = x + x^2/2! + x^3/3! + … + x^n/N!
public class Lesson317 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float tich = 1;
        float sum = 0;
        float tich2 = 1;
        for (int i = 1; i <= n; i++) {
            tich *= x;
            tich2 *= i;
            sum += tich / tich2;
        }
        System.out.println("Tổng: " + sum);
    }
}
