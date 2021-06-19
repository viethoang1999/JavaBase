package Buoi3;

import java.util.Scanner;
// Tính S(n) = 1/2 + 3/4 + 5/6 + … + 2n + 1/ 2n + 2
public class Lesson38 {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập n: ");
        int n=scanner.nextInt();
        float sum=0;
        for (int i=0;i<=n;i++){
            sum+=(float)(2*i+1)/(2*i+2);
        }
        System.out.println("Tổng dãy số là: "+sum);
    }
}
