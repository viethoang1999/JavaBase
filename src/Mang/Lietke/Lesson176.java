package Lietke;

import java.util.Scanner;

public class Lesson176 {
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
    }

    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    public static void lietkesoam(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                System.out.println("a[" + i + "]= " + a[i]);
            }
        }
    }

    public static void main(String[] arg) {
        int n = 5;
        int a[] = new int[n];
        input(a, n);
        output(a, n);
        lietkesoam(a, n);
    }
}
