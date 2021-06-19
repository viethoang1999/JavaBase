package Buoi3;

import java.util.Scanner;

//Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó
public class Lesson328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.println(i + " là ước số của " + n);
            }
        }
        System.out.println(sum + " là tổng của các ước số nhỏ hơn " + n);
    }
}
