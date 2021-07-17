package Buoi4.Mang;

import java.util.Scanner;

public class Lesson4125_127 {
    //hàm nhập mảng
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        System.out.println();
    }

    //hàm xuất mảng
    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + a[i]);

        }
        System.out.println();
    }
//kiểm tra số nguyên tố
    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
// đếm số nguyên tố
    public static int countArray(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (checkSNT(a[i]) && a[i] < 100) {
                count++;
            }

        }
        return count;
    }
// tổng các số âm
    public static int sumAm(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                sum += a[i];
            }
        }
        return sum;
    }
// sắp xếp giá trị tăng dần trong mảng
    public static void sapxeptangdan(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
// sắp xếp giá trị giảm dần trong mảng
    public static void sapxepgiamdan(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
// giắ trị lớn nhất trong mảng
    public static int gtmax(int[] a, int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
// giá trị nhỏ nhất trong mảng
    public static int gtmin(int[] a, int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
//vị tri của x trong mảng
    public static int findPosition(int[] a, int n, int x) {
        int vitri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                vitri = i;
                break;
            }
        }
        return vitri;
    }
//vị trí số dương đầu tiên
    public static int findSoDuong(int[] a, int n) {
        int vitri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                vitri = i;
                break;
            }
        }
        return vitri;
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 5;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        int dem = countArray(a, n);
        System.out.println("Số nguyên tố xuất hiện trong mảng là:  " + dem);
        int sum = sumAm(a, n);
        System.out.println("Tổng số âm: " + sum);
        int vitri = findPosition(a, n, x);
        System.out.println("vị tri của x trong mảng là: " + vitri);
        int vitrisoduongdautien = findSoDuong(a, n);
        System.out.println("vị trí số dương đầu tiên là: " + vitrisoduongdautien);
        sapxeptangdan(a, n);
        output(a, n);
        sapxepgiamdan(a, n);
        output(a, n);
        int max = gtmax(a, n);
        System.out.println("giá trị lớn nhất: " + max);
        int min = gtmin(a, n);
        System.out.println("giá trị nhỏ nhất: " + min);

    }
}
