package Buoi7;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class VungNho {
    public static void in(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
    }

    public static void nhap(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[] a = new int[n];
        in(a,n);
        nhap(a,n);

    }
}
