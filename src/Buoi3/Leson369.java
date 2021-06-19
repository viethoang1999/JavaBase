package Buoi3;

import java.util.Scanner;

//S(x, n) = 𝑥 − 𝑥3 + 𝑥5 + ⋯ + (−1)n𝑥2𝑛+1
public class Leson369 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x=scanner.nextInt();
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        int tich=1;
        int sum=0;
        for (int i=1;i<=n;i++){
            tich=(int)Math.pow(x,(2*i+1)*Math.pow(-1,i));
            sum+=tich;
        }
        System.out.println("Tổng là: "+sum);
    }
}
