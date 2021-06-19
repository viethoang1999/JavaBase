package Buoi3;

import java.util.Scanner;

// Tính S(x, n) = -x + x^2/(1 + 2) – x^3/(1 + 2 + 3) + … + (-1)^n * x^n/(1 + 2 +… + n)
public class Lesson371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        float thuong = 0;
        float tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= x;
            thuong += i;
            sum += Math.pow(-1, i) * (Math.pow(x, i) / thuong);
            //sum += Math.pow(-1, (float)i) *tich/thuong;

        }
        System.out.println("tổng: " + sum);
    }
}
