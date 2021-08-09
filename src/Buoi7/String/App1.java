package Buoi7.String;

import java.util.Scanner;

//Cho xâu s và số nguyên k được nhập từ bàn phím.
// Bạn hãy viết chương trình in ra màn hình ký tự thứ k trong xâu s.
//---------------------------------
//Cho xâu s và ký tự c được nhập từ bàn phím.
// Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s.
public class App1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String chuoi=scanner.nextLine();
        System.out.println("Nhập k: ");
        int k=scanner.nextInt();
        System.out.println(chuoi.charAt(k));
        System.out.println("-------------------------------");
    }
}
