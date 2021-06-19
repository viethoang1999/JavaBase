package Buoi3;

import java.util.Scanner;
//tính tổng 1+2+3+...+n
public class Lesson31 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Tổng dãy số là: "+sum);
    }
}
