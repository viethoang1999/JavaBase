package Buoi3;

import java.util.Scanner;
//tinh tổng 1^2+2^2+...+n^2;
public class Lesson32 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        int sum=0;
        int tich=1;
        for(int i=1;i<=n;i++){
            tich*=n;
            sum+=tich;
        }
        System.out.println(sum);
    }
}
