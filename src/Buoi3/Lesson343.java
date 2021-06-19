package Buoi3;

import java.util.Scanner;

//Hãy đếm số lượng chữ số của số nguyên dương n
public class Lesson343 {
public static void main(String[] args){
//    Scanner scanner=new Scanner(System.in);
//    System.out.println("Nhập n: ");
//    int n=scanner.nextInt();
    int n=123456789;
    int count=1;
//    while (n!=0){
//        n/=10;
//        count++;
//    }
    for (int i=1;i<=n;i++){
        if(n>0){
            n/=10;
            count++;


        }
    }
    System.out.println("Số các chữ số: "+count);
}
}
