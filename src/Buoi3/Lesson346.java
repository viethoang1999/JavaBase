package Buoi3;

import java.util.Scanner;

//Hãy đếm số lượng chữ số lẻ của số nguyên dương n
public class Lesson346 {
    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhập n: ");
//        int n=scanner.nextInt();
        int n=132459786;
        int count=1;
        for (int i=1;i<=n;i++){
           if (n%2!=0){
               count++;
           }
           n/=10;
        }
        System.out.println(count);
    }
}
