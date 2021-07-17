package Buoi3;

import java.util.Scanner;

//Tìm ước số chung lớn nhất của 2 số nguyên dương
public class Lesson392 {
    public static int UCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(UCLN(a, b));

    }
}
