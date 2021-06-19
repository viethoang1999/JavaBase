package Buoi3;
//Tính S(x, n) = – x + x^2/2! – x^3/3! + … + (-1)^n * x^n/n!

import java.util.Scanner;

public class Lesson372 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float tich = 1;
        int thuong = 1;
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            tich *= x;
            thuong *= i;
            sum += Math.pow(-1, i) * tich / thuong;
        }
        System.out.println("Tổng :" + sum);
    }
}
