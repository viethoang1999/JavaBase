package Buoi3;

import java.util.Scanner;

//Viết chương trình kiểm tra 1 số có phải là số nguyên tố hay không
public class Lesson393 {
    public static boolean KTSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Nhập n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (KTSNT(n)) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không là số nguyên tố");
        }
    }
}
