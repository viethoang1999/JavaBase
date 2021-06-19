package Buoi3;

import java.util.Scanner;

//Cho số nguyên dương n. Hãy tìm chữ số đầu tiên của n
public class Lesson349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int temp;
        for (int i = 1; i <= n; i++) {
            n /= 10;
            temp = n % 10;
            if (n / 10 == 0) {
                System.out.println(temp);
            }

        }
    }
}
