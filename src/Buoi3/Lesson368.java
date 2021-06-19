package Buoi3;

import java.util.Scanner;

//Tính S(x, n) = −𝑥2 + 𝑥4 + ⋯ + (−1)n𝑥2𝑛
public class Lesson368 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            tich = (int) (Math.pow(x, (2 * i)) * Math.pow(-1, i));
            sum += tich;
        }
        System.out.println("Tổng : " + sum);
    }
}
