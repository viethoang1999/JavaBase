package Buoi3;

import java.util.Scanner;

//Hãy kiểm tra số nguyên dương n có toàn chữ số chẵn hay không?
public class Lesson357 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        boolean check = true;
        for (int i = 1; i <= n; i++) {
            if ((n % 10) % 2 != 0) {
                check = false;
                break;
            }
            n /= 10;
        }
        if (check == true) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
    }
}
