package Buoi7.String;

import java.util.Scanner;

//Cho xâu s được nhập vào từ bàn phím, bạn hãy viết chương trình hiển
// thị ra màn hình số các ký tự in hoa trong xâu s.
public class App6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi=scanner.nextLine();
        int dem=0;
        for (int i=0;i<chuoi.length();i++){
            if (chuoi.charAt(i)>='A'&&chuoi.charAt(i)<='Z'){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
