package Buoi3;
//Cho số nguyên dương n. Kiểm tra số dương n có phải là số hoàn thiện hay không?

import java.util.Scanner;

public class Lesson330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n+ " là số hoàn hảo");
        }else {
            System.out.println(n+" không là số hoàn hảo");
        }
    }
}
