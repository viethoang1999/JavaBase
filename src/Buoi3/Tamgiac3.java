package Buoi3;

import java.util.Scanner;

public class Tamgiac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i - 1; j++) {
                if (j >= n - i + 1) {
                    if (i==1||i==n||j==n-i+1||j==n+i-1){
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
