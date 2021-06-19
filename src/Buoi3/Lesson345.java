package Buoi3;

import java.util.Scanner;

public class Lesson345 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhập n: ");
//        int n=scanner.nextInt();
        int n = 1234;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= n % 10;
            n /= 10;
        }
        System.out.println("Multi: " + multi);
    }
}
