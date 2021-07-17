package Buoi4;

import java.util.Scanner;

public class Arrray {

    public static void input(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }
    }

    public static void output(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int sum(int[] arr, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }
        return tong;
    }

    public static boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static int max(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr, int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int check(int[] arr,int n,int x){
        int vitri=-1;
        for (int i=0;i<n;i++){
            if (x==arr[i]){
                vitri=i;
                break;
            }
        }
        return vitri;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử muốn nhập: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        int count = countPrime(a, n);
        System.out.println("tông số lượng số nguyên tố : " + count);
        int tong = sum(a, n);
        System.out.println("Tổng: " + tong);
        int max = max(a, n);
        System.out.println("Max: " + max);
        int min = min(a, n);
        System.out.println("Min: " + min);
        int vitri=check(a,n,10);
        System.out.println(vitri);
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = new int[100];
//        int tong = 0;
//        for (int i = 0; i < a.length; i++) {
//            tong += a[i];
//            System.out.println(a[i]);
//        }
//        System.out.println(tong);
//
//


    }
}
