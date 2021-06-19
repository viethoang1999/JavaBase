package Buoi3;

import java.util.Scanner;

//Tính S(n) = 1 + x^2/2! + x^4/4! + … + x^2n/(2n)!
public class Lesson318 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float tich = 1;
        float tich2 = 1;
        float sum = 1;
        for (int i = 1; i <= 2 * n; i++) {
            tich *= x;
            tich2 *= i;
            if (i % 2 == 0) {
                sum += tich / tich2;
            }

        }
        System.out.println("Tổng: " + sum);
    }

}
