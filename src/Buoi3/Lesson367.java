package Buoi3;

import java.util.Scanner;

//Tính S(x, n) = 𝑥 − 𝑥2 + 𝑥3 + ⋯ + (−1)n+1𝑥𝑛
public class Lesson367 {
    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhập x: ");
//        int x=scanner.nextInt();
//        System.out.println("Nhập n: ");
//        int n=scanner.nextInt();
        int x=3;
        int n=2;
        x=-x;
        int sum=0;
        int tich=1;
        for (int i=1;i<=n;i++){
            tich*=x;
            sum+=tich;
        }
        System.out.println(-sum);
    }
}
