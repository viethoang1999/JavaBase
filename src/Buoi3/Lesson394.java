package Buoi3;

import java.util.Scanner;

// Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93
public class Lesson394 {
    public static boolean check(int n) {
        boolean isPrime = false;
        if (n % 2 == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (check(i)) {
                if (i == 5 || i == 7 || i == 93) {
                    continue;
                }
                System.out.println(i);
            }

        }

    }

}
