package Buoi2;

import java.util.Scanner;

public class MaxMin {
    public static  void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a=scanner.nextInt();
        System.out.println("Nhập b: ");
        int b=scanner.nextInt();
        System.out.println("Nhập c: ");
        int c= scanner.nextInt();
        System.out.println("Nhập d: ");
        int d=scanner.nextInt();
        int max=a;
        if(max<b){
            System.out.println("Max: "+b);
        }else if(max<c){
            System.out.println("Max: "+c);
        }else {
            System.out.println("Max: "+d);
        }
        int min=a;
        if(min>b){
            System.out.println("Min: "+b);
        }else if(min>c){
            System.out.println("Min: "+c);
        }else {
            System.out.println("Min: "+d);
        }
    }
}
