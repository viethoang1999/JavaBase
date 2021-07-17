package Mang.Lietke;

import java.util.Scanner;

//Hãy liệt kê các vị trí mà giá trị tại các vị trí đó bằng giá trị dương nhỏ nhất trong mảng 1 chiều các số thực
public class Lesson185 {
    public static void input(int[]a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= ");
            a[i]=scanner.nextInt();
        }
        System.out.println();
    }
    public static void output(int[]a,int n){
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    public static int gtriduongau(int []a,int n){
        int x=-1;
        for (int i=0;i<n;i++){
            if (a[i]>0){
                x=a[i];
            }
        }
        return x;
    }
    public static int gtriduongmin(int[]a,int n){
        int duongmin=gtriduongau(a,n);
        for (int i=0;i<n;i++){
            if (a[i]>0&&a[i]<duongmin){
                duongmin=a[i];
            }
        }
        return duongmin;
    }
    public static void lietkevtriduongmin(int[]a,int n){
        int duongnhonhat=gtriduongmin(a,n);
        for (int i=0;i<n;i++){
            if (a[i]==duongnhonhat){
                System.out.println("giá trị dương min "+i);
            }
        }
    }
    public static void main(String[]arg){
        int n=5;
        int []a=new int[100];
        input(a,n);
        output(a,n);
        lietkevtriduongmin(a,n);
    }
}
