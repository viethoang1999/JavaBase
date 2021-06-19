package Buoi2;

import java.util.Scanner;

//    Nhập vào 3 cạnh của tam giác hãy cho biết tam giác vừa nhập là tam giác gì
// input: nhập vào 3 cạnh tam giác
// output: kiểm tra tam giác
public class Tamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();
        if ((a + b > c) || (a + c > b) || (b + c) > a) {
            System.out.println("Đây là tam giác");
            if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                System.out.println("Đây là tam giác vuông!");
            } else if (a == b && a == c && b == c) {
                System.out.println("Đây là tam giác đều");

            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Đây là tam giác cân");
            } else if ((a * a > b * b + c * c) || (b * b > c * c + a * a) || (c * c > b * b + a * a)) {
                System.out.println("Đây là tam giác tù");
            }
        } else {
            System.out.println("Đây ko phải là tam giác");
            return;
        }
    }
}


