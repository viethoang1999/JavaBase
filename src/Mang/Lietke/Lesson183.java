package Lietke;

import java.util.Scanner;

//Hãy liệt kê các vị trí mà giá trị tại đó là giá trị tại đó là giá trị lớn nhất trong mảng 1 chiều các số thực
public class Lesson183 {
    public static void input(int []a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]=");
            a[i]=scanner.nextInt();
        }
    }
    public static void output(int[] a,int n){
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    public static int gtrimax(int[]a,int n){
        int max=a[0];
        for (int i=0;i<n;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[]arg){
        int n=5;
        int[]a=new int[100];
        input(a,n);
        output(a,n);
        int max=gtrimax(a,n);
        System.out.println("Giá trị lớn nhất: "+max);

    }


}
