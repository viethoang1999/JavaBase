package Buoi3;

import java.util.Scanner;

//S(n) = 1 – 1/(1 + 2) + 1/(1 + 2 + 3)  + … + (-1)^n+1 * 1/(1 + 2 + 3+ … + n)
public class Lesson370 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        float sum=0;
        float thuong=0;
        for (int i=1;i<=n;i++){
            thuong+=i;
            sum+=1*Math.pow(-1,(float)(i+1))/thuong;
        }
        System.out.println("Tổng: "+sum);
    }
}
