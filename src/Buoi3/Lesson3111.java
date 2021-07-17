package Buoi3;

import java.util.Scanner;

//Viết chương trình in ra tam giác cân có độ cao h
//Tam giác cân đặc nằm giữa màn hình
//Tam giác cân rỗng nằm giữa màn hình
//Tam giác  vuông cân đặc
//Tam giác  vuông cân rỗng
public class Lesson3111 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i,j;
        System.out.println("Nhập n: " );
        int n=scanner.nextInt();
        // câu 1
        for ( i=1;i<=n;i++){
            for (j=1;j<=n-i;j++){
                if (j<2*i-1){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
                System.out.println("");
            }

        }
    }
}
