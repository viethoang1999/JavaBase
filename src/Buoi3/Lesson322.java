package Buoi3;

import java.util.Scanner;

//Tính tích tất cả các “ước số” của số nguyên dương n
public class Lesson322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                multi *= i;
            }
        }
        System.out.println("Tích cúa bội: " + multi);
    }
}
