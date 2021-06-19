package Buoi3;
//Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất là 25

import java.util.Scanner;

public class Lesson329 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int max = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                max = i;
            }
        }
        System.out.println(max + " là ước số lẻ lớn nhất của " + n);
    }
}
