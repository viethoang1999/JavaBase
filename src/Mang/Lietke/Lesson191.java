package Mang.Lietke;

import java.util.Scanner;

//Hãy liệt kê các giá trị cực đại trong mảng 1 chiều các số thực.
// Một phần tử được gọi là cực đại khi lớn hơn các phần tử lân cận
public class Lesson191 {
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
    public static void lietkegiatricucdai(int[]a,int n){
        for (int i=0;i<n-1;i++){
            if (a[i]>a[i+1]&&a[i]>a[i-1]){
                System.out.println("a["+i+"]= "+a[i]);
            }
        }
    }
    public static void main(String[] args){
        int n=5;
        int[]a=new int[100];
        input(a,n);
        output(a,n);
        lietkegiatricucdai(a,n);

    }

}
