package Buoi2;

import java.util.Scanner;

public class Datlinhcanh {
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
        int max=a;
        if (max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        System.out.println("Max của 3 sô a, b, c: "+max);
    }
}
