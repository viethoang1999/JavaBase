package Buoi3;

import java.util.Scanner;

//Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N
public class Lesson390 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
//        System.out.println("Nhập m: ");
//        int m=scanner.nextInt();
        int m = 0;
        int sum = 0;
        do {
            m += 1;
            sum += m;
        } while (sum + m + 1 < n);
        System.out.println(sum);
        System.out.println(n);
        System.out.println(m);

    }
}
