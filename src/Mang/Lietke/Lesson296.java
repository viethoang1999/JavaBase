package Mang.Lietke;

import java.util.Scanner;

//Liệt kê các số âm trong mảng 1 chiều các số nguyên
public class Lesson296 {
    public static void input(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
    }

    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

    public static void lietkesoam(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                System.out.println(a[i]);
            }
        }
    }

    //Hãy liệt kê các giá trị trong mảng các số nguyên có chữ số đầu tiên là chữ số lẻ
    public static boolean soledau(int n) {
        int dv;
        while (n >= 10) {
            dv = n % 10;
            n /= 10;
        }
        if (n % 2 == 0) {
            return false;
        }
        return true;
    }

    public static void lietkegtriledau(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (soledau(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
    //Hãy liệt kê các vị trí mà giá trị tại đó là giá trị lớn nhất trong mảng 1 chiều các số thực
    public static int max(int []a,int n){
        int max=a[0];
        for (int i=0;i<n;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    public static void gtrimax(int[]a,int n){
        int gtmax=max(a,n);
        for (int i=0;i<n;i++){
         if (a[i]==gtmax){
             System.out.println("giá trị lớn nhất là: "+a[i]+" có vị trí: "+i);
         }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        input(a, n);
        output(a, n);
        // lietkesoam(a,n);
        //lietkegtriledau(a, n);
        gtrimax(a,n);
    }
}

