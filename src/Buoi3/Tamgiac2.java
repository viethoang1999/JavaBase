package Buoi3;

import java.util.Scanner;

public class Tamgiac2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cd=scanner.nextInt();
        int cr=scanner.nextInt();
        for (int i =1;i<=cd;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
