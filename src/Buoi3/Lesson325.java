package Buoi3;

import java.util.Scanner;

//Tính tổng tất cả các “ước số chẵn” của số nguyên dương n
public class Lesson325 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
