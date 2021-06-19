package Buoi3;

import java.util.Scanner;

//Tính S(n) = √𝑥n + √𝑥n−1 + √𝑥n−2 + ⋯ √𝑥2 + √𝑥 có n dấu căn
public class lesson340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        float multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= x;
            sum = (float) Math.sqrt(multi + sum);
        }
        System.out.println("Sum: " + sum);
    }
}
