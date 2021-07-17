package Buoi3;

import java.util.Scanner;

//Hãy đếm số lượng chữ số của số nguyên dương n
public class Lesson379 {
    public static void main(String[] args){
        System.out.println("Nhập n: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        int i=n;
        while ( i!=0){
            count++;
            i/=10;
        }
        System.out.println(count);
    }
}
