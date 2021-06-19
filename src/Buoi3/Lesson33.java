package Buoi3;

import java.util.Scanner;

//tính : 1+1/2+1/3+...+1/n
public class Lesson33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (float) 1 / i;
        }
        System.out.println(sum);
    }
}
