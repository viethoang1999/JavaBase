package Buoi7.String;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi=scanner.nextLine();
        String dem="";
        for (int i=chuoi.length()-1;i>=0;i--){
            dem+=chuoi.charAt(i);
        }
        System.out.println(dem);
    }
}
