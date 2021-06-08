package Buoi1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a= scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập b: ");
        int b=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập c: ");
      int c=scanner.nextInt();
       scanner.nextLine();
//        int maxNumber,minNumber;
//        maxNumber=minNumber=a;
//        if (b>maxNumber){
//
//            maxNumber=b;
//        }
//        if (c>maxNumber){
//            maxNumber=c;
//        }
//        System.out.println("maxNumber: "+maxNumber);
//
//        if (b<minNumber){
//            minNumber=b;
//        }
//        if (c<minNumber){
//            minNumber=c;
//        }
//        System.out.println("minNumber: "+minNumber);

        int max1=a>b?a:b;
        int max2=c>max1?c:max1;
        int min1=a<b?a:b;
        int min=c<min1?c:min1;
        System.out.println(max2);
        System.out.println(min);

    }
}
