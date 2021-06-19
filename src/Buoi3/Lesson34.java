package Buoi3;
//tính: 1/2+1/4...+1/2n;

import java.util.Scanner;

public class Lesson34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (float) 1 / (2 * i);
        }
        System.out.println("Tổng dãy số là: " + sum);

    }
}
