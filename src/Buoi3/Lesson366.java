package Buoi3;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.M;

//Giải phương trình 𝑎𝑥4 + 𝑏𝑥2 + 𝑐 = 0.
public class Lesson366 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhập c: ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                if (c == 0) {
                    int x = 0;
                    System.out.println("Phương trình có nghiệm x: " + x);
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("phương trình vô nghiệm");
            } else if (delta == 0) {
                float x1 = (-b / 2 * a);
                if (x1 < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else {
                    float x2 = (float) Math.sqrt((-b) / 2 * a);
                    float x3 = (float) -Math.sqrt((-b) / 2 * a);
                    System.out.println("Phương trình có 2 nghiệm x1: " + x2 + " và x2: " + x3);
                }
            } else {
                float x3 = (float) (-b + Math.sqrt(delta)) / 2 * a;
                float x4 = (float) (-b - Math.sqrt(delta)) / 2 * a;
                if (x3 < 0 && x4 < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (x3 < 0 && x4 > 0) {
                    System.out.println("Phương trình có nghiệm x:" + (Math.sqrt((-b) / 2 * a)) + " và x: " + (-Math.sqrt((-b) / 2 * a)));
                } else if (x3 > 0 && x4 < 0) {
                }else {
                    System.out.println("Phương trình có 4 nghiệm phân biệt x1: ");
                    System.out.println("Phương trình có 4 nghiệm phân biệt x2: ");
                    System.out.println("Phương trình có 4 nghiệm phân biệt x3: ");
                    System.out.println("Phương trình có 4 nghiệm phân biệt x4: ");
                }
            }

        }
    }
}
