package Buoi4.Mang.LuyenTap.Luyentuduy;

import java.util.Scanner;

//Tìm số chính phương đầu tiên trong mảng 1 chiều các số nguyên
public class Lesson162 {
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
            System.out.println("a["+i+"]= "+a[i]);
        }
    }
    public static boolean checksochinhphuong(int n){
        boolean flag=false;
        for (int i=1;i<n;i++){
            if (i*i==n){
                flag=true;

            }
        }
        return flag;
    }
    public static int sochinhphgdau(int[]a,int n){
        int x=-1;
        for (int i=0;i<n;i++){
            if (checksochinhphuong(a[i])){
                x=a[i];
                break;
            }
        }
        return x;
    }

    //Cho mảng 1 chiều các số nguyên. Hãy tìm giá trị đầu tiên thỏa mãn tính chất số gánh
//    public static int thoamanganh(int[]a,int n){
//        int sodao=0;
//        int temp=n;
//        while (temp!=0){
//            sodao*=10+temp%10;
//            temp/=10;
//        }
//        if (n==sodao){
//
//        }
//
//    }
    public static void main(String[] arg){
        int n=5;
        int[]a=new int[n];
        input(a,n);
        output(a,n);
        int x=sochinhphgdau(a,n);
        System.out.println(x);
    }
}
