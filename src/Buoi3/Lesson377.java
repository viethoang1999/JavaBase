package Buoi3;

import java.util.Scanner;

public class Lesson377 {
    public static int sum(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        return tong;
    }

    public static void main(String[] args) {

        int tong = sum(10);
        System.out.println("Sum: " + tong);
    }
}
