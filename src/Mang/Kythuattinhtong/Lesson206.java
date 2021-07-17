package Mang.Kythuattinhtong;

import java.util.Scanner;

//Tính tổng các giá trị lớn hơn các giá trị xung quanh trong mảng 1 chiều các số thực
public class Lesson206 {
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

    public static int tonggtrixungquanh(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 && a[i] > a[i + 1]) {
                tong += a[i];
            } else if (i != 0 && a[i] > a[i + 1] && a[i] > a[i - 1]) {
                tong += a[i];
            } else if (i == n - 1 && a[i] > a[i - 1]) {
                tong += a[i];
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        int tong = tonggtrixungquanh(a, n);
        System.out.println(tong);
    }

}
