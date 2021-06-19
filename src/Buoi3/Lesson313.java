package Buoi3;

import java.util.Scanner;

//Tính S(n) = x^2 + x^4 + … + x^2n
public class Lesson313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            // multi*=x*x;
            multi = (int) Math.pow(x, (2 * i));
            sum += multi;
        }
        System.out.println("Tổng: " + sum);
    }
}
