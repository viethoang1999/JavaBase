package Buoi3;

import java.util.Scanner;

//Tính S(n) = √𝑛! + √(𝑛 − 1)! + √(𝑛 − 2)! + ⋯ √2! + √1! có n dấu
public class Lesson336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
        float multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
            sum = (float) Math.sqrt(multi+sum);
        }
        System.out.println(sum);
    }
}
