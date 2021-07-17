package Lietke;

import java.util.Scanner;

//Cho mảng 1 chiều các số nguyên. Hãy viết hàm liệt kê các giá trị chẵn có ít nhất 1 lân cận cũng là giá trị chẵn
public class Lesson181 {
    public static void input(int[]a,int n){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]=");
            a[i]=scanner.nextInt();
        }
    }
    public static void output(int[]a,int n){
        for (int i=0;i<n;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    public static void gtrithoaman(int[]a,int n){
        int flag=0;
        for (int i=0;i<n;i++){
            if (a[i]%2==0&&a[i]==a[i+1]){
                flag=1;
                System.out.println("a["+i+"]= "+a[i]);
            }
        }
        if (flag==0){
            System.out.println("không tìm thấy");
        }
    }
    public static void main(String[]arg){
        int n=5;
        int []a=new int[100];
        input(a,n);
        output(a,n);
        gtrithoaman(a,n);

    }
}
