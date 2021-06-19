package Buoi3;

import java.util.Scanner;

//Đếm số lượng “ước số” của số nguyên dương n
public class Lesson323 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n:  ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.println(i+" ước số của "+n);
            }
        }
        System.out.println("Tổng ước số: "+count);
    }
}
