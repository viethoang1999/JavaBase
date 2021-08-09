package Buoi7.String;

import java.util.Scanner;

//Cho xâu s và ký tự c được nhập từ bàn phím.
// Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s.
public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Nhập c: ");
        char c = scanner.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == c) {
                dem++;
            }
        }
        System.out.println(dem);

    }
}
