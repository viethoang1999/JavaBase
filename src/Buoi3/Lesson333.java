package Buoi3;

import java.util.Scanner;

//Tính S(n) = √2 + √2 + √2 + ⋯ √2 + √2 có n dấu căn
public class Lesson333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (float) Math.sqrt(sum + 2);
        }
        System.out.println(sum);
    }

}
