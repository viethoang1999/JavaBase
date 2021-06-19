package Buoi3;

import java.util.Scanner;

//Tính S(n) = 1 + 1/1 + 2 + 1/ 1 + 2 + 3 + ….. + 1/ 1 + 2 + 3 + N
public class Lesson315 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        float sum=0;
        float div=0;
        for(int i=1;i<=n;i++){
            div+=i;
            sum+=1/div;
        }
        System.out.println("Tổng là: "+sum);

    }
}
