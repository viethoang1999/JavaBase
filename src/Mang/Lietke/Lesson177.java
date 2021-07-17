package Lietke;

import java.util.Scanner;

//177.	Hãy liệt kê các số giá trị trong mảng một chiều các sô thực thuộc đoạn
//[x,y] cho trước.
public class Lesson177 {
    public static void input(int []a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=scanner.nextInt();
        }
        System.out.println();
    }
    public static void output(int []a,int n){
        for (int i=0;i<n;i++){
            System.out.println("[a"+i+"]="+a[i]);
        }
    }

    public static void lietkegtritrongdoan(int []a,int n,int x,int y){
        for (int i=0;i<n;i++){
            if (x<=a[i]&&a[i]<=y){
                System.out.println("a["+i+"]= "+a[i]);
            }
        }
    }
    public static void main(String[] args) {
        int n=8;
        int []a=new int[n];
        input(a,n);
        output(a,n);
        lietkegtritrongdoan(a,n,1,7);
    }
}
