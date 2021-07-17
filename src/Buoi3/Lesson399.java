package Buoi3;

import java.util.Scanner;

//Viết chương trình nhập vào 3 số thực. Hãy in 3 số ấy ra màn hình theo thứ tự tang dần mà chỉ dùng tối đa 1 biến phụ
public class Lesson399 {
    public static int Sx(int a, int b, int c){
        return a;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a=scanner.nextInt();
        System.out.println("Nhap b: ");
        int b=scanner.nextInt();
        System.out.println("Nhap c: ");
        int c=scanner.nextInt();
        int temp=0;
        if (a>b){
              temp=a;
              a=b;
              b=temp;
        }if (a>c){
            temp=a;
            a=c;
            c=temp;
        }if (b>c){
            temp=b;
            b=c;
            c=temp;
        }
        System.out.printf("\nTang dan: %d %d %d ",a, b, c);
        System.out.println("Tang dan:  "+a+", "+b+", "+c);

    }
}
