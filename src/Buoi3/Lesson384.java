package Buoi3;

import java.util.Scanner;

// Viết chương trình giải và biện luận phương trình bậc nhất ax + b = 0
public class Lesson384 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = scanner.nextInt();
        System.out.println("Nhập b: ");
        float b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            }
            System.out.println("Phương trình vô nghiệm");
        } else {
            float x = -b / a;
            System.out.println("Phương trình có nghiệm x: " + x);
        }
    }
}
