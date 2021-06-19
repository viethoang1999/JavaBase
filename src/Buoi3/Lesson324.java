package Buoi3;
//Liệt kê tất cả các “ước số lẻ” của số nguyên dương n

import java.util.Scanner;

public class Lesson324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                System.out.println(i+" là ước số lẻ của "+n);
            }
        }
    }
}
