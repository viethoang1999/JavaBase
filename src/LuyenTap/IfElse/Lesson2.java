package LuyenTap.IfElse;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();
        if (number > 100) {
            System.out.println("Number: "+number);
            System.out.println("Số nguyên lớn hơn 100");
        }
        if (number == 100) {
            System.out.println("Number: "+number);
            System.out.println("100");
        }
        if (number < 100) {
            System.out.println("Number: "+number);
            System.out.println("Số nguyên nhỏ hơn 100");
        }

    }
}
