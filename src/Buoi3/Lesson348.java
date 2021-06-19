package Buoi3;

import java.util.Scanner;

//Hãy tính tích các chữ số lẻ của số nguyên dương n.
public class Lesson348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int tich = 1;
        for (int i = 1; i <= n; i++) {
            if (n % 2 !=0) {
                tich *= n%10;
            }
            if (n == 0) {
                break;
            }
            n /= 10;
        }
        System.out.println("Tích: " + tich);
    }
}
