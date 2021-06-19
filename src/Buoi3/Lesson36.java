package Buoi3;

import java.util.Scanner;

//tính: 1/1*2+1/2*3+...+1/n*(n+1)
public class Lesson36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (float) 1 / (i * (i + 1));
        }
        System.out.println("Tổng của dãy số là: " + sum);
    }
}
