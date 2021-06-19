package Buoi3;

import java.util.Scanner;

//Đếm số lượng “ước số chẵn” của số nguyên dương n
public class Lesson327 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                count++;
                System.out.println(i+" là ước số chẵn của "+n);
            }
        }
        System.out.println("Tổng ước số chẵn là: "+count);
    }
}
