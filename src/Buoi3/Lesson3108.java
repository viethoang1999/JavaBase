package Buoi3;

import java.util.Scanner;

//in bảng cửu chương
public class Lesson3108 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
