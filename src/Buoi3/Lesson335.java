package Buoi3;

import java.util.Scanner;

//Tính S(n) = √1 + √2 + √3 + ⋯ √𝑛 − 1 + √𝑛 có n dấu căn.
public class Lesson335 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        float sum=0;
        for (int i=1;i>1;i--){
            sum=(float) Math.sqrt(i+sum);
        }
        System.out.println("Tổng của S(n): "+sum);
    }
}
