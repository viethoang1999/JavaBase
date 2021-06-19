package Buoi3;

import java.util.Scanner;

//Hãy tính tổng các chữ số chẵn của số nguyên dương n
public class Lesson347 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhập n: ");
//        int n=scanner.nextInt();
        int n=12345678;
        int sum=0;
        for (int i=1;i<=n;i++){
            if(n%2==0){
                sum+=n%10;
            }
            if (n==0){
                break;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
