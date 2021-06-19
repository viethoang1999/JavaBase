package Buoi3;

import java.util.Scanner;

//tinh: 1/3+1/5+...+1/2n+1
public class Lesson35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (float) 1 / (2 * i + 1);
        }
        System.out.println("Tổng dãy số là: " + sum);
    }
}
