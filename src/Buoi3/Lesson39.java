package Buoi3;

import java.util.Scanner;

//Tính T(n) = 1 x 2 x 3…x N
public class Lesson39 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        int multi=1;
        for (int i=1;i<=n;i++){
            multi*=i;
        }
        System.out.println("Tích của dãy số là: "+multi);
    }

}
