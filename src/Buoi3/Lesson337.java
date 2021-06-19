package Buoi3;

import java.util.Scanner;

//Tính S(n) = 𝑛√𝑛 + 𝑛−1√𝑛 − 1 + 3√3 + √2 có n – 1 dấu căn
// căn bậc 3 của 2=2^(1/3)
public class Lesson337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
       // sum = (float) Math.pow(2, 1.0 / 2);
        for (int i = 2; i <= n; i++) {
            sum = (float) Math.pow((i + sum) * 1.0, 1.0 / i);
        }
        System.out.println(sum);
    }
}

