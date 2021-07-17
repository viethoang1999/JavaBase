package Lietke;

import java.util.Scanner;

//Hãy liệt kê các  giá trị trong mảng 1 chiều
// các số nguyên có chữ số đầu tiên là số chẵn
public class Lesson192 {
    public static void input(int []a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("[a"+i+"]=");
            a[i]=scanner.nextInt();
        }
    }
    public static void output(int []a,int n){
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]= "+a[i]);
        }
    }
    public static boolean timchusochandau(int n){
        int dv;
        while (n>=10){
            dv=n%10;
            n/=10;
        }
        if (n%2==0){
            return true;
        }
        return false;
    }
    public static void lietkemangcogtrichandau(int[]a,int n){

        for (int i=0;i<n;i++){
            if (timchusochandau(a[i])){
                System.out.println(a[i]);
            }
        }

    }
    public static void main(String[] args) {
       int n=5;
       int[]a=new int[100];
       input(a,n);
       output(a,n);
//       int x=lietkemangcogtrichandau(a,n);
        lietkemangcogtrichandau(a,n);
    }
}
