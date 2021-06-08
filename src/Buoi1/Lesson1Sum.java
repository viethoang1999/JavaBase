package Buoi1;

import java.util.Scanner;

public class Lesson1Sum {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số có 5 chữ số: ");
        n=scanner.nextInt();
        int hdv=n%10;
        n/=10;
        int hc=n%10;
        n/=10;
        int ht=n%10;
        n/=10;
        int hn=n%10;
        n/=10;
        int tong =hdv+hc+ht+hn+n;
        System.out.println("Tổng các chữ của n: "+tong);
    }


}
