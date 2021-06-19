package Buoi3;

import java.util.Scanner;

//Tính S(n) = 𝑛+1√𝑛 + 𝑛√𝑛 − 1 + 3√2 + √1 có n dấu căn
public class Lesson338 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        float sum = 0;
       // sum=(float)Math.pow(1.0,1.0/2);
        for (int i = 1; i <= n; i++) {
            sum = (float) Math.pow((i + sum) , 1.0 / (i+1) );
        }
        System.out.println("Sum: " + sum);
    }
}
