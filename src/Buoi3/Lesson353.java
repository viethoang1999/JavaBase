package Buoi3;

import java.util.Scanner;

//Hãy đếm số lượng chữ số lớn nhất của số nguyên dương n
public class Lesson353 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=scanner.nextInt();
        int count=1;
        int max=0;
        for (int i=1;i<=n;i++){
              if (n%10==max){
                  count++;
              }
              if(n%10>max){
                  max=n%10;
              }
            n/=10;
        }
        System.out.println(count);
    }
}
