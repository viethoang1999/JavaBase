package Buoi3;

import java.util.Scanner;

//Liệt kê tất cả các ước số của số nguyên dương n
public class Lesson378 {
    public static void uoc(int n){
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        uoc(n);


    }

}
