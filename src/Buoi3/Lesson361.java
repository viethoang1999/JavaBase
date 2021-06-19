package Buoi3;

import java.util.Scanner;

//Hãy kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái
//sang phải hay không?
public class Lesson361 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        boolean check = true;
        int socuoi = n % 10;
        n /= 10;
        for (int i = 1; i <= n; i++) {
            int sokecuoi = n % 10;
            n /= 10;
            if (sokecuoi < socuoi) {
                check = false;
                break;
            } else {
                socuoi = sokecuoi;
            }
        }
        if (check == true) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
    }
}

