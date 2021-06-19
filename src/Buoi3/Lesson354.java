package Buoi3;

import java.util.Scanner;

//Hãy đếm số lượng chữ số nhỏ nhất của số nguyên dương n
public class Lesson354 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập n: ");
        int n=scanner.nextInt();
        int min= n%10;
        int count=1;
        for (int i=1;i<=n;i++){
            i = n % 10;
            if(i == min)
                count++;
            if(i < min)
                min = i;
            n/=10;
        }
        System.out.println(count);
    }
}
