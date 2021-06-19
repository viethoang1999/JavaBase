package Buoi3;
import java.util.Scanner;
//S(n) = x + x^3 + x^5 + … + x^2n + 1
public class Lesson314 {
   public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("nhập x: ");
       int x=scanner.nextInt();
       System.out.println("nhập n: ");
       int n=scanner.nextInt();
       int sum=0;
       int multi=1;
       for (int i=1;i<=n;i++){
           //tính x^2n
           multi*=x+x;
          // multi=(int)Math.pow(x,(2*i+1));
           // tính tổng (x+x^2n)*x
           sum+=multi*x;
       }
       System.out.println("Tổng : "+sum);
   }
}
