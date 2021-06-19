package Buoi3;
import java.util.Scanner;
//Tính S(n) = x + x^2 + x^3 + … + x^n
public class Lesson312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= x;
            sum += multi;
        }
        System.out.println(multi);
        System.out.println("Tổng: " + sum);
    }
}
