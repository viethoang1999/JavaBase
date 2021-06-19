package Buoi3;

import java.util.Scanner;

//Tìm chữ số lớn nhất của số nguyên dương n.
public class Lesson351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (max < n % 10) {
                max = n % 10;
            }
            n /= 10;
        }
        System.out.println(max);

    }
}
