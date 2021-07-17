package Mang.Lietke;

import java.util.Scanner;

//Hãy liệt kê các vị trí trong mảng 1 chiều các số thực mà giá trị tại đó bằng giá trị âm đầu tiên trong mảng
public class Lesson184 {
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

    public static int gtriamdau(int[] a, int n) {
        int x = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                x = a[i];
                break;
            }
        }
        return x;
    }

    public static void lietKeGiatri(int[] a, int n) {
        int amdau = gtriamdau(a, n);
        for (int i = 0; i < n; i++) {
            if (a[i] == amdau) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        lietKeGiatri(a, n);
    }
}
