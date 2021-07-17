package Buoi3;

import java.util.Scanner;

//Viết chương trình nhập 3 số thực. Hãy thay tất cả các số âm bằng trị tuyệt đối của nó
public class Lesson395 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a=scanner.nextFloat();
        System.out.println("Nhập b: ");
        float b=scanner.nextFloat();
        System.out.println("Nhập c: ");
        float c=scanner.nextFloat();
        if (a<0){
            a=-a;
        }if (b<0){
            b=-b;
        }if (c<0){
            c=-c;
        }
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

    }
}
