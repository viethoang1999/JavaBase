package Buoi2;

import java.util.Scanner;

//Nhập vào 1 số cho biết số đó có phải số chính phương hay không
//input: nhập vào 1 số
//output: ktra số chính phương
//số chính phương x=căn bậc 2 của y
public class Sochinhphuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cần kiểm tra: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n<=0){
            System.out.println(n+" Không là số chính phương");
        }
        float x = (float) Math.sqrt(n);
        if (x == (int) x) {
            System.out.println(n + " là số chính phương");
        } else {
            System.out.println(n + "Không là số chính phương");
        }


    }
}
