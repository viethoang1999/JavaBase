package Buoi3;

import java.util.Scanner;

//Tính S(n) = 𝑛+1√𝑛! + 𝑛√(𝑛 − 1)! + 3√2! + √1! có n dấu căn
public class Lesson339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        float multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
            sum = (float) Math.pow((multi + sum) * 1.0, 1.0 / (1 + i));
        }
        System.out.println("Sum: " + sum);
    }
}
