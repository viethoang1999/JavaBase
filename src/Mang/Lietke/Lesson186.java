package Mang.Lietke;

import java.util.Scanner;

//Hãy liệt kê các vị trí chẵn lớn nhất trong mảng 1 chiều các số nguyên
public class Lesson186 {
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
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

    public static int chandau(int[] a, int n) {
        int x = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                x = a[i];
            }
        }
        return x;
    }

    public static int chanmax(int[] a, int n) {
        int chanMax = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && a[i] > chanMax) {
                chanMax = a[i];
            }
        }
        return chanMax;
    }

    public static void lietkegiatrichanmax(int[] a, int n) {
        int max = chanmax(a, n);
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] arg) {
        int n = 5;
        int[] a = new int[100];
        input(a, n);
        output(a, n);
        lietkegiatrichanmax(a, n);
    }
}
