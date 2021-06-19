package Buoi3;

import java.util.Scanner;

//Hãy kiểm tra số nguyên dương n có phải số đối xứng hay không?
public class Lesson359 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        int temp=0;
        int m;
        m=n;
        for (int i=1;i<=n;i++){
            n/=10;
           temp=temp*10+(n%10);

        }
        if (temp==m){
            System.out.println(m+" llà số dối xứng");
        }else {
            System.out.println(m+"Không là số đối xứng");
        }
    }
}
