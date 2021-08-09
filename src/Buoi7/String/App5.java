package Buoi7.String;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi=scanner.nextLine();
        for (int i=0;i<chuoi.length();i++){
            chuoi=chuoi.replaceAll(i+"","");

        }
        System.out.println(chuoi);
    }
}
