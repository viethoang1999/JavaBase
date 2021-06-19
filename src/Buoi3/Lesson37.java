package Buoi3;

import java.util.Scanner;

//Tính S(n) = ½ + 2/3 + ¾ + …. + n / n + 1
public class Lesson37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (float) i / (i + 1);
        }
        System.out.println("tổng của dãy số là: " + sum);
    }
}
