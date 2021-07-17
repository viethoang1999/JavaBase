package Buoi3;

import java.util.Scanner;

//Tìm chữ số nhỏ nhất của số nguyên dương n
public class Lesson352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int min=n%10 ;
        for (int i = 1; i <= n; i++) {
            i=n%10;
            if (i < min){
                min = i;
            }
            if (n==0){
                break;
            }
            n /= 10;
        }
        System.out.println(min);

    }
}
