package Lietke;

import java.util.Scanner;

// Hãy liệt kê các giá trị trong mảng 1 chiều các số nguyên có chữ số đầu tiên là chữ số lẻ
public class Lesson190 {
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

    public static boolean leDau(int n) {
        int dv = 0;
        while (n >= 10) {
            dv = n % 10;
            n /= 10;
        }
        if (n % 2 == 0) {
            return false;

        }
        return true;
    }
    public static void lietkevitrichusoledau(int[]a,int n){
        //int x=-1;
        for (int i=0;i<n;i++){
            if (leDau(a[i])){
               // x=a[i];
                System.out.println(a[i]);
            }
        }
      //  return x;
    }

    public static void main(String[] args) {
        int n=5;
        int []a=new int[100];
        input(a,n);
        output(a,n);
//       int x=lietkevitrichusoledau(a,n);
//        System.out.println(x);
        lietkevitrichusoledau(a,n);
    }
}
