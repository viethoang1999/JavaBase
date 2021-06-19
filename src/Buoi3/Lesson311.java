package Buoi3;

import java.util.Scanner;

//Tính S(n) = 1 + 1.2 + 1.2.3 + … + 1.2.3….N
public class Lesson311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
            sum += multi;
        }
        System.out.println("Tổng: " + sum);
    }
}
