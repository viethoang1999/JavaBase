package Buoi3;

import java.util.Scanner;

//Viết chương trình in ra hình chữ nhật có kích thước m x n
//Hình chữ nhật đặc
//Hình chữ nhật rỗng
public class Lesson3112 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập m: ");
        int m=scanner.nextInt();
        System.out.println("nhập n: ");
        int n=scanner.nextInt();
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
