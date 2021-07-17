package Buoi3;
//Viết hàm tính S = CanBacN(x)

import java.util.Scanner;

public class Lesson3107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        float n = scanner.nextFloat();
        System.out.println("Nhập x: ");
        float x = scanner.nextFloat();
        float s = 0;
        n = 1 / n;
        s = (float) Math.pow(x, n);
        System.out.println(s);
    }
}
