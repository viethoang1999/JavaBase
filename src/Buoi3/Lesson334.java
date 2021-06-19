package Buoi3;
//Tính S(n) = √𝑛 + √𝑛 − 1 + √𝑛 − 2 + ⋯ √2 + √1 có n dấu căn.
import java.util.Scanner;

public class Lesson334 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        float sum=0;
        for (int i=1;i<=n;i++){
         sum=(float)Math.sqrt(sum+i);
        }
        System.out.println(sum);
    }
}
