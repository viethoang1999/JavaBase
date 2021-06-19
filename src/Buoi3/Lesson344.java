package Buoi3;

import java.util.Scanner;

//Hãy tính tổng các chữ số của số nguyên dương n
public class Lesson344 {
    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhập n: ");
//        int n=scanner.nextInt();
        int n=1234;
        int sum=0;
        int tem=n;
        for (int i=0;i<=n;i++){
            if(n>0){
                sum=sum+tem%10;
                tem=tem/10;


            }

        }
        System.out.println("Tổng các chữ số của số nguyên dương : "+sum);

    }
}
