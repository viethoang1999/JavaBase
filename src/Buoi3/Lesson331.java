package Buoi3;

import java.util.Scanner;

//Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số nguyên tố hay không?
public class Lesson331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println(n + " là số nguyên tố ");
        } else {
            System.out.println(n + " không là số nguyên tố");
        }
    }
}

