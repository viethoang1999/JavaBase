package Buoi3;

import java.util.Scanner;

//Hãy tìm chữ số đảo ngược của số nguyên dương n
public class Lesson350 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = n % 10;
            System.out.print(temp);
            if (n == 0) {
                break;
            }
            n /= 10;

        }

    }
}
