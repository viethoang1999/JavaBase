package LuyenTap.IfElse;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị 3 số nguyên");
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
