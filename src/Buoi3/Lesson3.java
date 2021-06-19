package Buoi3;

import java.util.Scanner;

//tinh tông: 1+2+3+..+n
public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Nhập m: ");
        int m=scanner.nextInt();
//        int tich = 1;
//        int tong = 0;
//        float s = 0;
//        for (int i = 1; i <= n; i++) {
//            tich *= i;
//            tong += i;
//            s += (float) tong / tich;
//        }
//        System.out.println("Sum: "+s );
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
