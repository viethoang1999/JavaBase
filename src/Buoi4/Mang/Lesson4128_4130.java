package Buoi4.Mang;

import java.util.Scanner;

//Viết hàm nhập, xuất mảng 1 chiều các số thực
public class Lesson4128_4130 {
 public static void input(float[] a,float n){
     Scanner scanner=new Scanner(System.in);
     for (int i=0;i<n;i++){
         System.out.println("a["+i+"]= ");
         a[i]=scanner.nextFloat();
         System.out.println();
     }
 }
 public static void output(float[] a,float n){
for (int i=0;i<n;i++){
    System.out.println(a[i]+" ");
}

 }

    public static void main(String[] args) {
        float [] a=new float[100];
        float n=5;
        input(a,n);
        output(a,n);
    }
}
