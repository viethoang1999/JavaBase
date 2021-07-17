package Lietke;

import java.util.Scanner;

//178.	Hãy liệt kê các số có giá trị chẵn trong mảng một chiều các số nguyên thuộc đoạn [x,y] cho trước
public class Lesson178 {
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
    }

    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    public static void giatrichantrongdoan(int[] a, int n, int x, int y) {
        for (int i = 0; i < n; i++) {
            if (a[i] >= x && a[i] <= y) {
                if (a[i] % 2 == 0) {
                    System.out.println("a[" + i + "]= " + a[i]);
                }
            }
        }
    }

    public static void main(String[] arg) {
        int n = 5;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        System.out.println("Giá trị chẵn trong mảng : ");
        giatrichantrongdoan(a, n, 1, 4);
    }
}
