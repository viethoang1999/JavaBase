package Buoi7.String;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi 1: ");
        String s1=scanner.nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String s2=scanner.nextLine();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        System.out.println(s1.indexOf(s2));

    }
}
