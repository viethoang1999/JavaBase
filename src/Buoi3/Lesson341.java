package Buoi3;

import java.util.Scanner;

// Tính S(n) = 1 / (1 + 1 / ( 1 + 1 / (…. 1 + 1 / 1 + 1))) có n dấu phân số
public class Lesson341 {
    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhập n: ");
//        int n=scanner.nextInt();
        int n=3;
        float sum=(float) (1 + 1.0 / (1 + 1));
        for (int i=2;i<=n;i++){
            sum=  (float) (1+ 1.0/sum);
        }
        System.out.println ("Sum: "+sum);
    }
}
