package Buoi4;

import java.util.Scanner;

//Liệt kê tất cả các số nguyên tố nhỏ hơn n
public class Lesson4119 {
    public static boolean checkSTT(int n) {
        //n<2 ko là số nguyên tố
        if (n < 2) {
            return false;
        } else {
            //check khi n>=2
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i < n; i++) {
            if (checkSTT(i)) {
                System.out.println(i);
            }
        }
    }
}
