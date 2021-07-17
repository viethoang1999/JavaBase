package Mang.Lietke;

import java.util.Scanner;

//Cho mảng 1 chiều các số thực. Hãy viết hàm liệt kê tất cả các giá trị trong mảng có ít nhất 1 lận cận trái dấu với nó
public class Lesson182 {
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
            a[i] = scanner.nextInt();
        }
    }

    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

    public static void gtrithoaman(int[] a, int n) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if ((a[i] * a[i - 1] < 0) || (a[i] * a[i + 1] < 0)) {
                flag = 1;
                System.out.println("a[" + i + "]= " + a[i]);
            }
        }
        if (flag == 0) {
            System.out.println("không có giá trị");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[100];
        input(a, n);
        output(a, n);
        gtrithoaman(a, n);
    }
}
